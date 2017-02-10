/**
 * 
 */
package models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

import play.Logger;
import play.data.format.Formats;
import play.data.validation.Constraints;

/**
 * @author zellerd
 *
 */

@Entity
public class IntakeAudit extends Model {

	@Id
	public Long id;

	@Constraints.Required
	public String intakekey;
	
	@Constraints.Required
	public String editor;
	
	@Constraints.Required
	public String editoremail;
	
	@Constraints.Required
	public String editorkey;
	
	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date editdate;
	
	@Constraints.Required
	public String fieldname;
	
	@Constraints.Required
	public String fielddisplay;
	
	@Constraints.Required
	@Constraints.MaxLength(2500)
	public String oldvalue;
	
	@Constraints.Required
	@Constraints.MaxLength(2500)
	public String newvalue;
	
	@Constraints.Required
	public String auditkey;
	
	 // -- Queries (long id, profile.class)
    public static Model.Finder<Long, IntakeAudit> find = new Model.Finder<Long, IntakeAudit>(Long.class, IntakeAudit.class);
	
	public String createAuditKey() {
		String auditKey = null;

		// Make sure it is unique...
		auditKey = UUID.randomUUID().toString().replaceAll("-", "");
		Boolean isUnique = false;
		while (!isUnique) {
			IntakeAudit intake = IntakeAudit.findByAuditKey(auditKey);
			if (intake != null) {
				// Found intake, not unique...
				Logger.debug("IntakeAudit.createAuditKey: audit Key " + auditKey + " is not unique, creating a new one...");
				auditKey = UUID.randomUUID().toString().replaceAll("-", "");
			} else {
				// intake Key is unique...
				Logger.debug("IntakeAudit.createAuditKey: audit Key " + auditKey + " is unique.");
				isUnique = true;
			}
		}

		return auditKey;
	}

	public static IntakeAudit findByAuditKey(String auditKey) {
		return find.where().eq("auditkey", auditKey).findUnique();
	}
	
	public static List<IntakeAudit> findByIntakeKey(String intakeKey) {
		return find.where().eq("intakekey", intakeKey).findList();
	}

	
}
