package s4n;

/**
 * 
 * @author Jean Herrera
 *
 */

public class Main {

	private static final int FROM = 1;
	private static final int TO = 100;
	
	public static void main(String[] args) {
		
		DetermineFizzBuzz determineFizzBuzz = new DetermineFizzBuzz();
		determineFizzBuzz.printFizzBuzz(FROM, TO);
	}
}
