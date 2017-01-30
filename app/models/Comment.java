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
public class Comment extends Model {

	@Id
	public Long id;
	
	@Constraints.Required
	public String author;
	
	@Constraints.Required
	public String authoremail;
	
	@Constraints.Required
	public String comment;
	
	@Constraints.Required
	public String intakekey;
	
	@Constraints.Required
	public String commentkey;
	
	@Constraints.Required
	public String userkey;
	
	@Constraints.Required
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date datecreated;
	
	// -- Queries (long id, profile.class)
	public static Model.Finder<Long, Comment> find = new Model.Finder<Long, Comment>(Long.class, Comment.class);
	
	public static Comment findByCommentKey(String commentKey) {
		return find.where().eq("commentkey", commentKey).findUnique();
	}
	
	public static List<Comment> getAllByIntakeKey(String intakeKey) {
		return find.where().eq("intakekey", intakeKey).findList();
	}
	
	public String createCommentKey() {
		String commentKey = null;

		// Make sure it is unique...
		commentKey = UUID.randomUUID().toString().replaceAll("-", "");
		Boolean isUnique = false;
		while (!isUnique) {
			Comment comment = Comment.findByCommentKey(commentKey);
			if (comment != null) {
				// Found key, not unique...
				Logger.debug(
						"Comment.createCommentKey: intake Key " + commentKey + " is not unique, creating a new one...");
				commentKey = UUID.randomUUID().toString().replaceAll("-", "");
			} else {
				// Key is unique...
				Logger.debug("Comment.createCommentKey: intake Key " + commentKey + " is unique.");
				isUnique = true;
			}
		}

		return commentKey;
	}
}
