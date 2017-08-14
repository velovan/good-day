import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalTime;
 
public class Main {
    private static Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] ar) {
        LocalTime lt = LocalTime.now();
        String output = Greeting.getGreeting(lt.getHour());
        log.trace("Getting an output: " + output);
        System.out.print(output);
    }
}
