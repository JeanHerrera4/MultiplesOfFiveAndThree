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
 * These tests verify the method DetermineFizzBuzz, where it's verified if the entered 
 * number corresponds with the output word.
 */

public class DetermineFizzBuzzTest {
	
	@Test
	public void testFizzBuzzMultipleFifteen() {
		DetermineFizzBuzz fizzBuzz = new DetermineFizzBuzz();

		String result = fizzBuzz.verifyFizzBuzz(60);
		
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void testFizzBuzzMultipleFive() {
		DetermineFizzBuzz fizzBuzz = new DetermineFizzBuzz();
		
		String result = fizzBuzz.verifyFizzBuzz(10);
		
		assertEquals("Buzz", result);
	}
	
	@Test
	public void testFizzBuzzMultipleThree() {
		DetermineFizzBuzz fizzBuzz = new DetermineFizzBuzz();
		
		String result = fizzBuzz.verifyFizzBuzz(6);
		
		assertEquals("Fizz", result);
	}

}
