import com.google.inject.Inject;

import play.*;
import utils.ScheduleEmail;


public class Global extends GlobalSettings {
	@Override
	@Inject
	public void onStart(Application app) {
		Logger.debug("Application started...");
	    ScheduleEmail.scheduleReminder();

	}

	@Override
	public void onStop(Application app) {
		Logger.debug("Application shutdown...");
	}

}
