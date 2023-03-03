package timer;

import static org.junit.jupiter.api.Assertions.*;
import java.util.TreeSet;
import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import timer.DateTimer;

class DateTimerTest {
	DateTimer date;
	TreeSet<Integer> tree;
	
	DateTimer date2;
	Vector<Integer> lapsTimes;
	
	DateTimer date3;
	Vector<Integer> lapsTimes3;
	
	@BeforeEach
	void setUp() {
		tree = new TreeSet<Integer>();
		tree.add(1);
		tree.add(5);
		tree.add(8);
		
		date = new DateTimer(tree);
		
		/*second constructor*/ 
		lapsTimes = new Vector<Integer>();
		lapsTimes.add(1);
		lapsTimes.add(5);
		lapsTimes.add(8);
		
		date2 = new DateTimer(lapsTimes);
		
		/*empty vector*/
		
		lapsTimes3 = new Vector<Integer>();
		date3 = new DateTimer(lapsTimes3);
	}

	
	@Test
	void hasNextTest() {
		setUp();
		assertTrue(date.hasNext());
		assertFalse(date3.hasNext());
	}
	
	@Test
	void nextTest() {
		setUp();
		assertEquals(date2.next(), 1);
		assertEquals(date3.next(), null);
	}

}
