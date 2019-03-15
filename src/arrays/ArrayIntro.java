package arrays;

import java.util.Arrays;

public class ArrayIntro {
	
	public static void main(String[] args) {
		
		// An array is a container object that holds a fixed number of values of single type (char, int, String, double, etc.)
		// The length of an array is established when the array is created. After creation, its length is fixed.
		
		// Arrays cannot be easily resized (unlike lists, where new elements can be easily added) 

		// declare a new int array with 10 space holders for values
		int[] intArray = new int[10];
		
		// declaring a value 50 at index = 5
		intArray[5] = 50; 
		
		// print the value to the console
		System.out.println(intArray[5]);
		System.out.println();
		
		// Another way to declare an array with actual values
		int[] intArray2 = {1,2,3,4,5};
		
		// A good way to initialize an array is to use a for loop
		int[] intArray3 = new int[10];
		
		for (int i=0; i<intArray3.length; i++) {
			intArray3[i] = i;
		}
		printArray(intArray3);
		System.out.println();
		
		// Using the built-in method of Arrays class copyOf() to copy array. 
		// The method takes the original array and the number of elements of the new array.
		int[] copiedArray = Arrays.copyOf(intArray3, intArray3.length+3);
		printArray(copiedArray);
		System.out.println();
		
		// Useful method to print array's values: Arrays.toString(), which 
		// converts the values of an array into String separating them by a comma.
		System.out.println(Arrays.toString(intArray3));
		
	}
		
	// Method for printing array's values
	public static void printArray(int[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
