/**
 * 
 */

/**
 * @author Scott
 *
 */
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Integer sum
		int sum = 0;
		
		// Add up all of the multiples of 3 and 5 from 0 to 1000
		for(int i = 0; i < 1000; i++){
			if((i % 3 ==0) || (i % 5 == 0))
				sum += i;
		}
		System.out.println("The sum of all the multiples of 3 of 5 between 0 and 1000 is: " + sum + ".");
	}

}
