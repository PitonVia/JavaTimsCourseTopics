package allExercises.forLoop;

import java.util.ArrayList;

public class FindUniqueNumInArrayAmazonIntQuest {

	// Integer array 'a' contains multiple duplicated values. 
	// How do you retrieve all the unique values as well as
	// how many occurrences of each value are in the array? 
	
	public static void main(String[] args) {

		int[] a = {4,5,6,5,4,6,6,8,5,8,4,5,5,8,9,4,5};

		// 1. Add all the values to an ArrayList:
		
		ArrayList<Integer> arList = new ArrayList<Integer>();
		
		for (int i=0; i<a.length; i++) {
			
			// Declaring a count int inside the loop so it resets with
			// every iteration of the loop 
			int count = 0; 
			
			// if ArrayList does not contain num from array a
			if (!arList.contains(a[i])) {
				// adding all values to the HashSet
				arList.add(a[i]); 
				count++; // add 1 to the count
				
				// Creating another loop to count duplicates
				for (int j=i+1; j<a.length; j++) {
					if (a[i]==a[j]) {
						count++; // add 1 to the count again!
					}
				}
				// Printing output from outside the 2-nd for loop to print the cumulative values
				System.out.println("num: " + a[i] + " was repeated " + count + " times");
				
				if (count==1) {
					System.out.println(a[i] + " is a unique number!");
				}
			} 
		}
	}

}
