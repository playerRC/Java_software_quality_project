package timer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import timer.OneShotTimer;

class OneShotTimerTest {
	OneShotTimer timer;
	
	
	@BeforeEach
	void setUp() {
		timer = new OneShotTimer(1);
	}
	
	@Test
	void hasNextTest() {
		assertTrue(timer.hasNext());
	}
	
	@Test
	void nextTest() {
		assertEquals(timer.next(), 1);
		assertEquals(timer.next(), null);
	}
	
	
}
