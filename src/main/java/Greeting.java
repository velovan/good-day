import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;
import java.util.ResourceBundle;
 
public class Greeting {
 
    private static Logger log = LogManager.getLogger(Greeting.class);

    private static final int MORNING = 6;
    private static final int DAY = 9;
    private static final int EVENING = 19;
    private static final int NIGHT = 23;
    private static final int MIDNIGHT = 24;

    public static String getGreeting(int hours) {
     
        log.trace("Current hours: " + hours);
        Locale defaultLocale = Locale.getDefault();
        ResourceBundle rb = ResourceBundle.getBundle("greeting", defaultLocale);

        if(hours >= MORNING && hours < DAY) {
            log.trace("Sending a morning greeting...");
            return rb.getString("my.morning");
        } else if(hours >= DAY && hours < EVENING) {
            log.trace("Sending a day greeting...");
            return rb.getString("my.day");
        } else if(hours >= EVENING && hours < NIGHT) {
            log.trace("Sending an evening greeting...");
            return rb.getString("my.evening");
        } else if((hours >= NIGHT && hours <= MIDNIGHT) ||
                (hours >= 0 && hours < MORNING)) {
            log.trace("Sending a night greeting...");
            return rb.getString("my.night");
        }
        log.warn("From Greeting.getGreeting(String) returning null value!");
        return null;
     
    }
}
