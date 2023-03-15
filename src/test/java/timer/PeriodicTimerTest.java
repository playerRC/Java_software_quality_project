package timer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PeriodicTimerTest {
	
	
	PeriodicTimer timer1;
	PeriodicTimer timer2;
	

	@BeforeEach
	void setUp() {
		timer1 = new PeriodicTimer(10);
		
		timer2 = new PeriodicTimer(10, 10);
	}
	
	@Test
	void getPeriodTest() {
		assertEquals(timer2.getPeriod(), 10);
	}
	
	@Test
	void nextTest() {
		assertEquals(timer2.next(), 10);
	}
	
	@Test
	void hasNextTest() {
		assertTrue(timer2.hasNext());
	}

}