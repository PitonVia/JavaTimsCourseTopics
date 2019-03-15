package collections.fromAutomationCourse;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// Creating an array by specifying literal values in the curly braces:
		int[] myIntArray2 = {100,90,0,0,0};
		
		// create a new integer array by allocating memory space for 5 elements.
		// if values not specified, default values of 0 will be added 
		int[] myIntArray1 = new int[5];  
		
		// assign specific values for each element based on its index:
		myIntArray1[0] = 100;
		myIntArray1[1] = 90;
		myIntArray2[4] = 1;
		
		System.out.println("0 index: " + myIntArray1[0]);
		System.out.println("1st index: " + myIntArray1[1]);
		System.out.println("2nd index: " + myIntArray1[2]);
		
		System.out.println();
		
		// another way to declare an array
		String[] myStringArray1 = {"bmw", "audi", "honda"};
		System.out.println("0 index: " + myStringArray1[0]);
		System.out.println("1st index: " + myStringArray1[1]);
		System.out.println("2nd index: " + myStringArray1[2]);
		
		System.out.println();
		
		int len = myStringArray1.length;
		System.out.println("String array length: " + len);
		
		System.out.println();
		
		for (int i = 0; i < myIntArray1.length; i++){
			System.out.println(myIntArray1[i]);
		}
		// Sort elements inside an int Array:
		Arrays.sort(myIntArray1);
		
		System.out.println();
		
		for (int i = 0; i < myIntArray1.length; i++){
			System.out.println(myIntArray1[i]);
		}
		System.out.println();
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		
		// How to sum up the values of int array
		int[] c = {2,5,8,7,4};
		
		int sum=0;
		for (int i=0; i<c.length; i++) {
			sum = sum + c[i];
		}
		System.out.println("array sum is " + sum);
		
		System.out.println();
		
		// Identify the index of a particular value '8' inside the int array 
		for (int i=0; i<c.length; i++) {
			if (c[i] == 8) {
				System.out.println("the index of value 8 is " + i);
				break;
			}
		}	
	}
}
