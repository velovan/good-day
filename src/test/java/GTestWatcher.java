import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
 
public class GTestWatcher extends TestWatcher {
    private final Logger log;

    public GTestWatcher() {
        log = LogManager.getLogger();
    }

    @Override
    public void failed(Throwable e, Description description) {
        log.log(Level.ERROR ,description + " Failed - ", e);
    }

    @Override
    public void succeeded(Description description) {
        log.log(Level.DEBUG, description + " OK");
    }
}
