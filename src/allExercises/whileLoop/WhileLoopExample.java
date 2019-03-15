package allExercises.whileLoop;

public class WhileLoopExample {

	public static void main(String[] args) {
		// Want to create while loops when you don't know how many loops 
		// will be run until required condition becomes false 
		// 'continue' will return to the beginning of the loop without executing further code

		int count = 0;
		
		while (count != 5) {
			System.out.println("Count value is " + count);
			count++;
		}
		System.out.println("****************");
		
		// Equivalent code using for loop:
		for (int i=0; i<6; i++) {
			System.out.println("i value is " + i);
		}
		System.out.println("****************");
		
		// Another variation of the while loop
		count = 0;
		while (true) {
			
			count++;
			
			if (count == 3)
				continue; // returns to the beginning of the loop without executing further code
			
			if (count > 5)
				break;

			System.out.println("Count value is " + count);
		}
	}
}
