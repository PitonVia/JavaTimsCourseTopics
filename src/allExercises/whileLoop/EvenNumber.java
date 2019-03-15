package allExercises.whileLoop;

public class EvenNumber {

	public static void main(String[] args) {
		// Determine if number passed in a parameter is even or not
		// Create 2-nd method to print the total number of even numbers 
		// and break from the while loop once 5 even numbers are found

		int startNumber = 4;
		int finishNumber = 20;
		int countEven = 0;
		
		while (startNumber <= finishNumber) {
			
			startNumber++;
			if (!isEven(startNumber)) {
				// return to the beginning of the loop without executing further code
				continue; 
			}
			countEven++;
			System.out.println("Even number " + startNumber);
			
			if (countEven == 5) {
				System.out.println("The count of even numbers = " + countEven);
				break;
			}
		}
	}
	
	public static boolean isEven(int number) {
		
		return (number % 2 == 0);
	}

}
