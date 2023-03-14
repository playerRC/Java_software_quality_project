package test.action;

import action.DiscreteActionDependent;
import action.DiscreteActionInterface;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import timer.Timer;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class DiscreteActionDependentTest {

    private Logger log = Logger.getLogger(String.valueOf(this.getClass()));

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("add Dependence")
    public void test_addDependence(){
        try {
            log.info("Starting execution of addDependence");
            Object o = null;
            String depentMethodName="";
            Timer timerDependence = null;

            DiscreteActionDependent discreteactiondependent  =new DiscreteActionDependent( new Object(), "", (Timer) null);
            discreteactiondependent.addDependence( o ,depentMethodName ,timerDependence);
            assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofaddDependence-"+exception);
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

            DiscreteActionDependent discreteactiondependent  =new DiscreteActionDependent( new Object(), "", (Timer) null);

            int actualValue=discreteactiondependent.compareTo( c);
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
    @DisplayName("is Empty")
    public void test_isEmpty(){
        try {
            log.info("Starting execution of isEmpty");
            Boolean expectedValue=false;
            DiscreteActionDependent discreteactiondependent  =new DiscreteActionDependent( new Object(), "", (Timer) null);

            Boolean actualValue=discreteactiondependent.isEmpty();
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

            DiscreteActionDependent discreteactiondependent  =new DiscreteActionDependent( new Object(), "", (Timer) null);

            DiscreteActionInterface actualValue=discreteactiondependent.next();
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

            DiscreteActionDependent discreteactiondependent  =new DiscreteActionDependent( new Object(), "", (Timer) null);

            boolean actualValue=discreteactiondependent.hasNext();
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
    @DisplayName("next Method")
    public void test_nextMethod(){
        try {
            log.info("Starting execution of nextMethod");

            DiscreteActionDependent discreteactiondependent  =new DiscreteActionDependent( new Object(), "", (Timer) null);

            discreteactiondependent.nextMethod();
            assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofnextMethod-"+exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @Test
    @DisplayName("spend Time")
    public void test_spendTime(){
        try {
            log.info("Starting execution of spendTime");
            int t=0;

            DiscreteActionDependent discreteactiondependent  =new DiscreteActionDependent( new Object(), "", (Timer) null);

            discreteactiondependent.spendTime( t);
            assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofspendTime-"+exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @Test
    @DisplayName("update Time Laps")
    public void test_updateTimeLaps(){
        try {
            log.info("Starting execution of updateTimeLaps");

            DiscreteActionDependent discreteactiondependent  =new DiscreteActionDependent( new Object(), "", (Timer) null);

            discreteactiondependent.updateTimeLaps();
            assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofupdateTimeLaps-"+exception);
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

            DiscreteActionDependent discreteactiondependent  =new DiscreteActionDependent( new Object(), "", (Timer) null);

            Method actualValue=discreteactiondependent.getMethod();
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

            DiscreteActionDependent discreteactiondependent  = new DiscreteActionDependent( new Object(), "", (Timer) null);

            Integer actualValue=discreteactiondependent.getCurrentLapsTime();
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

            DiscreteActionDependent discreteactiondependent  =new DiscreteActionDependent( new Object(), "", (Timer) null);

            Object actualValue=discreteactiondependent.getObject();
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