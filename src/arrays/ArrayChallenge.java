package arrays;

import java.util.Scanner;

public class ArrayChallenge {

	// Create a program that creates an array of integers, finds a min value of the array 
	// and sorts the entered numbers in descending order. 
	// The numbers should be entered via keyboard so need to use the Scanner class. 
	// The program should have these 4 methods: getIntegers(), printArray(), sortIntegers(), findMin().
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Calling a method to declare a new int array of 5 elements entered by user.
		int[] numbers = getIntegers(5);
		
		printArray(numbers);
		System.out.println();
		
		System.out.println("The min value of the entered array is: " + findMin(numbers));
		System.out.println();
		
		printArray(sortIntegers(numbers));
				
	}
	
	// Finds a min value in an array:
	public static int findMin(int[] array) {
		
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}	
		return min;
	}
	
	// Returns an array based on the specified 'count' of elements in the array:
	public static int[] getIntegers(int count) {
		
		int[] array = new int[count];
		
		int userEntryCount = 1; // starting from 1
		
		for (int i=0; i<array.length; i++) {
			System.out.println("Please enter number #" + userEntryCount);
		
			// This block of code ensures that only Integers are entered by user:
			while(!sc.hasNextInt()) {
				System.out.println("The number entered was not an integer!");			
			
				sc.nextLine(); // handles next line skipping issue		
				
				sc.hasNextInt();
			}
			
			array[i] = sc.nextInt();
			userEntryCount++;
		}	
		return array;
	}
	
	// Takes an array and returns the sorted array in descending order
	public static int[] sortIntegers(int[] array) {
		
		int temp = 0;
		
		// Using nested loop as repositioning of the elements has to happen
		// several times to ensure they are all in correct descending order.
		for (int j=0; j<array.length; j++) {
			
			for (int i=0; i<array.length-1; i++) {
				
				if (array[i] < array[i+1]) {
					temp = array[i+1];  
					array[i+1] = array[i];
					array[i] = temp;		
				}			
			}	
		}		
		return array;
	}
	
	public static void printArray(int[] array) {
		
		System.out.print("Printing array elements: ");
		
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");		
		}
		System.out.println();
	}
}
