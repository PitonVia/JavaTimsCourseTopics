package allExercises.whileLoop;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		
		// do...while loop will execute code at least once and then
		// the while condition is checked

		int count = 1;
		
		do {
			System.out.println("Count value was " + count);
			count++;
		} while (count !=6);

	}

}
