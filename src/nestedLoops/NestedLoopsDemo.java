package nestedLoops;

import java.util.Arrays;

public class NestedLoopsDemo {
	
	public static void main(String[] args) {
		
		// printing hours with minutes
		for (int hours=11; hours <= 12; hours++) {
			for (int minutes=0; minutes <= 59; minutes++) {
				System.out.println(hours + ":" + minutes);
			}
		}
		System.out.println("-----------");
		
		// a 2-dimentional array with 3 rows and 3 columns
		int[][] my2dArray = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		
		// using the standard toString method to print the array will not work:
		System.out.println(Arrays.toString(my2dArray));
		System.out.println("-----------");
		
		// need to use nested loops to access the elements of the 2d array
		for (int[] rowArray : my2dArray) {
			for (int i=0; i < rowArray.length; i++) {
				System.out.print(rowArray[i] + " ");
			}		
			System.out.println(); // this line moves the print output to another row of the 2d array
		}
		System.out.println("-----------");
		
		// how to use break and continue for nested loops
		OUTER:   // using a labels for outer and inner loops
		for (int[] rowArray : my2dArray) {
			INNER:
			for (int i=0; i < rowArray.length; i++) {
				if (rowArray[i] % 2 == 0) {
//					break OUTER;  // breaking the OUTER loop
					continue INNER;
				}
				
				System.out.print(rowArray[i] + " ");
			}
			
			System.out.println(); // this line moves the print output to another row of the 2d array
		}
		System.out.println("-----------");
		
		int x = 10;
		while (x > 0) {
			
			do {
				x -= 1; // step 1. inner loop executes until x = 5
						// step 3. outer loop executes as x = 4 > 0 && we have a do while loop so x = 3
						// step 5. outer loop executes as x = 2 > 0 && do while so x = 1
			} while (x > 5);
			
			x--;  
			System.out.println(x);  // step 2. x = 4 (prints 4)
									// step 4. x = 2 (prints 2)
									// step 6. x = 0 (prints 0)
		}
		
		
	}
}
