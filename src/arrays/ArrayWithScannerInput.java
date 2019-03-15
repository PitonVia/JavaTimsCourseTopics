package arrays;

import java.util.Scanner;

public class ArrayWithScannerInput {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		// Useful example, how we can get a specific number of values from 
		// user into an array and calculate the average value. 
		int[] myIntegers = getIntegers(5);
		
		printArray(myIntegers);
		
		System.out.println("The average value is: " + getAverage(myIntegers));

		sc.close();
	}

	// Getting integers from Scanner input where int number is
	// the number of elements we want to define for the array
	private static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values.");
		
		int[] values = new int[number];
		
		for (int i=0; i<values.length; i++) {
			// will be assigning values with integers coming from the scanner
			values[i] = sc.nextInt();			
		}
		return values;
	}

	// Method for calculating the average value of all elements in an array
	public static double getAverage(int[] array) {
		
		int sum = 0;
		for (int i=0; i<array.length; i++) {
			sum += array[i];
		}
		return (double) sum / (double) array.length;
	}
	
	// Method for printing array's values
	public static void printArray(int[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
}
