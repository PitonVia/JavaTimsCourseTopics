package allExercises.forLoop;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// Method returns the largest prime factor of the given number
		// E.g.: 21 -> 3 * 7 returns 7;  45 -> 3 * 3 * 5 returns 5

		// First, identify which factors are NOT primes. 
		// If n is not prime, then you can try to divide n by the prime numbers ≤n2, 
		// going from largest to smallest. The first time you get remainder 0, 
		// you have found the largest prime factor.
		
		System.out.println(getLargestPrime(224));
	}

	public static int getLargestPrime(int number) {
		
		if (number <= 1) return -1;
			
		for (int i=number/2; i>1; i--) {
	        if (number % i == 0) {
	        	System.out.println("number was " + number);
	        	System.out.println();
	        	number = i;
	        }
	    }
	    return number;
	}
	
	// Another method to find largest prime using bottom-up for loop
    public static int getLargestPrime2(int number) {
        if(number > 1){
            int i;
            for (i = 2; i <= number; i++) {
                if (number % i == 0){
                    //System.out.println("number was " + number);
                	number /= i;
                	//System.out.println("i before division was " + i);
                	//System.out.println("number after division by i is " + number);
                    i--;
                    //System.out.println("i became " + i);
                }
            }
            return i;
        }
        return -1;
    }	
}
