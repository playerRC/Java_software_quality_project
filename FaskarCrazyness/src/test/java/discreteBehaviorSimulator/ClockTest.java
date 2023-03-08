package discreteBehaviorSimulator;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClockTest {

	
	private Clock c1;
	private Clock c2;
	
	@BeforeEach
	void setUp1() throws Exception {
		c1 = new Clock();
		c2 = new Clock();
	}

	@Test
	void testGetInstance() {
		Object ClockInst1 = c1.getInstance();
		Object ClockInst2 = c1.getInstance();
		assertSame(ClockInst1,ClockInst2);
		
	}
	
	

}
