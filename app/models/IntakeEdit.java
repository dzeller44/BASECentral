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
public class IntakeEdit extends Model {

	@Id
	public Long id;
	
	@Constraints.Required
	public String editkey;

	@Constraints.Required
	public String projectid;
	
	@Constraints.Required
	public String projectname;

	@Constraints.Required
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
	
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date initialmeetdate;

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
	
	@Constraints.Required
	public String badeliverable;
	
	@Constraints.Required
	public String bataskstatus;
	
	public Integer batimeestimate;
	
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date batargetdate;
	
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
	
	@Constraints.Required
	public String sedeliverable;
	
	@Constraints.Required
	public String setaskstatus;
	
	public Integer setimeestimate;
	
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date setargetdate;
	
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

    // -- Queries (long id, profile.class)
    public static Model.Finder<Long, IntakeEdit> find = new Model.Finder<Long, IntakeEdit>(Long.class, IntakeEdit.class);
    
    /**
     * Retrieve a profile by business name.
     *
     * @param name to search
     * @return a profile
     */
    public static IntakeEdit findByProjectID(String projectid) {
        return find.where().eq("projectid", projectid).findUnique();
    }
    
	public String createEditKey() {
		String editKey = null;

		// Make sure it is unique...
		editKey = UUID.randomUUID().toString().replaceAll("-", "");
		Boolean isUnique = false;
		while (!isUnique) {
			IntakeEdit intake = IntakeEdit.findByEditKey(editKey);
			if (intake != null) {
				// Found intake, not unique...
				Logger.debug("Intake.createEditKey: intake Key " + editKey + " is not unique, creating a new one...");
				editKey = UUID.randomUUID().toString().replaceAll("-", "");
			} else {
				// intake Key is unique...
				Logger.debug("Intake.createEditKey: intake Key " + editKey + " is unique.");
				isUnique = true;
			}
		}
		return editKey;
	}

	/**
	 * Retrieves a profile by unique profile key
	 *
	 * @param unique profile key
	 * @return a profile if the unique profile key is found, null otherwise.
	 */
	public static IntakeEdit findByIntakeKey(String intakeKey) {
		return find.where().eq("intakekey", intakeKey).findUnique();
	}
	
	public static IntakeEdit findByEditKey(String editKey) {
		return find.where().eq("editkey", editKey).findUnique();
	}
	
	/**
	 * Retrieves a profile by unique user key
	 *
	 * @param unique user key
	 * @return a profile if the unique user key is found, null otherwise.
	 */
	public static List<IntakeEdit> findAllByUserKey(String userkey) {
		return find.where().eq("userkey", userkey).findList();
	}
	
	public static List<IntakeEdit> findByCurrentUser(String userkey, RoleType role) {
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
	
	public static List<IntakeEdit> filterByRequestStatus(String userkey, RoleType role, String value) {
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
		return find
				.where()
				.eq(columnToSearch, userkey)
				.eq("requeststatus", value)
				.findList();
	}
	
	public static List<IntakeEdit> filterByAgency(String userkey, RoleType role, String value) {
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
		return find
				.where()
				.eq(columnToSearch, userkey)
				.eq("agency", value)
				.findList();
	}

	
}
