package allExercises.forLoop;

public class PrimeNumbers1To100 {

	public static void main(String[] args) {
		// Find all prime numbers from 1 to n
		
		//System.out.println(isPrime(100));
		printPrimes(1000);
	}
	
	// checks if any given number is a prime number
	public static boolean isPrime(int n) {
		
		if (n <= 1) 
			return false; 
		
		// There are 2 options here:
		// 1)  i<=n/2; <-- removes some redundant loop iterations
		// 2)  i<= (long) Math.sqrt(n);  <-- optimized 
		
		for (int i=2; i<=n/2; i++) {
			
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// picks prime numbers from 2 to the specified n value
	public static void printPrimes(int n) {
	
		for (int i = 2; i<n; i++) {
			
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}	
}
