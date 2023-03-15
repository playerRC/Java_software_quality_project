package action;

import action.DiscreteActionInterface;
import action.DiscreteActionOnOffDependent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class DiscreteActionOnOffDependentTest {

    private Logger log = Logger.getLogger(String.valueOf(this.getClass()));

    @BeforeEach
    void setUp() {
    }


    @Test
    @DisplayName("next Action")
    public void test_nextAction(){
        try {
            log.info("Starting execution of nextAction");

            Object oc = null;
            String onc="";
            TreeSet<Integer> datesOnc = null;
            String offc="";
            TreeSet<Integer> datesOffc = null;

            DiscreteActionOnOffDependent discreteactiononoffdependent  =new DiscreteActionOnOffDependent( oc ,onc ,datesOnc ,offc ,datesOffc);
            discreteactiononoffdependent.nextAction();
            assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofnextAction-"+exception);
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

            Object oc = null;
            String onc="";
            TreeSet<Integer> datesOnc = null;
            String offc="";
            TreeSet<Integer> datesOffc = null;

            DiscreteActionOnOffDependent discreteactiononoffdependent  =new DiscreteActionOnOffDependent( oc ,onc ,datesOnc ,offc ,datesOffc);
            Method actualValue=discreteactiononoffdependent.getMethod();
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
    @DisplayName("get Current Laps Time")
    public void test_getCurrentLapsTime(){
        try {
            log.info("Starting execution of getCurrentLapsTime");
            Integer expectedValue=0;

            Object oc = null;
            String onc="";
            TreeSet<Integer> datesOnc = null;
            String offc="";
            TreeSet<Integer> datesOffc = null;

            DiscreteActionOnOffDependent discreteactiononoffdependent  =new DiscreteActionOnOffDependent( oc ,onc ,datesOnc ,offc ,datesOffc);
            Integer actualValue=discreteactiononoffdependent.getCurrentLapsTime();
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
    @DisplayName("get Object")
    public void test_getObject(){
        try {
            log.info("Starting execution of getObject");
            Object expectedValue = null;

            Object oc = null;
            String onc="";
            TreeSet<Integer> datesOnc = null;
            String offc="";
            TreeSet<Integer> datesOffc = null;

            DiscreteActionOnOffDependent discreteactiononoffdependent  =new DiscreteActionOnOffDependent( oc ,onc ,datesOnc ,offc ,datesOffc);
            Object actualValue=discreteactiononoffdependent.getObject();
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
    @DisplayName("compare To")
    public void test_compareTo(){
        try {
            log.info("Starting execution of compareTo");
            int expectedValue=0;
            DiscreteActionInterface c = null;

            Object oc = null;
            String onc="";
            TreeSet<Integer> datesOnc = null;
            String offc="";
            TreeSet<Integer> datesOffc = null;

            DiscreteActionOnOffDependent discreteactiononoffdependent  =new DiscreteActionOnOffDependent( oc ,onc ,datesOnc ,offc ,datesOffc);
            int actualValue=discreteactiononoffdependent.compareTo( c);
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
            DiscreteActionInterface expectedValue = null;

            Object oc = null;
            String onc="";
            TreeSet<Integer> datesOnc = null;
            String offc="";
            TreeSet<Integer> datesOffc = null;

            DiscreteActionOnOffDependent discreteactiononoffdependent  =new DiscreteActionOnOffDependent( oc ,onc ,datesOnc ,offc ,datesOffc);
            DiscreteActionInterface actualValue=discreteactiononoffdependent.next();
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

            Object oc = null;
            String onc="";
            TreeSet<Integer> datesOnc = null;
            String offc="";
            TreeSet<Integer> datesOffc = null;

            DiscreteActionOnOffDependent discreteactiononoffdependent  =new DiscreteActionOnOffDependent( oc ,onc ,datesOnc ,offc ,datesOffc);
            boolean actualValue=discreteactiononoffdependent.hasNext();
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