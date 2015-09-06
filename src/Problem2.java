/**
 * 
 */

/**
 * @author Scott
 *
 */
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Loop to generate the sum of all of the even Fibonacci numbers less than 4 million
		int m = 1;
		int n = 1;
		int temp = 0;
		
		int fib = 0;
		int sum = 0;
		
		while(fib < 4000000){
			fib = m + n;
			if(fib % 2 == 0)
				sum += fib;
			
			temp = n + m;
			m = n;
			n = temp;
		}
		System.out.println("The sum of the even Fibonacci numbers under 4 million is: " + sum);
	}

}
