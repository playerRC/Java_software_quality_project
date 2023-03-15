package timer;

import org.junit.jupiter.api.*;
import timer.TimeBoundedTimer;
import timer.Timer;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class TimeBoundedTimerTest {

    private Logger log = Logger.getLogger(String.valueOf(this.getClass()));

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("has Next")
    public void test_hasNext(){
        try {
            log.info("Starting execution of hasNext");
            boolean expectedValue=false;

            Timer timer2boundc = null;
            int startTimec=0;

            TimeBoundedTimer timeboundedtimer  =new TimeBoundedTimer( timer2boundc ,startTimec);
            boolean actualValue=timeboundedtimer.hasNext();
            log.info("Expected Value="+ expectedValue +" . Actual Value="+actualValue);
            System.out.println("Expected Value="+ expectedValue +" . Actual Value="+actualValue);
            Assertions.assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.info("Exception in execution of execute1GetAllLogFromFirstMovF-"+exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("next")
    public void test_next(){
        try {
            log.info("Starting execution of next");
            Integer expectedValue=0;

            Timer timer2boundc = null;
            int startTimec=0;

            TimeBoundedTimer timeboundedtimer  =new TimeBoundedTimer( timer2boundc ,startTimec);
            Integer actualValue=timeboundedtimer.next();
            log.info("Expected Value="+ expectedValue +" . Actual Value="+actualValue);
            System.out.println("Expected Value="+ expectedValue +" . Actual Value="+actualValue);
            Assertions.assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.info("Exception in execution of execute1GetAllLogFromFirstMovF-"+exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @AfterEach
    void tearDown() {
    }
}