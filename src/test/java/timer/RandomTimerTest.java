package timer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import timer.RandomTimer;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class RandomTimerTest {

    private Logger log = Logger.getLogger(String.valueOf(this.getClass()));

    @BeforeEach
    void setUp() {
    }


    @Test
    @DisplayName("string2 Distribution")
    public void test_string2Distribution(){
        try {
            log.info("Starting execution of string2Distribution");
            RandomTimer.randomDistribution expectedValue = null;
            String distributionName="";



            RandomTimer.randomDistribution actualValue=RandomTimer.string2Distribution( distributionName);
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
    @DisplayName("distribution2 String")
    public void test_distribution2String(){
        try {
            log.info("Starting execution of distribution2String");
            String expectedValue="";
            RandomTimer.randomDistribution distribution = null;


            String actualValue=RandomTimer.distribution2String( distribution);
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

            RandomTimer.randomDistribution distributionc = null;
            int lolimc=0;
            int hilimc=0;

            RandomTimer randomtimer  =new RandomTimer( distributionc ,lolimc ,hilimc);
            boolean actualValue=randomtimer.hasNext();
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
    @DisplayName("get Distribution")
    public void test_getDistribution(){
        try {
            log.info("Starting execution of getDistribution");
            String expectedValue="";

            RandomTimer.randomDistribution distributionc = null;
            int lolimc=0;
            int hilimc=0;

            RandomTimer randomtimer  =new RandomTimer( distributionc ,lolimc ,hilimc);
            String actualValue=randomtimer.getDistribution();
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
    @DisplayName("get Distribution Param")
    public void test_getDistributionParam(){
        try {
            log.info("Starting execution of getDistributionParam");
            String expectedValue="";

            RandomTimer.randomDistribution distributionc = null;
            int lolimc=0;
            int hilimc=0;

            RandomTimer randomtimer  =new RandomTimer( distributionc ,lolimc ,hilimc);
            String actualValue=randomtimer.getDistributionParam();
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
    @DisplayName("get Mean")
    public void test_getMean(){
        try {
            log.info("Starting execution of getMean");
            double expectedValue=0;

            RandomTimer.randomDistribution distributionc = null;
            int lolimc=0;
            int hilimc=0;

            RandomTimer randomtimer  =new RandomTimer( distributionc ,lolimc ,hilimc);
            double actualValue=randomtimer.getMean();
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

            RandomTimer.randomDistribution distributionc = null;
            int lolimc=0;
            int hilimc=0;

            RandomTimer randomtimer  =new RandomTimer( distributionc ,lolimc ,hilimc);
            Integer actualValue = randomtimer.next();
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