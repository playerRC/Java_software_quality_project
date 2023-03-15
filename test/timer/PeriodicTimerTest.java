package test.timer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import timer.PeriodicTimer;
import timer.RandomTimer;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class PeriodicTimerTest {

    private Logger log = Logger.getLogger(String.valueOf(this.getClass()));

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("get Period")
    public void test_getPeriod(){
        try {
            log.info("Starting execution of getPeriod");
            int expectedValue=0;

            int periodc=0;
            int atc=0;
            RandomTimer moreOrLessc = null;

            PeriodicTimer periodictimer  =new PeriodicTimer( periodc ,atc ,moreOrLessc);
            int actualValue=periodictimer.getPeriod();
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
            int since=0;

            int periodc=0;
            int atc=0;
            RandomTimer moreOrLessc = null;

            PeriodicTimer periodictimer  =new PeriodicTimer( periodc ,atc ,moreOrLessc);
            Integer actualValue=periodictimer.next();
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
    @DisplayName("has Next")
    public void test_hasNext(){
        try {
            log.info("Starting execution of hasNext");
            boolean expectedValue=false;

            int periodc=0;
            int atc=0;
            RandomTimer moreOrLessc = null;

            PeriodicTimer periodictimer  =new PeriodicTimer( periodc ,atc ,moreOrLessc);
            boolean actualValue=periodictimer.hasNext();
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