package timer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import timer.OneShotTimer;

class OneShotTimerTest {
	OneShotTimer timer;
	
	
	@Test
	void setUp() {
		timer = new OneShotTimer(1);
	}
	
	@Test
	void hasNextTest() {
		setUp();
		assertTrue(timer.hasNext());
	}
	
	@Test
	void nextTest() {
		setUp();
		assertEquals(timer.next(), 1);
		assertEquals(timer.next(), null);
	}
	
	
}
