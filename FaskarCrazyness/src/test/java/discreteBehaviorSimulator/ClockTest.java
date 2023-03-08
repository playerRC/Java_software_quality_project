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
		c1 = Clock.getInstance();
		c2 = Clock.getInstance();
	}

	@Test
	void testGetInstance() {
		assertSame(c1,c2);
	}
	
	

}
