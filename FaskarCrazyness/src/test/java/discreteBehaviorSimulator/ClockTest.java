package discreteBehaviorSimulator;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ClockTest {
    private Clock clock;
    HashSet observers = new HashSet();
    private int time;
    private ReentrantReadWriteLock lock;
    
    
    @BeforeEach
    public void setUp() {
        clock = Clock.getInstance();
        this.observers = new HashSet<>();
        this.time = time;
        lock = new ReentrantReadWriteLock();
    }
    
    public void testGetInstance() {
	    Clock clock2 = Clock.getInstance();
	    assertSame(clock, clock2);
	}
    
    
    @Test
    public void testAddObserver() {
        ClockObserver observer = null;
        clock.addObserver(observer);
        assertFalse(this.observers.contains(observer));
    }
    
    
   
    @Test
    public void testRemoveObserver() {
        ClockObserver observer = null;
        clock.addObserver(observer);
        clock.removeObserver(observer);
        assertFalse(this.observers.contains(observer));
    }
    
    @Test
    public void testSetVirtual() {
        clock.setVirtual(false);
        assertFalse(clock.isVirtual());
    }
    
    @Test
    public void testisVirtual() {
    	clock.setVirtual(true);
		assertEquals(true,clock.isVirtual());
        
    }
   
    @Test
    public void testSetNextJump() {
    	int nextJump = 0;
        clock.setNextJump(nextJump);
        assertEquals(nextJump,this.time);
        
    }
    
    /*
    @Test
    public void testIncrease() throws Exception {
        clock.setNextJump(10);
        assertEquals(0, clock.getTime());
        clock.increase(10);
        assertEquals(10, clock.getTime());
        try {
            clock.increase(5);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("Unexpected time change", e.getMessage());
        }
        
   
        assertEquals(10, clock.getTime());
    }

    @Test
  
    public void testIncreaseUnexpectedTimeChange() {
    	// on configure d'abord l'objet Clock avec une valeur de nextJump de 10
        clock.setNextJump(10);
        // on appelle la méthode increase() avec une valeur différente de 10
        // Lorsque cela se produit, la méthode increase() doit lancer une exception avec le message "Unexpected time change"
        Exception exception = assertThrows(Exception.class, () -> {
            clock.increase(5);
        });
        
        String expectedMessage = "Unexpected time change";
        String actualMessage = exception.getMessage();
        
        assertTrue(actualMessage.contains(expectedMessage));
    }
    */
    
    @Test
    
    public void testGetTime() {
    	clock.setVirtual(true);
		assertEquals(0,clock.getTime());
		clock.setVirtual(false);
		assertEquals(new Date().getTime(), clock.getTime());    
    }

   
   // La méthode getReadLockQueueLength() retourne le nombre de threads en attente pour acquérir un verrou de lecture sur le ReentrantReadWriteLock
   // problème de version j'arrive pas à utiliser les deux méthodes
   /* public void testLockReadAccess() {
        clock.lockReadAccess();
        assertTrue(lock.readLock().getReadLockQueueLength() > 0);
      }

      
      public void testUnlockReadAccess() {
        clock.lockReadAccess();
        clock.unlockReadAccess();
        assertEquals(0,lock.readLock().getReadLockCount());
      }

    */
    @Test
      public void testLockWriteAccess() {
        
        
      }

    @Test
      public void testUnlockWriteAccess() {
        clock.lockWriteAccess();
        clock.unlockWriteAccess();
        assertFalse(lock.isWriteLocked());
      }

      
      public void testToString() {
    	  String expected = "" + this.time;
          assertEquals(expected,clock.toString());
      
      }
    
    
    
    
    
}
