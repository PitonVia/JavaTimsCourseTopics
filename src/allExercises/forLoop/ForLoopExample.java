package allExercises.forLoop;

public class ForLoopExample {

	public static void main(String[] args) {
		
		System.out.println("10,000 at 2% interest = " + calculateInterestRates(10000, 2));
		System.out.println("10,000 at 3% interest = " + calculateInterestRates(10000, 3));
		System.out.println("10,000 at 4% interest = " + calculateInterestRates(10000, 4));
		System.out.println();
		
		// Create a loop that will be calling the calculateInterestRates method
		// and will print result for interest rates from 2 to 8 for 10,0000.
		
		for (int i=2; i<=8; i++) {
			// Notice the use of the String.format method to set precision to 2 decimals
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterestRates(10000, i)));
		}
		System.out.println();
		
		// Reversing the loop to print interest rates from 8 to 2:
		for (int i=8; i>=2; i--) {
			// Notice the use of the String.format method to set precision to 2 decimals
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterestRates(10000, i)));
		}
	}

	public static double calculateInterestRates(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
}
