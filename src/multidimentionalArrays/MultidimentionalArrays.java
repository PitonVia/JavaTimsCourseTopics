package multidimentionalArrays;

public class MultidimentionalArrays {

	public static void main(String[] args) {

		// Refer to nested loops topic to see how to access elements of multidimensional arrays
		
		// regular 1d array
		int[] myArray1 = new int[] { 0, 1 };

		// regular 1d anonymous array
		int[] myArray2 = { 0, 1 };

		// 2d array
		int[][] array1 = new int[2][4]; // 2 rows and 4 columns
		int array2[][] = new int[2][4]; // another way to declare it
		int[] array3[] = new int[2][4]; // another confusing way to declare it

		// Asymmetrical array has different # of columns for each row
		String[][] my2dAray = new String[][] { { "One", "Two" }, // 1st row with 2 elements
				{ "Three", "Four", "Five" }, // 2nd row with 3 elements
				{ "Six", "Seven", "Eight", "Nine" }, // 3rd row with 4 elements
				null };

		int[][] numberTable = new int[2][3];
		numberTable[0][0] = 1;
		numberTable[0][1] = 2;
		numberTable[0][2] = 3;

		numberTable[1][0] = 5;
		numberTable[1][1] = 6;
		numberTable[1][2] = 7;
//		numberTable[1][3] = 8; <-- gives index out of bounds exception, since this array has only 3 columns

		// 3d array has planes, rows and columns
		int[][][] my3dArray1 = new int[3][3][3];
		int my3dArray2[][][] = new int[3][3][3]; // diff ways to initialize
		int[] my3dArray3[][] = new int[3][3][3]; // diff ways to initialize

		my3dArray1[0][0][0] = 1; // setting the 1-st variable of the 3D array
		
		// alternative way to set up the variables at initialization
		int[][][] threedArray = { 
				{{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }},
				{{ 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 }},
				{{ 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 }}
		};
	}
}
