package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

import play.data.validation.Constraints;

/**
 * @author zellerd
 *
 */
@Entity
public class Service extends Model {

	@Id
	public Long id;

	@Constraints.Required
	public String name;

	public String shortname;

	public String comment;	

    // -- Queries (long id, profile.class)
    public static Model.Finder<Long, Service> find = new Model.Finder<Long, Service>(Long.class, Service.class);
    
    /**
     * Retrieve a service record by name.
     *
     * @param name to search
     * @return a service record
     */
    public static Service findByName(String name) {
        return find.where().eq("name", name).findUnique();
    }   
    
    	
}
