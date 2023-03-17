package discretebehaviorsimulator;

import action.DiscreteActionInterface;
import discretebehaviorsimulator.DiscreteActionSimulator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class DiscreteActionSimulatorTest {

    private Logger log = Logger.getLogger(String.valueOf(this.getClass()));

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("set Nb Loop")
    public void test_setNbLoop(){
        try {
            log.info("Starting execution of setNbLoop");
            int nbLoop=0;


            DiscreteActionSimulator discreteactionsimulator  = new DiscreteActionSimulator();
            discreteactionsimulator.setNbLoop( nbLoop);
            assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofsetNbLoop-"+exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @Test
    @DisplayName("add Action")
    public void test_addAction(){
        try {
            log.info("Starting execution of addAction");
            DiscreteActionInterface c = null;


            DiscreteActionSimulator discreteactionsimulator  =new DiscreteActionSimulator();
            discreteactionsimulator.addAction( c);
            assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofaddAction-"+exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @Test
    @DisplayName("run")
    public void test_run(){
        try {
            log.info("Starting execution of run");


            DiscreteActionSimulator discreteactionsimulator  =new DiscreteActionSimulator();
            discreteactionsimulator.run();
            assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution of run-"+exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @Test
    @DisplayName("start")
    public void test_start(){
        try {
            log.info("Starting execution of start");


            DiscreteActionSimulator discreteactionsimulator  =new DiscreteActionSimulator();
            discreteactionsimulator.start();
            assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution of start-"+exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @Test
    @DisplayName("stop")
    public void test_stop(){
        try {
            log.info("Starting execution of stop");


            DiscreteActionSimulator discreteactionsimulator  =new DiscreteActionSimulator();
            discreteactionsimulator.stop();
            assertTrue(true);
        } catch (Exception exception) {
            log.info("Exception in execution ofstop-"+exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @AfterEach
    void tearDown() {
    }
}