/**
 * 
 */

/**
 * @author Scott Hillier
 *
 */
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Project Euler Problem 3
		 * The prime factors of 13195 are 5, 7, 13 and 29.
		 * What is the largest prime factor of the number 600851475143 ?
		 */
		long num = 600851475143L;
		for(long i = num; i > 0; i--){
			long dividend = num / i;
			for(long j = dividend; j > 0; j--){
				long ans = num % j;
				if(ans == 0){
					isPrime(ans);
				}
			}
		}
	}

	public static boolean isPrime(long ans){
		return false;
	}
}