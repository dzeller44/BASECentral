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
	
	public String editkey;

	public String projectid;
	
	public String projectname;

	@Constraints.MaxLength(10000)
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
	
	public String baassigned1;

	public String baassignedemail1;

	public String baassignedkey1;
	
	public String baassigned2;

	public String baassignedemail2;

	public String baassignedkey2;
	
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
	
	public String seassigned1;

	public String seassignedemail1;
	
	public String seassignedkey1;
	
	public String seassigned2;

	public String seassignedemail2;
	
	public String seassignedkey2;
	
	public String sedeliverable;
	
	public String setaskstatus;
	
	public Integer setimeestimate;
	
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date setargetdate;
	
	@Formats.DateTime(pattern = "yyyy-MM-dd")
	public Date secompletiondate;

	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date datecreated;
	
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
