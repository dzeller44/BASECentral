package controllers;

import static play.data.Form.form;

import java.awt.Desktop;
import java.io.FileWriter;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Calendar;
import javax.inject.Inject;
import javax.persistence.Id;

import java.lang.reflect.Field;

import org.apache.commons.mail.EmailException;
import com.opencsv.CSVWriter;

import controllers.Application.FindUser;
import controllers.helpers.AccessMiddleware;
import managers.SessionData;
import models.AuditLog;
import models.Comment;
import models.Intake;
import models.IntakeAudit;
import models.IntakeEdit;
import models.Lookup;
import models.RemovedIntake;
import models.RemovedUser;
import models.Service;
import models.User;
import models.enums.RoleType;
import models.utils.AppException;
import models.utils.Mail;
import play.Configuration;
import play.Logger;
import play.core.j.HttpExecutionContext;
import play.data.Form;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.data.validation.ValidationError;
import play.i18n.Messages;
import play.libs.mailer.MailerClient;
import play.mvc.Controller;
import play.mvc.Result;
import utils.ScheduleEmail;
import views.html.index;
import views.html.auth;
import views.html.accessdenied;
import views.html.useraccount;
import views.html.export;
import views.html.exportready;
import views.html.contact;
import views.html.contactsent;
import views.html.genericsuccess;

import views.html.intake.intake;
import views.html.intake.intakecreated;
import views.html.intake.intakeupdated;
import views.html.intake.editintake;
import views.html.intake.searchintake;
import views.html.intake.deleteintakeconfirm;
import views.html.intake.deletedintake;

import views.html.manager.manager;

import views.html.admin.searchusers;
import views.html.admin.admin;
import views.html.admin.usermaint;
import views.html.admin.getuser;
import views.html.admin.showuser;
import views.html.admin.displayuser;
import views.html.admin.openuser;
import views.html.admin.saveduser;
import views.html.admin.deleteconfirm;
import views.html.admin.deleteduser;
import views.html.admin.lookup;
import views.html.admin.editlookup;
import views.html.admin.lookups;
import views.html.admin.lookupcreated;
import views.html.admin.lookupupdated;

import views.html.user.user;

import views.html.reports.charts1;
import views.html.reports.charts2;
import views.html.reports.chartsbar;

public class Application extends Controller {

	public static Result GO_ADMIN = redirect(routes.Application.adminHome());

	public static Result GO_DASHBOARD = redirect(routes.Dashboard.index());

	public static Result GO_HOME = redirect(routes.Application.index());

	public static Result GO_BAMANAGER = redirect(routes.Application.adminHome());

	public static Result GO_SEMANAGER = redirect(routes.Application.adminHome());

	public static Result GO_BA = redirect(routes.Application.userHome());

	public static Result GO_SE = redirect(routes.Application.userHome());

	public static Result ACCESS_DENIED = redirect(routes.Application.accessDenied());

	public static final String delimiter = "~~";

	public static String openIntakeKey = "";

	@Inject
	MailerClient mailerClient;

	public static class Contact {

		public String name;

		public String email;

		public String message;

	}

	public static class FindUser {

		public String approved;

		public String email;

		public String searchText;

		public String fullname;

		public String role;

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}

		/*
		 * public String validate() {
		 * 
		 * User user = User.findByEmail(email); if (user != null) { // Open user
		 * record... return null; } else { // Display message... return
		 * Messages.get("search.user.bademail"); } }
		 */
	}

	public static class IntakeAdd {

		public String projectid;

		public String projectname;

		public String summary;

		public String projectstatus;

		public String agency;

		public String requestor;

		public Date daterequested;

		public String howrequested;

		public Date initialmeetdate;

		public String initialmeetcomments;

		public String requeststatus;

		public String bamanager;

		public String bamanageremail;

		public String bamanagerkey;

		public Date baassigneddate;

		public String baassigned;

		public String baassignedemail;

		public String baassignedkey;

		public String badeliverable;

		public String bataskstatus;

		public Integer batimeestimate;

		public Date batargetdate;

		public Date bacompletiondate;

		public String semanager;

		public String semanageremail;

		public String semanagerkey;

		public Date seassigneddate;

		public String seassigned;

		public String seassignedemail;

		public String seassignedkey;

		public String sedeliverable;

		public String setaskstatus;

		public Integer setimeestimate;

		public Date setargetdate;

		public Date secompletiondate;

		public Date datecreated;

		public String intakekey;

		public String userkey;

		public String editkey;

		public String updatedby;

		public String toStartEvolution;

		public Date dateupdated;

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}

		/**
		 * Validate the authentication.
		 *
		 * @return null if validation ok, string with details otherwise
		 */
		public String validate() {

			return null;
		}
	}

	public static class LookupAdd {

		@Constraints.Required
		public String lookuptype;

		@Constraints.Required
		public String name;

		public String description;

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}

		/**
		 * Validate the authentication.
		 *
		 * @return null if validation ok, string with details otherwise
		 */
		public String validate() {

			return null;
		}
	}

	/**
	 * Login class used by Login Form.
	 */
	public static class Login {

		@Constraints.Required
		public String email;
		String errMessage = "";

		@Constraints.Required
		public String password;

		public String intakeKey;

		public String validate() {
			Logger.debug("Login - validate()");
			User user = null;
			try {
				user = User.authenticate(email, password);
				if (user == null) {
					errMessage = Messages.get("invalid.user.or.password");
					return errMessage;
				} else if (!user.validated) {
					errMessage = Messages.get("account.not.validated.check.mail");
					return errMessage;
				}
				SessionData createUserSession = AccessMiddleware.createUserSession(user);
				AuditLog.setLog(user.fullname, user.getEmail(), "Login", "validate()", "User authenticated",
						user.fullname);
			} catch (AppException e) {
				errMessage = Messages.get("error.technical");
				return errMessage;
			}
			return null;
		}
	}

	public static class Register {

		public String approved;

		@Constraints.Required
		public String email;

		@Constraints.Required
		public String fullname;

		@Constraints.Required
		public String inputPassword;

		// Custom fields...
		@Constraints.Required
		public String role;

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}

		/**
		 * Validate the authentication.
		 *
		 * @return null if validation ok, string with details otherwise
		 */
		public String validate() {
			if (isBlank(email)) {
				return "Email is required";
			}

			if (isBlank(fullname)) {
				return "User name is required";
			}

			if (isBlank(inputPassword)) {
				return "Password is required";
			} else {
				// Need to make sure we have:
				// 8 characters; 1 Uppercase character; 1 Lowercase character; 1
				// Number; 1 Special Character
				String passwordPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$!%^&+=])(?=\\S+$).{8,}";
				if (!inputPassword.matches(passwordPattern)) {
					return Messages.get("password.message");
				}
			}

			if (isBlank(role)) {
				return "Account Role is required";
			}

			return null;
		}
	}

	public static class RegisterUser {

		@Constraints.Required
		public String fullname;

		@Constraints.Required
		public String email;

		public String rolename;

		private boolean isBlank(String input) {
			return input == null || input.isEmpty() || input.trim().isEmpty();
		}

		public String validate() {
			if (isBlank(email)) {
				return "Email is required";
			}

			if (isBlank(fullname)) {
				return "User name is required";
			}

			if (isBlank(rolename)) {
				return "Role is required";
			}

			return null;
		}
	}

	public Result accessDenied() {
		// Get the current role and compare...
		String roleToDisplay = "";
		RoleType currentRole = AccessMiddleware.getSessionRole();
		if (currentRole != null) {
			roleToDisplay = currentRole.getRoleTextName(currentRole);
		}
		// Direct to access denied...
		return ok(accessdenied.render(roleToDisplay));
	}

	public Result addIntake() {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			List<Lookup> lookups = Lookup.find.all();
			List<User> users = User.find.all();
			return ok(intake.render(form(IntakeAdd.class), lookups, users));
		}
	}

	public Result addComments(String intakekey, String comments) {
		// Grab what we need to display on intake form...
		Form<IntakeAdd> intakeEntry = form(IntakeAdd.class).bindFromRequest();
		List<Lookup> lookups = Lookup.find.all();
		List<User> users = User.find.all();
		String userkey = AccessMiddleware.getSessionUserKey();
		User user = User.findByUserKey(userkey);
		Intake intake = Intake.findByIntakeKey(intakekey);
		List<IntakeAudit> intakeAudits = IntakeAudit.findByIntakeKey(intakekey);
		List<Comment> allComments = Comment.getAllByIntakeKey(intakekey);

		// Let's create a Comment record...
		Comment comment = new Comment();
		comment.intakekey = intakekey;
		comment.comment = comments;
		comment.commentkey = comment.createCommentKey();
		comment.datecreated = new Date();
		if (user != null) {
			comment.author = user.fullname;
			comment.authoremail = user.getEmail();
			comment.userkey = userkey;
		}
		comment.save();

		// Notify team they have been assigned...
		try {
			notifyTeam(intake, comment, "Comment");
		} catch (MalformedURLException m) {
			m.printStackTrace();
		}

		// Need to refresh the page...
		String url = "../openintake/" + intakekey + "#tabCM";

		// return ok(editintake.render(intakeEntry, lookups, users, intake,
		// user, intakeAudits, allComments));
		return redirect(url);

	}

	public Result addLookup() {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			List<Lookup> lookups = Lookup.find.all();
			return ok(lookup.render(lookups));
		}
	}

	public Result adminHome() {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			return ok(admin.render(form(Login.class)));
		}
	}

	public Result adminSearch() {
		// NEED TO CORRECT THIS -- NEED NEW ROUTE/VIEW
		List<User> users = User.find.all();
		return ok(searchusers.render(users));
	}

	/**
	 * Handle login form submission.
	 *
	 * @return Dashboard if auth OK or login form if auth KO
	 */
	public Result authenticate() {
		String errorMessage = "";

		Form<Login> loginForm = form(Login.class).bindFromRequest();
		Logger.debug("authenticate");
		Form<Register> registerForm = form(Register.class);

		if (loginForm.hasErrors()) {
			Logger.debug("authenticate - bad request");
			// return badRequest(index.render(registerForm, loginForm));
			return badRequest(auth.render(loginForm));
			// return badRequest(index.render());
			// return badRequest();
		} else {
			Logger.debug("authenticate - good request");
			session("email", loginForm.get().email);

			boolean isAuth = AccessMiddleware.isAuthenticated();
			RoleType role = AccessMiddleware.getSessionRole();

			// Let's see if we need to redirect...
			String intakeKey = openIntakeKey;
			if (intakeKey != null) {
				if (!intakeKey.equals("")) {
					// Let's redirect...
					// First remove the session variable...
					openIntakeKey = "";
					return redirect(routes.Application.openIntake(intakeKey));
				}
			}

			switch (role) {
			case BA:
				return GO_BA;

			case SE:
				return GO_SE;

			case BAMANAGER:
				return GO_BAMANAGER;

			case SEMANAGER:
				return GO_SEMANAGER;

			case ADMIN:
				return GO_ADMIN;

			default:
				return GO_HOME;

			}
		}

	}

	public Result contact() {
		return ok(contact.render(form(Contact.class)));
	}

	public Result contactSend() throws EmailException {
		Form<Contact> contact = form(Contact.class).bindFromRequest();

		String name = contact.get().name;
		String email = contact.get().email;
		String message = contact.get().message;

		String subject = Messages.get("mail.contact.subject");
		String messageToSend = new String(
				"Message from: " + name + "\n at email address: " + email + "\n Message: " + message);

		String to = Messages.get("mail.admin.address");

		// create and send the email to the admin shared mailbox, containing
		// name, email and message from contact form.
		// send a copy to the email entered in the contact form.

		Mail.Envelop envelop = new Mail.Envelop(subject, messageToSend, to);
		Mail.Envelop envelop2 = new Mail.Envelop(subject, messageToSend, email);
		Mail mailer = new Mail(mailerClient);
		mailer.sendMail(envelop);
		mailer.sendMail(envelop2);

		return ok(contactsent.render());
	}

	public Result deleteIntake(String intakekey) {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			// Locate the user record and delete...
			Intake intake = Intake.findByIntakeKey(intakekey);
			if (intake != null) {
				// Open user record...
				Logger.debug("Application.deleteUser: Found Intake based on " + intakekey);
			} else {
				// Display message...
				Logger.debug("Application.deleteUser: No Intake found based on " + intakekey);
			}

			// Create record in removedintake table
			// Capture user and date/time
			// Remove from user table...
			RemovedIntake removedIntake = new RemovedIntake();
			removedIntake.projectid = intake.projectid;
			removedIntake.agency = intake.agency;
			removedIntake.requestor = intake.requestor;
			removedIntake.projectname = intake.projectname;
			removedIntake.summary = intake.summary;
			removedIntake.projectstatus = intake.projectstatus;
			removedIntake.daterequested = intake.daterequested;
			removedIntake.howrequested = intake.howrequested;
			removedIntake.requeststatus = intake.requeststatus;
			removedIntake.initialmeetdate = intake.initialmeetdate;
			removedIntake.initialmeetcomments = intake.initialmeetcomments;
			removedIntake.bamanager = intake.bamanager;
			removedIntake.bamanageremail = intake.bamanageremail;
			removedIntake.bamanagerkey = intake.bamanagerkey;
			removedIntake.baassigneddate = intake.baassigneddate;
			removedIntake.baassigned = intake.baassigned;
			removedIntake.baassignedemail = intake.baassignedemail;
			removedIntake.baassignedkey = intake.baassignedkey;
			removedIntake.badeliverable = intake.badeliverable;
			removedIntake.batargetdate = intake.batargetdate;
			removedIntake.semanager = intake.semanager;
			removedIntake.semanageremail = intake.semanageremail;
			removedIntake.semanagerkey = intake.semanagerkey;
			removedIntake.seassigneddate = intake.seassigneddate;
			removedIntake.seassigned = intake.seassigned;
			removedIntake.seassignedemail = intake.seassignedemail;
			removedIntake.seassignedkey = intake.seassignedkey;
			removedIntake.sedeliverable = intake.sedeliverable;
			removedIntake.setargetdate = intake.setargetdate;
			removedIntake.bataskstatus = intake.bataskstatus;
			removedIntake.setaskstatus = intake.setaskstatus;
			removedIntake.batimeestimate = intake.batimeestimate;
			removedIntake.setimeestimate = intake.setimeestimate;
			removedIntake.bacompletiondate = intake.bacompletiondate;
			removedIntake.secompletiondate = intake.secompletiondate;
			removedIntake.datecreated = intake.datecreated;
			removedIntake.intakekey = intake.intakekey;
			removedIntake.dateRemoved = new Date();
			removedIntake.removedBy = AccessMiddleware.getSessionEmail();
			removedIntake.removedbyuserkey = AccessMiddleware.getSessionUserKey();
			removedIntake.save();

			// Delete the record...
			intake.delete();

			AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "Intake",
					"deleteIntake()", "Intake DELETED", AccessMiddleware.getSessionID());

			return ok(deletedintake.render());
		}
	}

	public Result deleteIntakeConfirm(String intakekey) {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			Intake intake = Intake.findByIntakeKey(intakekey);
			return ok(deleteintakeconfirm.render(intake));
		}
	}

	public Result deleteUser(String userkey) {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			// Locate the user record and delete...
			User user = User.findByUserKey(userkey);
			if (user != null) {
				// Open user record...
				Logger.debug("Application.deleteUser: Found User based on " + userkey);
			} else {
				// Display message...
				Logger.debug("Application.deleteUser: No User found based on " + userkey);
			}

			// Create record in removedusers table
			// Capture user and date/time
			// Remove from user table...
			RemovedUser removedUser = new RemovedUser();

			// Copy the record over...
			removedUser.email = user.getEmail();
			removedUser.fullname = user.fullname;
			removedUser.agency = user.agency;
			removedUser.passwordHash = user.passwordHash;
			removedUser.confirmationToken = user.confirmationToken;
			removedUser.dateCreation = user.dateCreation;
			removedUser.active = user.active;
			removedUser.role = user.role;
			removedUser.rolename = user.rolename;
			removedUser.approved = user.approved;
			removedUser.validated = user.validated;
			removedUser.userkey = user.userkey;
			removedUser.updatedBy = user.updatedBy;
			removedUser.dateUpdated = user.dateUpdated;

			// Set custom fields...
			removedUser.dateRemoved = new Date();
			removedUser.removedBy = AccessMiddleware.getSessionEmail();
			removedUser.removedbyuserkey = AccessMiddleware.getSessionUserKey();
			removedUser.save();

			// Delete the user...
			user.delete();

			AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "User", "deleteUser()",
					"User DELETED by Admin", AccessMiddleware.getSessionID());

			return ok(deleteduser.render());
		}
	}

	public Result deleteUserConfirm(String userkey) {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			User user = User.findByUserKey(userkey);
			return ok(deleteconfirm.render(user));
		}
	}

	public Result exportUsers(String whatData) {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			List<User> users = null;
			String userRole = "";
			String fileName = "";
			// Download file to "Downloads" folder
			String home = System.getProperty("user.home");
			String fileLocation = home + "\\Downloads\\";
			RoleType role = AccessMiddleware.getSessionRole();
			if (role != null) {
				userRole = role.getRoleTextName(role);
			} else {
				// Will force user back to home page, since no Role was found...
				userRole = "";
			}

			try {
				switch (whatData) {
				case "EMNeedApproval":
					users = User.findUnapprovedEM();
					fileName = "em_need_approval";
					break;
				default:
					users = User.find.all();
					fileName = "all_users";
					break;
				}

				String fileDate = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
				fileName = fileLocation + fileName + "_" + fileDate + ".csv";
				CSVWriter usersWriter = new CSVWriter(new FileWriter(fileName));
				List<String[]> usersArr = new ArrayList<String[]>();
				usersArr.add(new String[] { "ID", "Email", "Role" });

				for (User user : users) {
					usersArr.add(new String[] { user.getFullname(), user.getEmail(),
							user.getRoleNameString(user.getRole().toString()) });
				}

				usersWriter.writeAll(usersArr);
				usersWriter.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			return ok(exportready.render(fileName, userRole));
		}
	}

	public Result exportIntake(String whatData) {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			List<Intake> intakeList = null;
			String userRole = "";
			String fileName = "";
			// Download file to "Downloads" folder
			String home = System.getProperty("user.home");
			String fileLocation = home + "\\Downloads\\";
			RoleType role = AccessMiddleware.getSessionRole();
			if (role != null) {
				userRole = role.getRoleTextName(role);
			} else {
				// Will force user back to home page, since no Role was found...
				userRole = "";
			}

			try {
				switch (whatData) {
				default:
					intakeList = Intake.find.all();
					fileName = "all_projects";
					break;
				}

				String fileDate = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
				fileName = fileLocation + fileName + "_" + fileDate + ".csv";
				CSVWriter usersWriter = new CSVWriter(new FileWriter(fileName));
				List<String[]> dataArray = new ArrayList<String[]>();
				dataArray.add(new String[] { "Project ID", "Project Name", "Project Summary", "Project Status",
						"Agency", "Requestor", "Date Requested", "How Requested", "Initial Meeting Date",
						"Initial Meeting Comments", "Request Status", "BA Manager", "BA Manager Email",
						"BA Assigned Date", "BA Assigned", "BA Assigned Email", "BA Deliverable", "BA Task Status",
						"BA Time Estimate", "BA Target Date", "BA Completion Date", "SE Manager", "SE Manager Email",
						"SE Assigned Date", "SE Assigned", "SE Assigned Email", "SE Deliverable", "SE Task Status",
						"SE Time Estimate", "SE Target Date", "SE Completion Date", "Date Created"

				});

				for (Intake intake : intakeList) {
					dataArray.add(new String[] { intake.projectid, intake.projectname, intake.summary,
							intake.projectstatus, intake.agency, intake.requestor, intake.daterequested.toString(),
							intake.howrequested, intake.initialmeetdate.toString(), intake.initialmeetcomments,
							intake.requeststatus, intake.bamanager, intake.bamanageremail,
							intake.baassigneddate.toString(), intake.baassigned, intake.baassignedemail,
							intake.badeliverable, intake.bataskstatus, intake.batimeestimate.toString(),
							intake.batargetdate.toString(), intake.bacompletiondate.toString(), intake.semanager,
							intake.semanageremail, intake.seassigneddate.toString(), intake.seassigned,
							intake.seassignedemail, intake.sedeliverable, intake.setaskstatus,
							intake.setimeestimate.toString(), intake.setargetdate.toString(),
							intake.secompletiondate.toString(), intake.datecreated.toString() });
				}

				usersWriter.writeAll(dataArray);
				usersWriter.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			return ok(exportready.render(fileName, userRole));
		}
	}

	public Result exportOpenFile(String fileName) {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			// Open the file that was exported...
			try {
				Desktop.getDesktop().open(new File(fileName));
			} catch (Exception e) {
				e.printStackTrace();
			}

			RoleType role = AccessMiddleware.getSessionRole();
			if (role != null) {
				switch (role.toString()) {
				case "1":
					return GO_BA;

				case "2":
					return GO_SE;

				case "3":
					return GO_BAMANAGER;

				case "4":
					return GO_SEMANAGER;

				case "5":
					return GO_ADMIN;

				default:
					return GO_HOME;
				}
			} else {
				return GO_HOME;
			}
		}
	}

	public Result filterIntake(String type, String value) {
		// Grab the current user's userkey and role...
		String userkey = AccessMiddleware.getSessionUserKey();
		RoleType role = AccessMiddleware.getSessionRole();
		List<Intake> intakeList = null;
		if (value.equals("All")) {
			intakeList = Intake.find.all();
		} else {
			// Get type...
			switch (type) {
			case "reqstatus":
				intakeList = Intake.filterByRequestStatus(userkey, role, value);
				break;

			case "agency":
				intakeList = Intake.filterByAgency(userkey, role, value);
				break;

			case "ba":
				intakeList = Intake.filterByBA(userkey, role, value);
				break;

			case "se":
				intakeList = Intake.filterBySE(userkey, role, value);
				break;

			default:
				break;
			}
		}
		List<Lookup> lookups = Lookup.find.all();
		List<User> users = User.find.all();
		User user = User.findByUserKey(userkey);
		return ok(searchintake.render(intakeList, lookups, users, user));
	}

	public Result filterLookups(String type, String value) {
		// Grab the current user's userkey and role...
		List<Lookup> lookupList = null;
		if (value.equals("All")) {
			lookupList = Lookup.find.all();
		} else {
			// Get type...
			switch (type) {
			case "type":
				lookupList = Lookup.filterByType(value);
				break;

			default:
				break;
			}
		}
		return ok(lookups.render(lookupList));
	}

	public Result findUser() {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			return ok(getuser.render(form(FindUser.class)));
		}
	}

	public Result getAllProjects() {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			List<Intake> intakeList = Intake.find.all();
			List<Lookup> lookups = Lookup.find.all();
			List<User> users = User.find.all();
			String userkey = AccessMiddleware.getSessionUserKey();
			User user = User.findByUserKey(userkey);
			return ok(searchintake.render(intakeList, lookups, users, user));
		}
	}

	public Result getAllUsers() {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			List<User> users = User.find.all();
			return ok(searchusers.render(users));
		}
	}

	public Result getLookupByKey(String lookupkey) {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			List<Lookup> lookups = Lookup.find.all();
			Lookup lookup = Lookup.findByUniqueKey(lookupkey);
			return ok(editlookup.render(lookups, lookup));
		}
	}

	public Result getProjectsWilcard(String searchText) {
		// Check the role and determine what to return...
		String userkey = AccessMiddleware.getSessionUserKey();
		if (userkey == null) {
			return ACCESS_DENIED;
		}
		RoleType role = AccessMiddleware.getSessionRole();
		if (role == null) {
			return ACCESS_DENIED;
		}
		List<Intake> intakeList = null;
		switch (role) {
		case BA:
			intakeList = Intake.findByProjectIDWilcardBASE(role, searchText, userkey);
			break;
		case SE:
			intakeList = Intake.findByProjectIDWilcardBASE(role, searchText, userkey);
			break;
		case BAMANAGER:
			intakeList = Intake.findByProjectIDWilcard(searchText);
			break;
		case SEMANAGER:
			intakeList = Intake.findByProjectIDWilcard(searchText);
			break;
		case ADMIN:
			intakeList = Intake.findByProjectIDWilcard(searchText);
			break;
		default:
			return ACCESS_DENIED;
		}

		List<Lookup> lookups = Lookup.find.all();
		List<User> users = User.find.all();
		User user = User.findByUserKey(userkey);
		return ok(searchintake.render(intakeList, lookups, users, user));
	}

	public Result getUserByEmail() {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			// Find user and display...
			Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();
			if (findUserForm.hasErrors()) {
				Logger.debug("getUserByEmail - errors");
				return badRequest(getuser.render(findUserForm));
			} else {
				// Find user and display...
				Logger.debug("getUserByEmail - good request");
				String email = findUserForm.get().searchText;
				User user = User.findByEmail(email);
				List<Lookup> lookups = Lookup.find.all();
				return ok(showuser.render(lookups, user));
			}
		}
	}

	public Result getUserByEmailWildcard() {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			// Find user and display...
			Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();
			if (findUserForm.hasErrors()) {
				Logger.debug("getUserByEmailWildcard - errors");
				Messages.get("search.user.bademail");
				return badRequest(getuser.render(findUserForm));
			} else {
				// Find user and display...
				Logger.debug("getUserByEmailWildcard - good request");
				String email = findUserForm.get().searchText;
				List<User> users = User.findUserWithWildcard(email);
				return ok(searchusers.render(users));
			}
		}
	}

	public Result getUserByUrl(String userkey) {
		// Find user and display...
		Logger.debug("getUserByUrl - good request");
		User user = User.findByUserKey(userkey);
		List<Lookup> lookups = Lookup.find.all();
		return ok(showuser.render(lookups, user));
	}

	public boolean hasCorrectAccess(RoleType accessRole) {
		// Make sure user has correct role to access...
		// Pass in Role user should have use...
		// Compare with user's current role...

		// Is the user authenticated?
		boolean isAuth = AccessMiddleware.isAuthenticated();
		if (isAuth) {
			// Get the current role and compare...
			RoleType currentRole = AccessMiddleware.getSessionRole();
			if (currentRole == accessRole) {
				// Good to go...
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static boolean isArrayEmpty(List<String> currentArray) {
		boolean isEmpty = true;
		for (String name : currentArray) {
			if (name != null) {
				isEmpty = false;
				return isEmpty;
			}
		}
		return isEmpty;
	}

	public Result index() {
		// Check that the email matches a confirmed user before we redirect
		String email = ctx().session().get("email");
		if (email != null) {
			User user = User.findByEmail(email);
			if (user != null && user.validated) {
				boolean isAuth = AccessMiddleware.isAuthenticated();
				if (isAuth) {
					RoleType role = AccessMiddleware.getSessionRole();
					if (role != null) {
						switch (role) {
						case BA:
							return GO_BA;

						case SE:
							return GO_SE;

						case BAMANAGER:
							return GO_BAMANAGER;

						case SEMANAGER:
							return GO_SEMANAGER;

						case ADMIN:
							return GO_ADMIN;

						default:
							return GO_HOME;
						}
					} else {
						Logger.debug("Application.index() - No Role - Clearing invalid session credentials");
						session().clear();
						return GO_HOME;
					}
				} else {
					Logger.debug("Application.index() - No user authenticated - Clearing invalid session credentials");
					session().clear();
					return GO_HOME;
				}
			} else {
				Logger.debug("Application.index() - Clearing invalid session credentials");
				session().clear();
			}
		}

		return ok(index.render(form(Register.class), form(Login.class)));
		// return ok(index.render());
	}

	/**
	 * Logout and clean the session.
	 *
	 * @return Index page
	 */
	public Result logout() {
		// First grab the current user...
		String email = session("email");
		// Remove session variables...
		User user = User.findByEmail(email);
		AccessMiddleware.removeSessionRecords(user);
		session().remove("email");
		session().clear();
		flash("success", Messages.get("youve.been.logged.out"));
		return GO_HOME;
	}

	public Result lookupMaintenance() {
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			List<Lookup> lookupList = Lookup.find.all();
			return ok(lookups.render(lookupList));
		}
	}

	public void notifyTeam(Intake intake, Comment comment, String emailType) throws MalformedURLException {
		// Set up globals...
		String subject = "";
		String message = "";
		String urlString = "";
		String commentAuthor = "";
		String commentDate = "";
		String commentText = "";
		List<String> emailArray = null;
		URL url = null;
		String testPrefix = "TEST - PLEASE DISREGARD...";
		String emailMode = Configuration.root().getString("application.emailmode");
		String emailState = Configuration.root().getString("application.emailstate");

		switch (emailType) {
		case "New":
			// Build the subject...
			subject = Messages.get("mail.newintake.subject", intake.projectid);
			// Build the URL to send...
			urlString = "https://" + Configuration.root().getString("server.hostname") + "/openintake/"
					+ intake.intakekey;
			// Validate the URL, will throw an exception if bad...
			url = new URL(urlString);
			message = Messages.get("mail.newintake.message", url.toString());
			break;

		case "Comment":
			// Build the subject...
			subject = Messages.get("mail.newcomment.subject", intake.projectid);
			// Build the URL to send...
			urlString = "https://" + Configuration.root().getString("server.hostname") + "/openintake/"
					+ intake.intakekey;
			// Validate the URL, will throw an exception if bad...
			url = new URL(urlString);
			// Let's add the comment to the message...
			commentAuthor = comment.author;
			commentDate = comment.datecreated.toString();
			commentText = comment.comment;
			message = Messages.get("mail.newcomment.message", commentAuthor, commentDate, commentText, url.toString());
			break;

		default:
			return;
		}

		// Build the Send To email addresses...
		emailArray = new ArrayList<String>();
		emailArray.add(intake.bamanageremail);
		emailArray.add(intake.semanageremail);
		emailArray.add(intake.baassignedemail);
		emailArray.add(intake.seassignedemail);

		// Let's make sure we have some addresses to send to...
		if (isArrayEmpty(emailArray) != true) {
			// Are we in test email mode?
			if (emailMode.equals("test")) {
				subject = testPrefix + " " + subject;
				message = testPrefix + "<br><br>" + message;
			}
			Mail.Envelop envelop = new Mail.Envelop(subject, message, emailArray);
			Mail mailer = new Mail(mailerClient);
			// Are we sending email?
			if (emailState.equals("on")) {
				mailer.sendMail(envelop);
			}
		}
	}

	public Result openLogin() {
		boolean isAuth = AccessMiddleware.isAuthenticated();
		if (isAuth) {
			RoleType role = AccessMiddleware.getSessionRole();
			if (role != null) {
				switch (role.toString()) {
				case "1":
					return GO_BA;

				case "2":
					return GO_SE;

				case "3":
					return GO_BAMANAGER;

				case "4":
					return GO_SEMANAGER;

				case "5":
					return GO_ADMIN;

				default:
					return GO_HOME;
				}
			} else {
				Logger.debug("Application.index() - No Role - Clearing invalid session credentials");
				session().clear();
				return ok(auth.render(form(Login.class)));
			}
		} else {
			Logger.debug("Application.index() - No user authenticated - Clearing invalid session credentials");
			session().clear();
			return ok(auth.render(form(Login.class)));
		}
	}

	public Result openIntake(String intakekey) {
		// Let's make sure they are authenticated since user can click link in
		// email...
		String email = ctx().session().get("email");
		if (email != null) {
			User user = User.findByEmail(email);
			if (user != null && user.validated) {
				boolean isAuth = AccessMiddleware.isAuthenticated();
				if (!isAuth) {
					// Need to login...
					openIntakeKey = intakekey;
					return ok(auth.render(form(Login.class)));
				}
			} else {
				// Need to login...
				openIntakeKey = intakekey;
				return ok(auth.render(form(Login.class)));
			}
		} else {
			// Need to login...
			openIntakeKey = intakekey;
			return ok(auth.render(form(Login.class)));
		}

		Form<IntakeAdd> intakeEntry = form(IntakeAdd.class).bindFromRequest();
		List<Lookup> lookups = Lookup.find.all();
		List<User> users = User.find.all();

		// Get correct intake...
		Intake intake = Intake.findByIntakeKey(intakekey);

		// Get current user role...
		String userkey = AccessMiddleware.getSessionUserKey();
		User user = User.findByUserKey(userkey);

		// Someone is editing the intake...
		// Need to record current version of intake to compare on save...
		// This will record the Audit History...
		// Create new record in IntakeEdit table...
		IntakeEdit intakeEdit = new IntakeEdit();
		intakeEdit.projectid = intake.projectid;
		intakeEdit.agency = intake.agency;
		intakeEdit.requestor = intake.requestor;
		intakeEdit.projectname = intake.projectname;
		intakeEdit.summary = intake.summary;
		intakeEdit.projectstatus = intake.projectstatus;
		intakeEdit.daterequested = intake.daterequested;
		intakeEdit.howrequested = intake.howrequested;
		intakeEdit.requeststatus = intake.requeststatus;
		intakeEdit.initialmeetdate = intake.initialmeetdate;
		intakeEdit.initialmeetcomments = intake.initialmeetcomments;
		intakeEdit.bataskstatus = intake.bataskstatus;
		intakeEdit.setaskstatus = intake.setaskstatus;
		intakeEdit.batimeestimate = intake.batimeestimate;
		intakeEdit.setimeestimate = intake.setimeestimate;
		intakeEdit.bacompletiondate = intake.bacompletiondate;
		intakeEdit.secompletiondate = intake.secompletiondate;
		intakeEdit.bamanager = intake.bamanager;
		intakeEdit.bamanageremail = intake.bamanageremail;
		intakeEdit.bamanagerkey = intake.bamanagerkey;
		intakeEdit.baassigneddate = intake.baassigneddate;
		intakeEdit.baassigned = intake.baassigned;
		intakeEdit.baassignedemail = intake.baassignedemail;
		intakeEdit.baassignedkey = intake.baassignedkey;
		intakeEdit.badeliverable = intake.badeliverable;
		intakeEdit.batargetdate = intake.batargetdate;
		intakeEdit.semanager = intake.semanager;
		intakeEdit.semanageremail = intake.semanageremail;
		intakeEdit.semanagerkey = intake.semanagerkey;
		intakeEdit.seassigneddate = intake.seassigneddate;
		intakeEdit.seassigned = intake.seassigned;
		intakeEdit.seassignedemail = intake.seassignedemail;
		intakeEdit.seassignedkey = intake.seassignedkey;
		intakeEdit.sedeliverable = intake.sedeliverable;
		intakeEdit.setargetdate = intake.setargetdate;

		// Create editkey...
		String editkey = intakeEdit.createEditKey();
		intakeEdit.editkey = editkey;
		intake.editkey = editkey;

		// Save both records...
		intake.save();
		intakeEdit.save();

		// Get all IntakeAudit records...
		List<IntakeAudit> intakeAudits = IntakeAudit.findByIntakeKey(intakekey);
		List<Comment> allComments = Comment.getAllByIntakeKey(intakekey);

		return

		ok(editintake.render(intakeEntry, lookups, users, intake, user, intakeAudits, allComments));
	}

	public Result openLookup(String lookupkey) {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			List<Lookup> lookups = Lookup.find.all();
			Lookup lookup = Lookup.findByUniqueKey(lookupkey);
			return ok(editlookup.render(lookups, lookup));
		}
	}

	public Result openUser() {
		// Check Role...
		if (hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			return ok(openuser.render());
		}
	}

	public Result openUserAccount(String email) {
		Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();
		User user = User.findByEmail(email);
		String name = user.fullname;

		if (findUserForm.hasErrors()) {
			Logger.debug("Open User Account - errors");
			return badRequest(useraccount.render(findUserForm, email, name));
		} else {
			// Find user and display...
			Logger.debug("Open User Account - good request");
			return ok(useraccount.render(findUserForm, email, name));
		}
	}

	public Result populateLookups() {
		List<Lookup> lookups = Lookup.find.all();
		for (Lookup lookup : lookups) {
			lookup.datecreated = new Date();
			lookup.lookupkey = lookup.createUniqueKey();
			lookup.save();
		}

		List<User> users = User.find.all();
		for (User user : users) {
			RoleType role = user.getRole();
			String roleName = role.getRoleTextName(role);
			user.setRolename(roleName);
			user.setUserkey(user.createUserKey());
			user.dateCreation = new Date();
			user.save();
		}

		return ok(genericsuccess.render());
	}

	public Result saveIntake() {
		Form<IntakeAdd> intakeEntry = form(IntakeAdd.class).bindFromRequest();

		if (intakeEntry.hasErrors()) {
			List<Lookup> lookups = Lookup.find.all();
			List<User> users = User.find.all();
			Logger.debug("Save Intake - errors");
			/*
			 * Used to show errors... String errorMsg = "";
			 * java.util.Map<String, List<play.data.validation.ValidationError>>
			 * errorsAll = intakeEntry.errors(); for (String field :
			 * errorsAll.keySet()) { errorMsg += field + " "; for
			 * (ValidationError error : errorsAll.get(field)) { errorMsg +=
			 * error.message() + ", "; } } flash("error",
			 * "Please correct the following errors: " + errorMsg);
			 */
			return badRequest(intake.render(intakeEntry, lookups, users));
		}
		// Save the intake...
		User user = null;
		IntakeAdd intakeForm = intakeEntry.get();
		Logger.debug("Save Intake - good request");
		Intake intake = new Intake();
		intake.projectid = intakeForm.projectid;
		intake.agency = intakeForm.agency;
		intake.requestor = intakeForm.requestor;
		intake.projectname = intakeForm.projectname;
		intake.summary = intakeForm.summary;
		intake.projectstatus = intakeForm.projectstatus;
		intake.daterequested = intakeForm.daterequested;
		intake.howrequested = intakeForm.howrequested;
		intake.requeststatus = intakeForm.requeststatus;
		intake.initialmeetdate = intakeForm.initialmeetdate;
		intake.initialmeetcomments = intakeForm.initialmeetcomments;
		intake.bataskstatus = intakeForm.bataskstatus;
		intake.setaskstatus = intakeForm.setaskstatus;
		intake.batimeestimate = intakeForm.batimeestimate;
		intake.setimeestimate = intakeForm.setimeestimate;
		intake.bacompletiondate = intakeForm.bacompletiondate;
		intake.secompletiondate = intakeForm.secompletiondate;
		// BA Manager...
		if (intakeForm.bamanager != null) {
			intake.bamanager = intakeForm.bamanager;
			user = user.findByFullname(intake.bamanager);
			intake.bamanageremail = user.getEmail();
			intake.bamanagerkey = user.getUserkey();
		}
		intake.baassigneddate = intakeForm.baassigneddate;
		// BA...
		if (intakeForm.baassigned != null) {
			intake.baassigned = intakeForm.baassigned;
			user = user.findByFullname(intake.baassigned);
			intake.baassignedemail = user.getEmail();
			intake.baassignedkey = user.getUserkey();
			intake.badeliverable = intakeForm.badeliverable;
		}
		intake.batargetdate = intakeForm.batargetdate;
		// SE Manager...
		if (intakeForm.semanager != null) {
			intake.semanager = intakeForm.semanager;
			user = user.findByFullname(intake.semanager);
			intake.semanageremail = user.getEmail();
			intake.semanagerkey = user.getUserkey();
		}
		intake.seassigneddate = intakeForm.seassigneddate;
		// SE...
		if (intakeForm.seassigned != null) {
			intake.seassigned = intakeForm.seassigned;
			user = user.findByFullname(intake.seassigned);
			intake.seassignedemail = user.getEmail();
			intake.seassignedkey = user.getUserkey();
		}
		intake.sedeliverable = intakeForm.sedeliverable;
		intake.setargetdate = intakeForm.setargetdate;
		intake.datecreated = new Date();
		intake.intakekey = intake.createIntakeKey();
		intake.userkey = AccessMiddleware.getSessionUserKey();
		intake.save();

		// Add initial comment...
		String userkey = AccessMiddleware.getSessionUserKey();
		user = User.findByUserKey(userkey);

		// Let's create a Comment record...
		Comment comment = new Comment();
		comment.intakekey = intake.intakekey;
		comment.comment = Messages.get("intake.new.comment");
		comment.commentkey = comment.createCommentKey();
		comment.datecreated = new Date();
		if (user != null) {
			comment.author = user.fullname;
			comment.authoremail = user.getEmail();
			comment.userkey = userkey;
		}
		comment.save();

		AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "Intake", "saveIntake()",
				"New Intake created and saved", AccessMiddleware.getSessionID());

		// Notify team they have been assigned...
		try {
			notifyTeam(intake, null, "New");
		} catch (MalformedURLException m) {
			m.printStackTrace();
		}

		return ok(intakecreated.render(intake.intakekey));
	}

	public Result saveLookup() {
		Form<LookupAdd> lookupEntry = form(LookupAdd.class).bindFromRequest();

		if (lookupEntry.hasErrors()) {
			List<Lookup> lookups = Lookup.find.all();
			Logger.debug("Save Lookup - errors");
			return badRequest(lookup.render(lookups));
		}
		// Save the lookup...
		User user = null;
		LookupAdd lookupForm = lookupEntry.get();
		Logger.debug("Save Lookup - good request");
		Lookup lookup = new Lookup();
		lookup.lookupkey = lookup.createUniqueKey();
		lookup.lookuptype = lookupForm.lookuptype;
		lookup.name = lookupForm.name;
		lookup.description = lookupForm.description;
		lookup.datecreated = new Date();
		lookup.userkey = AccessMiddleware.getSessionUserKey();
		lookup.save();

		AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "Lookup", "saveLookup()",
				"New Lookup created and saved", AccessMiddleware.getSessionID());

		return ok(lookupcreated.render());
	}

	public Result searchIntake() {
		// Grab the current user's userkey and role...
		String userkey = AccessMiddleware.getSessionUserKey();
		RoleType role = AccessMiddleware.getSessionRole();

		List<Intake> intakeList = Intake.findByCurrentUser(userkey, role);
		List<Lookup> lookups = Lookup.find.all();
		List<User> users = User.find.all();
		User user = User.findByUserKey(userkey);
		return ok(searchintake.render(intakeList, lookups, users, user));
	}

	@SuppressWarnings("static-access")
	public Result updateIntake(String intakekey) {
		Form<IntakeAdd> intakeEntry = form(IntakeAdd.class).bindFromRequest();

		// Get correct intake...
		Intake intake = Intake.findByIntakeKey(intakekey);

		// Get current user role...
		String userkey = AccessMiddleware.getSessionUserKey();
		User user = User.findByUserKey(userkey);

		if (intakeEntry.hasErrors()) {
			List<Lookup> lookups = Lookup.find.all();
			List<User> users = User.find.all();
			Logger.debug("Update Intake - errors");
			// Get all IntakeAudit records...
			List<IntakeAudit> intakeAudits = IntakeAudit.findByIntakeKey(intakekey);
			List<Comment> allComments = Comment.getAllByIntakeKey(intakekey);
			return ok(editintake.render(intakeEntry, lookups, users, intake, user, intakeAudits, allComments));
		}
		// Save the intake...
		IntakeAdd intakeForm = intakeEntry.get();
		Logger.debug("Update Intake - good request");
		intake.projectid = intakeForm.projectid;
		intake.agency = intakeForm.agency;
		intake.requestor = intakeForm.requestor;
		intake.projectname = intakeForm.projectname;
		intake.summary = intakeForm.summary;
		intake.projectstatus = intakeForm.projectstatus;
		intake.daterequested = intakeForm.daterequested;
		intake.howrequested = intakeForm.howrequested;
		intake.requeststatus = intakeForm.requeststatus;
		intake.initialmeetdate = intakeForm.initialmeetdate;
		intake.initialmeetcomments = intakeForm.initialmeetcomments;
		intake.bataskstatus = intakeForm.bataskstatus;
		intake.setaskstatus = intakeForm.setaskstatus;
		intake.batimeestimate = intakeForm.batimeestimate;
		intake.setimeestimate = intakeForm.setimeestimate;
		intake.bacompletiondate = intakeForm.bacompletiondate;
		intake.secompletiondate = intakeForm.secompletiondate;
		// BA Manager...
		if (intakeForm.bamanager != null) {
			intake.bamanager = intakeForm.bamanager;
			user = user.findByFullname(intake.bamanager);
			intake.bamanageremail = user.getEmail();
			intake.bamanagerkey = user.getUserkey();
		}
		intake.baassigneddate = intakeForm.baassigneddate;
		// BA...
		if (intakeForm.baassigned != null) {
			intake.baassigned = intakeForm.baassigned;
			user = user.findByFullname(intake.baassigned);
			intake.baassignedemail = user.getEmail();
			intake.baassignedkey = user.getUserkey();
			intake.badeliverable = intakeForm.badeliverable;
		}
		intake.batargetdate = intakeForm.batargetdate;
		// SE Manager...
		if (intakeForm.semanager != null) {
			intake.semanager = intakeForm.semanager;
			user = user.findByFullname(intake.semanager);
			intake.semanageremail = user.getEmail();
			intake.semanagerkey = user.getUserkey();
		}
		intake.seassigneddate = intakeForm.seassigneddate;
		// SE...
		if (intakeForm.seassigned != null) {
			intake.seassigned = intakeForm.seassigned;
			user = user.findByFullname(intake.seassigned);
			intake.seassignedemail = user.getEmail();
			intake.seassignedkey = user.getUserkey();
		}
		intake.sedeliverable = intakeForm.sedeliverable;
		intake.setargetdate = intakeForm.setargetdate;
		intake.userkey = AccessMiddleware.getSessionUserKey();
		intake.updatedby = AccessMiddleware.getSessionEmail();
		intake.dateupdated = new Date();
		intake.save();

		// Let's check the IntakeEdit record and see what is different...
		String editkey = intake.editkey;
		IntakeEdit intakeEdit = IntakeEdit.findByEditKey(editkey);
		if (intakeEdit != null) {
			// Compare the 2 records...
			String fieldSplit = "";
			String[] splitValues = null;
			String fieldName = "";
			String fieldDisplay = "";
			String oldValue = "";
			String newValue = "";
			Field field = null;
			Object fieldObject = null;
			IntakeAudit intakeAudit = null;
			String[] fieldArray = intakeFieldControl();
			// Cycle through fieldArray...
			for (int x = 0; x < fieldArray.length; x++) {
				fieldSplit = fieldArray[x];
				splitValues = fieldSplit.split(delimiter);
				fieldName = splitValues[0];
				fieldDisplay = splitValues[1];
				// oldValue = intakeEdit.getClass().getField(fieldName);
				try {
					// Get old value...
					field = intakeEdit.getClass().getField(fieldName);
					fieldObject = field.get(intakeEdit);
					if (fieldObject != null) {
						oldValue = fieldObject.toString();
					} else {
						oldValue = "";
					}

					// Get new value...
					field = intake.getClass().getField(fieldName);
					fieldObject = field.get(intake);
					if (fieldObject != null) {
						newValue = fieldObject.toString();
					} else {
						newValue = "";
					}

					if (oldValue.equals(newValue)) {
						// Same value - skip
					} else {
						// Create Audit record...
						intakeAudit = new IntakeAudit();
						intakeAudit.fieldname = fieldName;
						intakeAudit.fielddisplay = fieldDisplay;
						intakeAudit.oldvalue = oldValue;
						intakeAudit.newvalue = newValue;
						intakeAudit.editor = AccessMiddleware.getSessionID();
						intakeAudit.editoremail = AccessMiddleware.getSessionEmail();
						intakeAudit.editorkey = AccessMiddleware.getSessionUserKey();
						intakeAudit.intakekey = intake.intakekey;
						intakeAudit.auditkey = intakeAudit.createAuditKey();
						intakeAudit.editdate = new Date();
						intakeAudit.save();
					}

				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			// Remove the IntakeEdit record...
			intakeEdit.delete();
		}

		AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "Intake", "updateIntake()",
				"Intake updated and saved", AccessMiddleware.getSessionID());

		return ok(intakeupdated.render());
	}

	public Result updateLookup(String lookupkey) {
		Form<LookupAdd> lookupEntry = form(LookupAdd.class).bindFromRequest();

		if (lookupEntry.hasErrors()) {
			List<Lookup> lookups = Lookup.find.all();
			Logger.debug("Save Lookup - errors");
			return badRequest(lookup.render(lookups));
		}
		// Save the lookup...
		User user = null;
		LookupAdd lookupForm = lookupEntry.get();
		Logger.debug("Save Lookup - good request");
		Lookup lookup = Lookup.findByUniqueKey(lookupkey);
		lookup.lookuptype = lookupForm.lookuptype;
		lookup.name = lookupForm.name;
		lookup.description = lookupForm.description;
		lookup.datecreated = new Date();
		lookup.updatedby = AccessMiddleware.getSessionEmail();
		lookup.dateupdated = new Date();
		lookup.userkey = AccessMiddleware.getSessionUserKey();
		lookup.save();

		AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "Lookup", "saveLookup()",
				"New Lookup created and saved", AccessMiddleware.getSessionID());

		return ok(lookupupdated.render());
	}

	public Result updateUser() {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			String email;
			String name;
			String rolename;
			User user;

			Form<RegisterUser> findUserForm = form(RegisterUser.class).bindFromRequest();

			// Get values from the form...
			email = findUserForm.get().email;
			name = findUserForm.get().fullname;
			rolename = findUserForm.get().rolename;

			user = User.findByEmail(email);
			List<Lookup> lookups = Lookup.find.all();

			Logger.debug("Update User");

			if (findUserForm.hasErrors()) {
				Logger.debug("Update User - errors");
				return badRequest(showuser.render(lookups, user));
			}

			// Find user and save changes...
			Logger.debug("Update User - good request");

			// I know we have the user, but let's make sure we get the correct
			// user...
			user.setFullname(name);
			user.setRolename(rolename);
			switch (rolename) {
			case "BA":
				user.setRole(RoleType.BA);
				break;
			case "SE":
				user.setRole(RoleType.SE);
				break;
			case "BA Manager":
				user.setRole(RoleType.BAMANAGER);
				break;
			case "SE Manager":
				user.setRole(RoleType.SEMANAGER);
				break;
			case "Admin":
				user.setRole(RoleType.ADMIN);
				break;
			default:
				user.setRole(RoleType.UNDEFINED);
				break;
			}

			// Save the user...
			user.updatedBy = AccessMiddleware.getSessionEmail();
			user.dateUpdated = new Date();
			user.save();

			return ok(saveduser.render());
		}
	}

	public Result updateUserAccount() {
		String email;
		String name;
		String approved;
		String role;
		User user;

		Form<FindUser> findUserForm = form(FindUser.class).bindFromRequest();

		// Get values from the form...
		email = findUserForm.get().email;
		name = findUserForm.get().fullname;
		Logger.debug("Updating User Account");

		if (findUserForm.hasErrors()) {
			Logger.debug("Update User Account - errors");
			return badRequest(useraccount.render(findUserForm, "", ""));
		}

		// Find user and save changes...
		Logger.debug("Update User Account - good request");

		// I know we have the user, but let's make sure we get the correct
		// user...
		user = User.findByEmail(email);
		user.fullname = name;

		// Save the user...
		user.updatedBy = AccessMiddleware.getSessionEmail();
		user.dateUpdated = new Date();
		user.save();

		AuditLog.setLog(AccessMiddleware.getSessionID(), AccessMiddleware.getSessionEmail(), "User Account",
				"updateUserAccount()", "User account updated", AccessMiddleware.getSessionID());

		return ok(saveduser.render());
	}

	public Result userHome() {
		boolean isAuth = AccessMiddleware.isAuthenticated();
		if (isAuth) {
			RoleType role = AccessMiddleware.getSessionRole();
			if (role != null) {
				// Grab the current user's userkey and role...
				String userkey = AccessMiddleware.getSessionUserKey();
				List<Intake> intakeList = Intake.findByCurrentUser(userkey, role);
				List<Lookup> lookups = Lookup.find.all();
				List<User> users = User.find.all();
				User user = User.findByUserKey(userkey);
				return ok(searchintake.render(intakeList, lookups, users, user));
			}
		}
		return GO_HOME;
	}

	public Result userMaintenance() {
		// Check Role...
		if (hasCorrectAccess(RoleType.BAMANAGER) != true && hasCorrectAccess(RoleType.SEMANAGER) != true
				&& hasCorrectAccess(RoleType.ADMIN) != true) {
			return ACCESS_DENIED;
		} else {
			return ok(usermaint.render(form(Login.class)));
		}
	}

	public static String[] intakeFieldControl() {

		String[] fieldArray = new String[27];

		fieldArray[0] = "projectid" + delimiter + "Project ID";
		fieldArray[1] = "agency" + delimiter + "Agency";
		fieldArray[2] = "requestor" + delimiter + "Requestor";
		fieldArray[3] = "projectname" + delimiter + "Project Name";
		fieldArray[4] = "summary" + delimiter + "Summary";
		fieldArray[5] = "projectstatus" + delimiter + "Project Status";
		fieldArray[6] = "daterequested" + delimiter + "Date Requested";
		fieldArray[7] = "howrequested" + delimiter + "How Requested";
		fieldArray[8] = "requeststatus" + delimiter + "Request Status";
		fieldArray[9] = "initialmeetdate" + delimiter + "Initial Meeting Date";
		fieldArray[10] = "initialmeetcomments" + delimiter + "Initial Meeting Comments";
		fieldArray[11] = "bataskstatus" + delimiter + "BA Task Status";
		fieldArray[12] = "setaskstatus" + delimiter + "SE Task Status";
		fieldArray[13] = "batimeestimate" + delimiter + "BA Time Estimate";
		fieldArray[14] = "setimeestimate" + delimiter + "SE Time Estimate";
		fieldArray[15] = "bacompletiondate" + delimiter + "BA Completion Date";
		fieldArray[16] = "secompletiondate" + delimiter + "SE Completion Date";
		fieldArray[17] = "bamanager" + delimiter + "BA Manager";
		fieldArray[18] = "baassigneddate" + delimiter + "BA Assigned Date";
		fieldArray[19] = "baassigned" + delimiter + "BA Assigned";
		fieldArray[20] = "badeliverable" + delimiter + "BA Deliverable";
		fieldArray[21] = "batargetdate" + delimiter + "BA Target Date";
		fieldArray[22] = "semanager" + delimiter + "SE Manager";
		fieldArray[23] = "seassigneddate" + delimiter + "SE Assigned Date";
		fieldArray[24] = "seassigned" + delimiter + "SE Assigned";
		fieldArray[25] = "sedeliverable" + delimiter + "SE Deliverable";
		fieldArray[26] = "setargetdate" + delimiter + "SE Target Date";

		return fieldArray;
	}

	public Result reportsCreate(String reportType) {

		List<String> nameList = null;
		List<Integer> totalList = null;
		RoleType role = null;
		String jsonStart = "";
		String jsonColumns = "";
		String jsonRowStart = "'rows': [";
		String jsonRowEntry = "";
		String jsonRowEntry1 = "";
		String jsonRowEntry2 = "";
		String jsonEnd = "]}";
		String jsonString = "";
		String jsonString1 = "";
		String jsonString2 = "";
		String nameValue = "";
		String title = "";
		String title1 = "";
		String title2 = "";
		Integer total = 0;

		switch (reportType) {
		case "Agencies":
			// Grab all intake by Agency...
			jsonColumns = "{'cols': [{'id': 'agency', 'label': 'Agency', 'type': 'string'},{'id': 'totals', 'label': 'Agency Totals', 'type': 'number'}],";
			title = "Projects By Agency";
			nameList = Intake.getAgencyNames();
			nameList = removeDuplicates(nameList);
			for (int x = 0; x < nameList.size(); x++) {
				// Get the agency name and total...
				nameValue = nameList.get(x);
				total = Intake.getAgencyTotal(nameValue);
				if (jsonRowEntry.equals("")) {
					jsonRowEntry = "{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				} else {
					jsonRowEntry = jsonRowEntry + ",{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				}
			}
			break;

		case "BySE":
			// Grab all intake by SE...
			jsonColumns = "{'cols': [{'id': 'se', 'label': 'SE', 'type': 'string'},{'id': 'totals', 'label': 'SE Totals', 'type': 'number'}],";
			title = "Projects By SE";
			nameList = Intake.getSENames();
			nameList = removeDuplicates(nameList);
			for (int x = 0; x < nameList.size(); x++) {
				// Get the agency name and total...
				nameValue = nameList.get(x);
				total = Intake.getSETotal(nameValue);
				if (jsonRowEntry.equals("")) {
					jsonRowEntry = "{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				} else {
					jsonRowEntry = jsonRowEntry + ",{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				}
			}
			break;

		case "All":
			// Grab all intake by Agency...
			jsonColumns = "{'cols': [{'id': 'agency', 'label': 'Agency', 'type': 'string'},{'id': 'totals', 'label': 'Agency Totals', 'type': 'number'}],";
			title1 = "Projects By Agency";
			nameList = Intake.getAgencyNames();
			nameList = removeDuplicates(nameList);
			for (int x = 0; x < nameList.size(); x++) {
				// Get the agency name and total...
				nameValue = nameList.get(x);
				total = Intake.getAgencyTotal(nameValue);
				if (jsonRowEntry1.equals("")) {
					jsonRowEntry1 = "{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				} else {
					jsonRowEntry1 = jsonRowEntry1 + ",{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				}
			}
			jsonString1 = jsonColumns + jsonRowStart + jsonRowEntry1 + jsonEnd;

			// Grab all intake by SE...
			jsonColumns = "{'cols': [{'id': 'se', 'label': 'SE', 'type': 'string'},{'id': 'totals', 'label': 'SE Totals', 'type': 'number'}],";
			title2 = "Projects By SE";
			nameList = Intake.getSENames();
			nameList = removeDuplicates(nameList);
			for (int x = 0; x < nameList.size(); x++) {
				// Get the agency name and total...
				nameValue = nameList.get(x);
				total = Intake.getSETotal(nameValue);
				if (jsonRowEntry2.equals("")) {
					jsonRowEntry2 = "{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				} else {
					jsonRowEntry2 = jsonRowEntry2 + ",{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				}
			}
			jsonString2 = jsonColumns + jsonRowStart + jsonRowEntry2 + jsonEnd;

			break;

		case "DueThisWeekMonth":
			// Grab all intake by Agency...
			jsonColumns = "{'cols': [{'id': 'agency', 'label': 'Agency', 'type': 'string'},{'id': 'totals', 'label': 'Agency Totals', 'type': 'number'}],";
			title1 = "Projects By Agency";
			nameList = Intake.getAgencyNames();
			nameList = removeDuplicates(nameList);
			for (int x = 0; x < nameList.size(); x++) {
				// Get the agency name and total...
				nameValue = nameList.get(x);
				total = Intake.getAgencyTotal(nameValue);
				if (jsonRowEntry1.equals("")) {
					jsonRowEntry1 = "{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				} else {
					jsonRowEntry1 = jsonRowEntry1 + ",{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				}
			}
			jsonString1 = jsonColumns + jsonRowStart + jsonRowEntry1 + jsonEnd;

			// Grab all intake by SE...
			jsonColumns = "{'cols': [{'id': 'se', 'label': 'SE', 'type': 'string'},{'id': 'totals', 'label': 'SE Totals', 'type': 'number'}],";
			title2 = "Projects By SE";
			nameList = Intake.getSENames();
			nameList = removeDuplicates(nameList);
			for (int x = 0; x < nameList.size(); x++) {
				// Get the agency name and total...
				nameValue = nameList.get(x);
				total = Intake.getSETotal(nameValue);
				if (jsonRowEntry2.equals("")) {
					jsonRowEntry2 = "{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				} else {
					jsonRowEntry2 = jsonRowEntry2 + ",{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				}
			}
			jsonString2 = jsonColumns + jsonRowStart + jsonRowEntry2 + jsonEnd;

			break;

		case "SETime":
			// Grab all the SEs based on Role from the User model...
			role = RoleType.SE;
			nameList = User.getNamesByRole(role);
			jsonColumns = "{'cols': [{'id': 'se', 'label': 'SE', 'type': 'string'},{'id': 'utilization', 'label': 'Utilization', 'type': 'number'}],";
			title = "SE Utilization";
			for (int x = 0; x < nameList.size(); x++) {
				// Get the SE Name and total...
				nameValue = nameList.get(x);
				total = Intake.getSEUtilization(nameValue);
				if (jsonRowEntry.equals("")) {
					jsonRowEntry = "{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				} else {
					jsonRowEntry = jsonRowEntry + ",{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				}
			}
			jsonString = jsonColumns + jsonRowStart + jsonRowEntry + jsonEnd;
			return ok(chartsbar.render(jsonString, title));

		case "BATime":
			// Grab all the BAs based on Role from the User model...
			role = RoleType.BA;
			nameList = User.getNamesByRole(role);
			jsonColumns = "{'cols': [{'id': 'ba', 'label': 'BA', 'type': 'string'},{'id': 'utilization', 'label': 'Utilization', 'type': 'number'}],";
			title = "BA Utilization";
			for (int x = 0; x < nameList.size(); x++) {
				// Get the SE Name and total...
				nameValue = nameList.get(x);
				total = Intake.getBAUtilization(nameValue);
				if (jsonRowEntry.equals("")) {
					jsonRowEntry = "{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				} else {
					jsonRowEntry = jsonRowEntry + ",{'c':[{'v': '" + nameValue + "'}, {'v': " + total + "}]}";
				}
			}
			jsonString = jsonColumns + jsonRowStart + jsonRowEntry + jsonEnd;
			return ok(chartsbar.render(jsonString, title));

		default:
			return GO_HOME;
		}

		// jsonString = "{cols: [{id: 'task', label: 'Task', type: 'string'},
		// {id: 'hours', label: 'Hours per Day', type: 'number'}],rows: [{c:[{v:
		// 'Work'}, {v: 11}]}, {c:[{v: 'Eat'}, {v: 2}]}, {c:[{v: 'Commute'}, {v:
		// 2}]}, {c:[{v: 'Watch TV'}, {v:2}]}, {c:[{v: 'Sleep'}, {v:7,
		// f:'7.000'}]}]}";

		// jsonString = "{'cols': [{'id': 'task', 'label': 'Task', 'type':
		// 'string'}, {'id': 'hours', 'label': 'Hours per Day', 'type':
		// 'number'}],'rows': [{'c':[{'v': 'Work'}, {'v': 11}]}, {'c':[{'v':
		// 'Eat'}, {'v': 2}]}, {'c':[{'v': 'Commute'}, {'v': 2}]}, {'c':[{'v':
		// 'Watch TV'}, {'v':2}]}, {'c':[{'v': 'Sleep'}, {'v':7,
		// 'f':'7.000'}]}]}";

		if (reportType.equals("All")) {
			return ok(charts2.render(jsonString1, jsonString2, title1, title2));
		} else {
			jsonString = jsonColumns + jsonRowStart + jsonRowEntry + jsonEnd;
			return ok(charts1.render(jsonString, title));
		}
	}

	public static List<String> removeDuplicates(List<String> currentArray) {
		List<String> newList = new ArrayList<>();
		for (String name : currentArray) {
			if (!newList.contains(name)) {
				newList.add(name);
			}
		}
		return newList;
	}

}