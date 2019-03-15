package arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {

	public static void main(String[] args) {
		// Write a void method called reverse() that takes int[] as an argument. 
		// Print the array both reversed and not reversed from the Main method. 

		int[] intArray = {2,60,-5,0,7};
		
		System.out.println(Arrays.toString(intArray));
		System.out.println();
		
		reverse(intArray);
		System.out.println();
		
		reverse2(intArray);
		System.out.println();
		
		reverse3(intArray);
		System.out.println(Arrays.toString(intArray));
			
	}

	//Tim's solution:
	private static void reverse3(int[] array) {
		
		int temp = 0;
		
		for (int i=0; i<array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}
	}
	
	// My 2-nd solution:
	private static void reverse(int[] array) {
		
		int[] reversedArray = new int[array.length];
		
		for (int i=0; i<array.length; i++) {
			reversedArray[i] = array[array.length-1-i];
		}
		System.out.println(Arrays.toString(reversedArray));
	}
	
	// My 1-st simple method how to reverse an array using int index:
	private static void reverse2(int[] array) {
		
		int[] reversedArray = new int[array.length];
		
		int index = 0;
		
		for (int i=array.length-1; i>=0; i--) {
			reversedArray[index] = array[i];
			index++;
		}
		System.out.println(Arrays.toString(reversedArray));
	}
}
