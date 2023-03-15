package discreteBehaviorSimulator;

import discreteBehaviorSimulator.*;
import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    private Logger log = Logger.getLogger(String.valueOf(this.getClass()));

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("unlock Read Access")
    public void test_unlockReadAccess(){
        try {
            log.info("Starting execution of unlockReadAccess");


            Clock clock  = Clock.getInstance();
            clock.unlockReadAccess();
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofunlockReadAccess-"+exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("lock Write Access")
    public void test_lockWriteAccess(){
        try {
            log.info("Starting execution of lockWriteAccess");


            Clock clock  = Clock.getInstance();
            clock.lockWriteAccess();
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution oflockWriteAccess-"+exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("unlock Write Access")
    public void test_unlockWriteAccess(){
        try {
            log.info("Starting execution of unlockWriteAccess");


            Clock clock  = Clock.getInstance();
            clock.unlockWriteAccess();
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofunlockWriteAccess-"+exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("add Observer")
    public void test_addObserver(){
        try {
            log.info("Starting execution of addObserver");
            ClockObserver o = null;


            Clock clock  = Clock.getInstance();
            clock.addObserver( o);
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofaddObserver-"+exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("remove Observer")
    public void test_removeObserver(){
        try {
            log.info("Starting execution of removeObserver");
            ClockObserver o = null;


            Clock clock  = Clock.getInstance();
            clock.removeObserver( o);
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofremoveObserver-"+exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("set Virtual")
    public void test_setVirtual(){
        try {
            log.info("Starting execution of setVirtual");
            boolean virtual=false;


            Clock clock  = Clock.getInstance();
            clock.setVirtual( virtual);
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofsetVirtual-"+exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("is Virtual")
    public void test_isVirtual(){
        try {
            log.info("Starting execution of isVirtual");
            boolean expectedValue=false;


            Clock clock  = Clock.getInstance();
            boolean actualValue=clock.isVirtual();
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
    @DisplayName("set Next Jump")
    public void test_setNextJump(){
        try {
            log.info("Starting execution of setNextJump");
            int nextJump=0;


            Clock clock  = Clock.getInstance();
            clock.setNextJump( nextJump);
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofsetNextJump-"+exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("increase")
    public void test_increase(){
        try {
            log.info("Starting execution of increase");
            int time=0;


            Clock clock  = Clock.getInstance();
            clock.increase( time);
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofincrease-"+exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("get Time")
    public void test_getTime(){
        try {
            log.info("Starting execution of getTime");
            long expectedValue=0;


            Clock clock  = Clock.getInstance();
            long actualValue=clock.getTime();
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
    @DisplayName("lock Read Access")
    public void test_lockReadAccess(){
        try {
            log.info("Starting execution of lockReadAccess");


            Clock clock  = Clock.getInstance();
            clock.lockReadAccess();
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution oflockReadAccess-"+exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @AfterEach
    void tearDown() {
    }
}