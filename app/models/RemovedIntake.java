package models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

import models.enums.RoleType;
import play.Logger;
import play.data.format.Formats;
import play.data.validation.Constraints;

/**
 * @author zellerd
 *
 */
@Entity
public class RemovedIntake extends Model {

	@Id
	public Long id;

	@Constraints.Required
	public String projectid;
	
	@Constraints.Required
	public String projectname;

	@Constraints.Required
	@Constraints.MaxLength(10000)
	public String summary;
	
	@Constraints.Required
	public String projectstatus;

	@Constraints.Required
	public String agency;

	@Constraints.Required
	public String requestor;

	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date daterequested;

	@Constraints.Required
	public String howrequested;
	
	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date initialmeetdate;
	
	@Constraints.Required
	public String initialmeetcomments;

	@Constraints.Required
	public String requeststatus;

	@Constraints.Required
	public String bamanager;

	@Constraints.Required
	public String bamanageremail;

	@Constraints.Required
	public String bamanagerkey;

	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date baassigneddate;

	@Constraints.Required
	public String baassigned;

	@Constraints.Required
	public String baassignedemail;

	@Constraints.Required
	public String baassignedkey;
	
	public String baassigned1;

	public String baassignedemail1;

	public String baassignedkey1;
	
	public String baassigned2;

	public String baassignedemail2;

	public String baassignedkey2;

	@Constraints.Required
	public String badeliverable;
	
	@Constraints.Required
	public String bataskstatus;
	
	@Constraints.Required
	public Integer batimeestimate;

	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date batargetdate;
	
	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date bacompletiondate;

	@Constraints.Required
	public String semanager;

	@Constraints.Required
	public String semanageremail;

	@Constraints.Required
	public String semanagerkey;

	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date seassigneddate;

	@Constraints.Required
	public String seassigned;

	@Constraints.Required
	public String seassignedemail;

	@Constraints.Required
	public String seassignedkey;
	
	public String seassigned1;

	public String seassignedemail1;
	
	public String seassignedkey1;
	
	public String seassigned2;

	public String seassignedemail2;
	
	public String seassignedkey2;

	@Constraints.Required
	public String sedeliverable;
	
	@Constraints.Required
	public String setaskstatus;
	
	@Constraints.Required
	public Integer setimeestimate;

	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date setargetdate;
	
	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date secompletiondate;

	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date datecreated;

	@Constraints.Required
	public String intakekey;

	public String userkey;

	public String updatedby;

	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date dateupdated;

	public String removedBy;

	public String removedbyuserkey;

	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date dateRemoved;

	// -- Queries (long id, profile.class)
	public static Model.Finder<Long, RemovedIntake> find = new Model.Finder<Long, RemovedIntake>(Long.class,
			RemovedIntake.class);

	/**
	 * Retrieve a profile by business name.
	 *
	 * @param name
	 *            to search
	 * @return a profile
	 */
	public static RemovedIntake findByProjectID(String projectid) {
		return find.where().eq("projectid", projectid).findUnique();
	}

	public String createIntakeKey() {
		String intakeKey = UUID.randomUUID().toString().replaceAll("-", "");

		// Make sure it is unique...
		Boolean isUnique = false;
		while (!isUnique) {
			RemovedIntake intake = RemovedIntake.findByIntakeKey(intakeKey);
			if (intake != null) {
				// Found intake, not unique...
				Logger.debug(
						"Intake.createIntakeKey: intake Key " + intakeKey + " is not unique, creating a new one...");
			} else {
				// intake Key is unique...
				Logger.debug("Intake.createIntakeKey: intake Key " + intakeKey + " is unique.");
				isUnique = true;
			}
		}

		return intakeKey;
	}

	/**
	 * Retrieves a profile by unique profile key
	 *
	 * @param unique
	 *            profile key
	 * @return a profile if the unique profile key is found, null otherwise.
	 */
	public static RemovedIntake findByIntakeKey(String intakeKey) {
		return find.where().eq("intakekey", intakeKey).findUnique();
	}

	/**
	 * Retrieves a profile by unique user key
	 *
	 * @param unique
	 *            user key
	 * @return a profile if the unique user key is found, null otherwise.
	 */
	public static List<RemovedIntake> findAllByUserKey(String userkey) {
		return find.where().eq("userkey", userkey).findList();
	}

	public static List<RemovedIntake> findByCurrentUser(String userkey, RoleType role) {
		// Return intake that belongs to current user...
		// First, determine role...
		// Second, find by userkey...
		String columnToSearch = "";
		switch (role.toString()) {
		case "1":
			columnToSearch = "baassignedkey";
			break;
		case "2":
			columnToSearch = "seassignedkey";
			break;
		case "3":
			columnToSearch = "bamanagerkey";
			break;
		case "4":
			columnToSearch = "seamanagerkey";
			break;
		default:
			columnToSearch = "userkey";
			break;
		}

		return find.where().eq(columnToSearch, userkey).findList();
	}

	public static List<RemovedIntake> filterByRequestStatus(String userkey, RoleType role, String value) {
		// Return intake that belongs to current user...
		// First, determine role...
		// Second, find by userkey...
		String columnToSearch = "";
		switch (role.toString()) {
		case "1":
			columnToSearch = "baassignedkey";
			break;
		case "2":
			columnToSearch = "seassignedkey";
			break;
		case "3":
			columnToSearch = "bamanagerkey";
			break;
		case "4":
			columnToSearch = "seamanagerkey";
			break;
		default:
			columnToSearch = "userkey";
			break;
		}
		return find.where().eq(columnToSearch, userkey).eq("requeststatus", value).findList();
	}

	public static List<RemovedIntake> filterByAgency(String userkey, RoleType role, String value) {
		// Return intake that belongs to current user...
		// First, determine role...
		// Second, find by userkey...
		String columnToSearch = "";
		switch (role.toString()) {
		case "1":
			columnToSearch = "baassignedkey";
			break;
		case "2":
			columnToSearch = "seassignedkey";
			break;
		case "3":
			columnToSearch = "bamanagerkey";
			break;
		case "4":
			columnToSearch = "seamanagerkey";
			break;
		default:
			columnToSearch = "userkey";
			break;
		}
		return find.where().eq(columnToSearch, userkey).eq("agency", value).findList();
	}

}
