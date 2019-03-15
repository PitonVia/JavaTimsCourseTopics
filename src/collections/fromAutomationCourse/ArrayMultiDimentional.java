package collections.fromAutomationCourse;

public class ArrayMultiDimentional {

	public static void main(String[] args) {

		// Multi-dimensional array declaration:
		int ma[][] = new int[2][3];

		// 1-st [] represent # of rows
		// 2-nd [] represent # of columns
		// Array syntax: array[rows][columns]

		// Populating array with the following data:
		// 2 4 5
		// 3 9 1

		// rows and columns start from index = 0:
		ma[0][0] = 2;
		ma[0][1] = 4;
		ma[0][2] = 5;

		ma[1][0] = 3;
		ma[1][1] = 9;
		ma[1][2] = 1;

		System.out.println("value of ma[1][0] is: " + ma[1][0]);

		System.out.println();

		// 2 4 5
		// 3 9 1
		// For loop for identifying all values:
		for (int i = 0; i < 2; i++) { // i<2, since there are 2 rows
			for (int j = 0; j < 3; j++) { // j<3, since there are 3 columns
				System.out.println(ma[i][j]);
			}
		}

		System.out.println();

		// alternative way to declare array with literate values:
		// 2 4 5
		// 3 4 7
		// 1 2 9
		int ar[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };

		// Retrieve the min value from this array.
		// Then, find the max value inside the column where the minimum value is:
		
		// Step 1 - identify the min value of the array.
		// Step 2 - identify the index of column containing min value.
		// Step 3 - identify the max value inside that column.

		// declare an int that = 1-st value of the array
		int min = ar[0][0];
		
		// declaring an int to store column index containing min value of the array
		int columnIndOfMin = 0;
		
		for (int r = 0; r < 3; r++) { // 3 rows
			for (int c = 0; c < 3; c++) { // 3 columns
				if (ar[r][c] < min) { // if min is greater than next array value
					min = ar[r][c]; // make min = that next value  (Step 1)
					columnIndOfMin=c; // assign index of column to our variable (Step 2)
				}
			}
		}
		System.out.println("The smallest value in this array is: " + min);
		
		// declaring new var for the max value
		int max = ar[0][columnIndOfMin];
		// declaring a new var for the rows to be used in while loop
		int row=0;
		while (row<3) {  // since we have only 3 rows starting from 0, hence it is '<3'
			if (ar[row][columnIndOfMin] > max) { // if max is smaller than next array value
				max = ar[row][columnIndOfMin]; // make max = that next value  (Step 3)
			}
			row++;  // remember to increment the value of the row for each loop cycle 
		}
		System.out.println("The max value in the column where min value is = " + max);
			
	}

}
