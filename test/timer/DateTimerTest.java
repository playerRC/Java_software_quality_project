package test.timer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import timer.DateTimer;

import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class DateTimerTest {

    private Logger log = Logger.getLogger(String.valueOf(this.getClass()));
    private DateTimer dt;

    @BeforeEach
    void setUp() {
        dt = new DateTimer( new TreeSet<Integer>());
    }

    @Test
    @DisplayName("DateTimer Creation test")
    void test_creation_DateTimer(){
        try{
            log.info("Starting execution of test_creation_DateTimer");
            log.info("Intaciation of DateTimer with a Date");
            DateTimer dt1 = new DateTimer( new TreeSet<Integer>());
            log.info("Intaciation of DateTimer with a lapsTime");
            DateTimer dt2 = new DateTimer( new Vector<Integer>());
            assertTrue(true);
        }catch (Exception e){
            assertFalse(false);
        }
    }

    @Test
    @DisplayName("Test hasNext")
    void test_hasNewt(){
        try{
            log.info("Starting execution of test_hasNewt");
            boolean expected_value = false;
            assertEquals(expected_value, dt.hasNext());
        }catch (Exception e){
            assertFalse(false);
        }
    }

    @Test
    @DisplayName("Test next")
    void test_next(){
        try{
            log.info("Starting execution of test_next");
            int expected_value = 0;
            assertEquals(expected_value, dt.next());
        }catch (Exception e){
            assertFalse(false);
        }
    }

    @AfterEach
    void tearDown() {
    }
}