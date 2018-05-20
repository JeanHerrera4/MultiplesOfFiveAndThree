package s4n;

/**
 * 
 * @author Jean Herrera
 *
 */

import static org.junit.Assert.*;
import org.junit.Test;
import s4n.DetermineFizzBuzz;

/**
 * These tests verify the method isMultipleOf, where the first parameter is the number that 
 * we want to verify if it's multiple of the second parameter.
 */

public class DetermineIsMultipleOfTest {

	@Test
	public void testMultipleOfFifteen() {
		
		boolean result = DetermineFizzBuzz.isMultipleOf(30,15);
		
		assertTrue(result);
	}
	
	@Test
	public void testMultipleOfFive() {
		
		boolean result = DetermineFizzBuzz.isMultipleOf(50,5);
		
		assertTrue(result);
	}
	
	@Test
	public void testMultipleOfThree() {
		
		boolean result = DetermineFizzBuzz.isMultipleOf(21,3);
		
		assertTrue(result);
	}
	
	@Test
	public void testNotMultipleOfFifteen() {
		
		boolean result = DetermineFizzBuzz.isMultipleOf(62,15);
		
		assertFalse(result);
	}
	
	@Test
	public void testNotMultipleOfFive() {
		
		boolean result = DetermineFizzBuzz.isMultipleOf(22,5);
		
		assertFalse(result);
	}
	
	@Test
	public void testNotMultipleOfThree() {
		
		boolean result = DetermineFizzBuzz.isMultipleOf(35,3);
		
		assertFalse(result);
	}
	
	
	
	
	

}
