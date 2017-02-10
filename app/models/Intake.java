package models;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
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
public class Intake extends Model {
	
	@Id
	public Long id;

	public String projectid;

	public String projectname;

	@Constraints.MaxLength(2500)
	public String summary;

	public String projectstatus;

	public String agency;

	public String requestor;

	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date daterequested;

	public String howrequested;

	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date initialmeetdate;

	public String initialmeetcomments;

	public String requeststatus;

	public String bamanager;

	public String bamanageremail;

	public String bamanagerkey;

	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date baassigneddate;

	public String baassigned;

	public String baassignedemail;

	public String baassignedkey;

	public String badeliverable;

	public String bataskstatus;

	public Integer batimeestimate;

	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date batargetdate;

	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date bacompletiondate;

	public String semanager;

	public String semanageremail;

	public String semanagerkey;

	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date seassigneddate;

	public String seassigned;

	public String seassignedemail;

	public String seassignedkey;

	public String sedeliverable;

	public String setaskstatus;

	public Integer setimeestimate;

	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date setargetdate;

	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date secompletiondate;

	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date datecreated;

	@Constraints.Required
	public String intakekey;

	public String userkey;

	public String editkey;

	public String updatedby;
	
	public String toStartEvolution;

	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date dateupdated;

	// -- Queries (long id, profile.class)
	public static Model.Finder<Long, Intake> find = new Model.Finder<Long, Intake>(Long.class, Intake.class);

	public static List<Intake> filterByAgency(String userkey, RoleType role, String value) {
		// Return intake that belongs to current user...
		// First, determine role...
		// Second, find by userkey...
		String columnToSearch = "";
		Boolean getAll = false;
		switch (role.toString()) {
		case "1":
			columnToSearch = "baassignedkey";
			break;
		case "2":
			columnToSearch = "seassignedkey";
			break;
		case "3":
			columnToSearch = "bamanagerkey";
			getAll = true;
			break;
		case "4":
			columnToSearch = "seamanagerkey";
			getAll = true;
			break;
		default:
			columnToSearch = "userkey";
			break;
		}
		if (getAll == true) {
			return find.where().eq("agency", value).eq("projectstatus", "Open").findList();
		} else {
			return find.where().eq(columnToSearch, userkey).eq("agency", value).eq("projectstatus", "Open").findList();
		}		
	}
	
	public static List<Intake> filterByBA(String userkey, RoleType role, String value) {
		// Return intake that belongs to current user...
		// First, determine role...
		// Second, find by userkey...
		String columnToSearch = "";
		Boolean getAll = false;
		switch (role.toString()) {
		case "1":
			columnToSearch = "baassignedkey";
			break;
		case "2":
			columnToSearch = "seassignedkey";
			break;
		case "3":
			columnToSearch = "bamanagerkey";
			getAll = true;
			break;
		case "4":
			columnToSearch = "seamanagerkey";
			getAll = true;
			break;
		default:
			columnToSearch = "userkey";
			break;
		}
		if (getAll == true) {
			return find.where().eq("baassigned", value).eq("projectstatus", "Open").findList();
		} else {
			return find.where().eq(columnToSearch, userkey).eq("baassigned", value).eq("projectstatus", "Open").findList();
		}		
	}

	public static List<Intake> filterByRequestStatus(String userkey, RoleType role, String value) {
		// Return intake that belongs to current user...
		// First, determine role...
		// Second, find by userkey...
		String columnToSearch = "";
		Boolean getAll = false;
		switch (role.toString()) {
		case "1":
			columnToSearch = "baassignedkey";
			break;
		case "2":
			columnToSearch = "seassignedkey";
			break;
		case "3":
			columnToSearch = "bamanagerkey";
			getAll = true;
			break;
		case "4":
			columnToSearch = "seamanagerkey";
			getAll = true;
			break;
		default:
			columnToSearch = "userkey";
			break;
		}
		if (getAll == true) {
			return find.where().eq("requeststatus", value).eq("projectstatus", "Open").findList();
		} else {
			return find.where().eq(columnToSearch, userkey).eq("requeststatus", value).eq("projectstatus", "Open").findList();
		}		
	}
	
	public static List<Intake> filterBySE(String userkey, RoleType role, String value) {
		// Return intake that belongs to current user...
		// First, determine role...
		// Second, find by userkey...
		String columnToSearch = "";
		Boolean getAll = false;
		switch (role.toString()) {
		case "1":
			columnToSearch = "baassignedkey";
			break;
		case "2":
			columnToSearch = "seassignedkey";
			break;
		case "3":
			columnToSearch = "bamanagerkey";
			getAll = true;
			break;
		case "4":
			columnToSearch = "seamanagerkey";
			getAll = true;
			break;
		default:
			columnToSearch = "userkey";
			break;
		}
		if (getAll == true) {
			return find.where().eq("seassigned", value).eq("projectstatus", "Open").findList();
		} else {
			return find.where().eq(columnToSearch, userkey).eq("seassigned", value).eq("projectstatus", "Open").findList();
		}		
	}
	
	public static List<Intake> findAllActive() {
		return find.where().ne("projectstatus", "Closed").findList();
	}

	/**
	 * Retrieves a profile by unique user key
	 *
	 * @param unique
	 *            user key
	 * @return a profile if the unique user key is found, null otherwise.
	 */
	public static List<Intake> findAllByUserKey(String userkey) {
		return find.where().eq("userkey", userkey).findList();
	}

	public static List<Intake> findByAgency(String agency) {
		return find.where().eq("agency", agency).findList();
	}

	public static List<Intake> findByCurrentUser(String userkey, RoleType role) {
		// Return intake records that belongs to current user...
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

	/**
	 * Retrieves a profile by unique profile key
	 *
	 * @param unique
	 *            profile key
	 * @return a profile if the unique profile key is found, null otherwise.
	 */
	public static Intake findByIntakeKey(String intakeKey) {
		return find.where().eq("intakekey", intakeKey).findUnique();
	}

	public static Intake findByProjectID(String projectid) {
		return find.where().eq("projectid", projectid).findUnique();
	}
	
	public static List<Intake> findByProjectIDWilcard(String projectid) {
		return find.where().like("projectid", "%" + projectid + "%").findList();
	}
	
	public static List<Intake> findByProjectIDWilcardBASE(RoleType role, String projectid, String userkey) {
		String columnToSearch = "";
		switch (role) {
		case BA:
			columnToSearch = "baassignedkey";
			break;
		case SE:
			columnToSearch = "seassignedkey";
			break;
		default:
			columnToSearch = "userkey";
			break;
		}
		return find.where().like("projectid", "%" + projectid + "%").eq(columnToSearch, userkey).findList();
	}

	public static List<String> getAgencyNames() {
		List<Intake> intakeList = find.select("agency").findList();
		List<String> stringArray = new ArrayList<String>();
		for (Intake intake : intakeList) {
			stringArray.add(intake.agency);
		}
		return stringArray;
	}

	public static Integer getAgencyTotal(String value) {
		List<Intake> intakeList = find.where().eq("agency", value).findList();		
		if(intakeList != null) {
			return intakeList.size();
		} else {
			return 0;
		}		
	}

	public static String getFieldValue(String intakekey, String fieldName) {
		// Send column name and return that specific value...
		Intake intake = find.select(fieldName).where().eq("intakekey", intakekey).findUnique();
		String fieldValue = "";
		return fieldValue;
	}
	
	public static List<String> getSENames() {
		List<Intake> intakeList = find.select("seassigned").findList();
		List<String> stringArray = new ArrayList<String>();
		for (Intake intake : intakeList) {
			stringArray.add(intake.seassigned);
		}
		return stringArray;
	}
	
	public static Integer getSETotal(String value) {
		List<Intake> intakeList = find.where().eq("seassigned", value).findList();		
		if(intakeList != null) {
			return intakeList.size();
		} else {
			return 0;
		}		
	}
	
	public static Integer getBAUtilization(String value) {
		List<Intake> intakeList = find.where().eq("baassigned", value).findList();		
		if(intakeList != null) {
			//return intakeList.size();
			// Cycle through and add time...
			Integer total = 0;
			Integer currentTotal = 0;
			for (Intake intake : intakeList) {
				currentTotal = intake.batimeestimate;
				if(total == 0) {
					total = currentTotal;
				} else {
					total = total + currentTotal;
				}
			}			
			return total;
		} else {
			return 0;
		}		
	}
	
	public static Integer getSEUtilization(String value) {
		List<Intake> intakeList = find.where().eq("seassigned", value).findList();		
		if(intakeList != null) {
			//return intakeList.size();
			// Cycle through and add time...
			Integer total = 0;
			Integer currentTotal = 0;
			for (Intake intake : intakeList) {
				currentTotal = intake.setimeestimate;
				if(total == 0) {
					total = currentTotal;
				} else {
					total = total + currentTotal;
				}
			}			
			return total;
		} else {
			return 0;
		}		
	}
	
	public static List<Intake> getDueThisWeek() {
		// Need to search for a date range...
		// Get today's date and find the Monday and Friday...
		// However, to use the FIND method, we need to be greater than Sunday and less than Saturday...
		// Use as the date range...
		LocalDate today = LocalDate.now();
		// Go backward to get Sunday...
		LocalDate sunday = today;
		while (sunday.getDayOfWeek() != DayOfWeek.SUNDAY) {
			sunday = sunday.minusDays(1);
		}
		// Go forward to get Friday...
		LocalDate saturday = today;
		while (saturday.getDayOfWeek() != DayOfWeek.SATURDAY) {
			saturday = saturday.plusDays(1);
		}

		Logger.debug("Intake getDueThisWeek - Sunday = " + sunday);
		Logger.debug("Intake getDueThisWeek - Saturday = " + saturday);

		// Query...
		return find.where().gt("setargetdate", sunday).lt("setargetdate", saturday).findList();
	}

	public String createIntakeKey() {
		String intakeKey = null;

		// Make sure it is unique...
		intakeKey = UUID.randomUUID().toString().replaceAll("-", "");
		Boolean isUnique = false;
		while (!isUnique) {
			Intake intake = Intake.findByIntakeKey(intakeKey);
			if (intake != null) {
				// Found intake, not unique...
				Logger.debug(
						"Intake.createIntakeKey: intake Key " + intakeKey + " is not unique, creating a new one...");
				intakeKey = UUID.randomUUID().toString().replaceAll("-", "");
			} else {
				// intake Key is unique...
				Logger.debug("Intake.createIntakeKey: intake Key " + intakeKey + " is unique.");
				isUnique = true;
			}
		}

		return intakeKey;
	}

}
