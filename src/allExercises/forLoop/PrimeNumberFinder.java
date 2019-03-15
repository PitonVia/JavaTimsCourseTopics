package allExercises.forLoop;

public class PrimeNumberFinder {

	public static void main(String[] args) {
		// Create a boolean method to determine if number is a prime number.
		// Create the 2-nd method that will print the first 3 found prime numbers.

		System.out.println(isPrime(4));
		getCountPrimes(3,50);
		
	}

	private static boolean isPrime(int n) {
		
		if (n <= 1)
			return false;
		
		// Instead of 'n/2' we are further optimizing the code by using 
		// the square root of n casted to a long to remove redundant iterations
		for (int i=2; i<= (long) Math.sqrt(n);  i++) { 
			// System.out.println("looping " + i); 
			if (n % i == 0)
				return false;
		}
		
		return true;
	}
	
	private static void getCountPrimes(int maxCount, int maxValue) {
		
		int count = 0;
		
		for (int i=2; i<=maxValue; i++) {
		
			if (isPrime(i)) {
				System.out.println("Number " + i + " is a prime number");
				count++;
				
				if (count == maxCount) {
					System.out.println("Exiting the loop at count = " + count);
					break;
				}
			}	
		}
	}
	
}
