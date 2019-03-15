package allExercises.whileLoop;

public class EvenDigitSum {

	public static void main(String[] args) {
		// Create a method returning the sum of the even digits within the number.

		System.out.println(getEvenDigitSum(-1));
		System.out.println(getEvenDigitSum(0));
		System.out.println(getEvenDigitSum(88));
		System.out.println(getEvenDigitSum(4));
		System.out.println(getEvenDigitSum(611));
		
	}
	
	public static int getEvenDigitSum(int number) {
		
		if (number < 0) return -1;
		
		int sum = 0;
		
		while (number > 0) {
			
			if ((number % 10) % 2 == 0) {
				sum += number%10;
			}		
			number /= 10;
		}
		
		return sum;
	}

}
