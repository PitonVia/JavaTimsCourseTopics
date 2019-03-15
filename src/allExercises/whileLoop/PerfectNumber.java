package allExercises.whileLoop;

public class PerfectNumber {

	public static void main(String[] args) {
		// A Perfect Number is a positive int which is equal to the sum of its proper positive divisors.
		// Proper positive divisors are positive ints that fully divide the perfect number without 
		// leaving a remainder AND exclude the perfect number itself.
		// E.g.: 6 is a perfect number, since the sum of divisors: 1,2,3 (excluding 6 itself) = 6. 

		
		System.out.println(isPerfectNumber(6));
		System.out.println(isPerfectNumber(28));
		System.out.println(isPerfectNumber(5));
		System.out.println(isPerfectNumber(0));
		System.out.println(isPerfectNumber(-1));
		
	}
	
	public static boolean isPerfectNumber(int number) {
		
		if (number < 1) return false;
		
		int sum = 0, i = number; 
		
		while (i > 1) {
			
			i--;
			
			if (number % i == 0) {
				sum += i;
			}		
		}	
		return (sum==number);
	}
}
