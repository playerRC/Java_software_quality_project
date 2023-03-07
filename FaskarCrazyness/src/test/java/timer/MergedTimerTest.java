package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;
import timer.DateTimer;
import timer.PeriodicTimer;
import timer.OneShotTimer;
import timer.MergedTimer;

class MergedTimerTest {

	DateTimer dateTimer1;
	TreeSet<Integer> tree1;
	
	DateTimer dateTimer2;
	TreeSet<Integer> tree2;
	
	
	PeriodicTimer periodicTimer1;
	PeriodicTimer periodicTimer2;
	
	OneShotTimer oneShotTimer1;
	OneShotTimer oneShotTimer2;

	MergedTimer mergedTimer1;
	MergedTimer mergedTimer2;
	MergedTimer mergedTimer3;
	MergedTimer mergedTimer4;
	MergedTimer mergedTimer5;
	MergedTimer mergedTimer6;
	@Test
	void setUp() {
		/*dateTimer objects*/
		tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(5);
		tree1.add(8);
		dateTimer1 = new DateTimer(tree1);
		
		tree2 = new TreeSet<Integer>();
		tree2.add(3);
		tree2.add(6);
		tree2.add(8);
		dateTimer2 = new DateTimer(tree2);
		
		/*PeriodicTimer objects*/
		periodicTimer1 = new PeriodicTimer(10);
		periodicTimer2 = new PeriodicTimer(1);
		
		/*OneshotTimer objects*/
		oneShotTimer1 = new OneShotTimer(1);
		oneShotTimer2 = new OneShotTimer(2);
		
		
		/*merging*/
		
		mergedTimer1 = new MergedTimer(dateTimer1, dateTimer2);
		mergedTimer2 = new MergedTimer(periodicTimer1, periodicTimer2);
		mergedTimer3 = new MergedTimer(oneShotTimer1, oneShotTimer2);
		mergedTimer4 = new MergedTimer(mergedTimer1, mergedTimer2);
		mergedTimer5 = new MergedTimer(dateTimer1, periodicTimer1);
		mergedTimer6 = new MergedTimer(oneShotTimer1, mergedTimer5);
		
	}
	
	@Test 
	void hasNextTest() {
		setUp();
		assertTrue(mergedTimer4.hasNext());
		assertTrue(mergedTimer6.hasNext());
	}
	@Test
	void nextTest() {
		setUp();
		assertEquals(mergedTimer4.next(), 15);
		assertEquals(mergedTimer6.next(), 15);
	}

}
