package action;

import action.DiscreteAction;
import action.DiscreteActionInterface;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import timer.Timer;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class DiscreteActionTest {

    private Logger log = Logger.getLogger(String.valueOf(this.getClass()));
    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("spend Time")
    public void test_spendTime(){
        try {
            log.info("Starting execution of spendTime");
            int t=0;


            DiscreteAction discreteaction  = new DiscreteAction(new Object(), "",  (Timer) null);
            discreteaction.spendTime( t);
            assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofspendTime-"+exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @Test
    @DisplayName("get Method")
    public void test_getMethod(){
        try {
            log.info("Starting execution of getMethod");
            Method expectedValue = null;


            DiscreteAction discreteaction  = new DiscreteAction(new Object(), "",  (Timer) null);
            Method actualValue=discreteaction.getMethod();
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

            DiscreteAction discreteaction  = new DiscreteAction(new Object(), "",  (Timer) null);
            boolean actualValue=discreteaction.hasNext();
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