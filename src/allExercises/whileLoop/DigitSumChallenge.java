package allExercises.whileLoop;

public class DigitSumChallenge {

	public static void main(String[] args) {
		// As long as the number has more than one digit, the method should 
		// return the sum of all digits in that number. E.g. if the number
		// is 15, the the sum of 1 + 5 = 6.
		
		System.out.println(sumDigits(999));
		System.out.println(sumDigits(10));
		System.out.println(sumDigits(9));
		System.out.println(sumDigits(-1));
	}

	public static int sumDigits(int number) {
		
		if (number < 10)
			return -1;
			
		int sum = 0;
				
		while (number > 0) {
			
			sum += number % 10;
			number = number / 10;
		}
		
		return sum;	

//			// Solution using for loop
//			for (int i=number; i>0; i=i/10) {
//			
//			sum = sum + i % 10;
//		}
	}		
}
