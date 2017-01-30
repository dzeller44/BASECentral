package controllers;

import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.dashboard.index;

/**
 * User: yesnault
 * Date: 22/01/12
 */
//@Security.Authenticated(Secured.class)
public class Dashboard extends Controller {

    public Result index() {
        return ok(index.render(User.findByEmail(request().username())));
    }
    
    public Result indexChoice() {
    	// Grab what link the user clicked...
    	// session???
    	// Open the default page - search?
    	
    	
    	
        return ok(index.render(User.findByEmail(request().username())));
    }
}
