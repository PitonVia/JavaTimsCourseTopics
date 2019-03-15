package allExercises.forLoop;

public class Sum3And5Challenge {

	public static void main(String[] args) {
		// Inside the main method create a for loop from 1 to 1000 inclusive. 
		// Print and sum all numbers that can be divided by 3 and by 5.
		// Break out of the loop when first 5 numbers meeting conditions above are found.

		int count = 0;
		int sum = 0;
		
		for (int i=1; i<=1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				count++;
				System.out.println("Number divisible by 3 and by 5 is: " + i);
				sum +=i;
				if (count == 5) {
					break;
				}
			}
		}
		
		System.out.println("The sum of the numbers is: " + sum);
	}
}
