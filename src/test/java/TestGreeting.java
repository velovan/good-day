import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;


import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertTrue;
 
public class TestGreeting {
    private Locale defaultLocale = Locale.getDefault();
    private ResourceBundle rb = ResourceBundle.getBundle("greeting", defaultLocale);
    private String comparableString = "";
    private String morningGreeting = rb.getString("my.morning");
    private String dayGreeting = rb.getString("my.day");
    private String eveningGreeting = rb.getString("my.evening");
    private String nightGreeting = rb.getString("my.night");

    @Rule
    public TestWatcher watchman = new GTestWatcher();

    @Test
    public void testMorningGreeting6(){
        assertTrue(morningGreeting.equals(Greeting.getGreeting(6)));
    }

    @Test
    public void testMorningGreeting7(){
        assertTrue(morningGreeting.equals(Greeting.getGreeting(7)));
    }

    @Test
    public void testMorningGreeting8(){
        assertTrue(morningGreeting.equals(Greeting.getGreeting(8)));
    }

    @Test
    public void testDayGreeting9(){
        assertTrue(dayGreeting.equals(Greeting.getGreeting(9)));
    }

    @Test
    public void testDayGreeting10(){
        assertTrue(dayGreeting.equals(Greeting.getGreeting(10)));
    }

    @Test
    public void testDayGreeting18(){
        assertTrue(dayGreeting.equals(Greeting.getGreeting(18)));
    }

    @Test
    public void testEveningGreeting19(){
        assertTrue(eveningGreeting.equals(Greeting.getGreeting(19)));
    }

    @Test
    public void testEveningGreeting22(){
        assertTrue(eveningGreeting.equals(Greeting.getGreeting(22)));
    }

    @Test
    public void testNightGreeting23(){
        assertTrue(nightGreeting.equals(Greeting.getGreeting(23)));
    }

    @Test
    public void testNightGreeting0(){
        assertTrue(nightGreeting.equals(Greeting.getGreeting(0)));
    }

    @Test
    public void testNightGreeting1(){
        assertTrue(nightGreeting.equals(Greeting.getGreeting(1)));
    }

    @Test
    public void testNightGreeting5(){
        assertTrue(nightGreeting.equals(Greeting.getGreeting(5)));
    }
 
}
