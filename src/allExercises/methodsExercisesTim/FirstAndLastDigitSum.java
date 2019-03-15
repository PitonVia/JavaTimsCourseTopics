package allExercises.methodsExercisesTim;

public class FirstAndLastDigitSum {

	public static void main(String[] args) {
		// Method should return the sum of the first and last digits of any number

		System.out.println(sumFirstAndLastDigit(-1));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(125));
		System.out.println(sumFirstAndLastDigit(7777));
		
	}

	public static int sumFirstAndLastDigit(int number) {
		
		if (number < 0)
			return -1;
		
		int lastNum = number % 10, firstNum = 0; 

		
		while (number > 0) {
			
			firstNum = number % 10;
		
			number /= 10;		
		}
		
		return lastNum + firstNum;
	}
	
}
