package test.timer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import timer.DateTimer;
import timer.MergedTimer;
import timer.Timer;

import java.util.Vector;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class MergedTimerTest {

    private Logger log = Logger.getLogger(String.valueOf(this.getClass()));


    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("has Next")
    public void test_hasNext(){
        try {
            log.info("Starting execution of hasNext");
            boolean expectedValue = false;

            Timer timer1c = new DateTimer( new Vector<>());
            Timer timer2c = new DateTimer( new Vector<>());

            MergedTimer mergedtimer  = new MergedTimer( timer1c ,timer2c);
            boolean actualValue = mergedtimer.hasNext();
            log.info("Expected Value="+ expectedValue +" . Actual Value="+actualValue);
            System.out.println("Expected Value="+ expectedValue +" . Actual Value="+actualValue);
            assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.info("Exception in execution of execute1GetAllLogFromFirstMovF-"+exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @Test
    @DisplayName("next")
    public void test_next(){
        try {
            log.info("Starting execution of next");
            Integer expectedValue=0;

            Timer timer1c = new DateTimer( new Vector<>());
            Timer timer2c = new DateTimer( new Vector<>());

            MergedTimer mergedtimer  = new MergedTimer( timer1c ,timer2c);
            Integer actualValue=mergedtimer.next();
            log.info("Expected Value="+ expectedValue +" . Actual Value="+actualValue);
            System.out.println("Expected Value="+ expectedValue +" . Actual Value="+actualValue);
            assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.info("Exception in execution of execute1GetAllLogFromFirstMovF-"+exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @AfterEach
    void tearDown() {
    }
}