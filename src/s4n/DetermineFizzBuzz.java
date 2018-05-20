package s4n;

/**
 * 
 * @author Jean Herrera
 *
 */

public class DetermineFizzBuzz {
	
	/**
	 * This method verify if a number is multiple of 3, 5 or 15.
	 * @param number, number to verify if is multiple of 3, 5 or 15. 
	 * @return "FizzBuzz" if number is multiple of 15, "Buzz" if number is multiple of 5, 
	 * "Fizz" if number is multiple of 3 or the number if it isn't a multiple of any of the above.
	 */
	
	public String verifyFizzBuzz(int number){
		
		if (isMultipleOf(number, 15))
			return "FizzBuzz";
		
		if (isMultipleOf(number, 5))
			return "Buzz";
		
		if (isMultipleOf(number, 3))
			return "Fizz";
			
		return Integer.toString(number);
	}
	
	/**
	 * This method print the numbers from 1 to 100. But for multiples of three print "Fizz" 
	 * instead of the number and for the multiples of five print "Buzz". For numbers which are
	 * multiples of both three and five print "FizzBuzz".
	 * @param from, initial number to verify multiples. 
	 * @param to, final number to verify multiples. 
	 * @return null
	 */
	
	public void printFizzBuzz(int from, int to){
		for (int i = from; i <= to; i++){
			System.out.println(verifyFizzBuzz(i));
		}
	}
	
	/**
	 * This method verify if a number is multiple of other number.
	 * @param number, number to verify if is a multiple of multiple variable.
	 * @param multiple, number to verify if is divisible number of number variable. 
	 * @return true if number is a multiple of multiple (variable), false otherwise
	 */
	
	public static boolean isMultipleOf(int number, int multiple){
		return number % multiple == 0;
	}

}
