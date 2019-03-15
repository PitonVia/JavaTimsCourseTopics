package collections.fromAutomationCourse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList - used when elements are added/removed at the end
//LinkedList - used when elements are added/removed from the beginning or
//from the middle.

//If many elements of an Array need to be removed or re-positioned,
//it would be better to use LinkedList

public class LinkedListDemo {

	public static void main(String[] args) {

		
		LinkedList<String> cars = new LinkedList<String>();
		
		//shorter way to declare a new list:
		List<String> cars2 = new LinkedList<String>();
		
		// Adding
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");
		
		// Size
		int size = cars.size();
		System.out.println("The size of the list is: " + size);
		
		// Get
		System.out.println("The item on index 1 is: " + cars.get(1));
		
		// Iteration
		System.out.println("Iteraton example");
		for (int i = 0; i < size; i++) {
			System.out.println("Item on index " + i + " is: " + cars.get(i));
		}
		
		// Iterator class example
		// Prints List element at index = 0
		System.out.println("\nList element at index = 0 " + cars.iterator().next()); 
		
		
		System.out.println("\nNext for loop example");
		for (String car : cars) {
			System.out.println("The item is: " + car);
		}
		
		// Remove
		cars.remove(size - 1);
		
		System.out.println("\nNext for loop example after removing");
		for (String car : cars) {
			System.out.println("The item is: " + car);
		}
		
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> lList = new LinkedList<Integer>();
		
		runDuration(aList, "Array List");
		runDuration(lList, "Linked List");
	}
	
	// Comparing execution time for adding elements to ArrayList VS Linked List
	// when additional 100,000 elements are added at the beginning of the lists:
	public static void runDuration(List<Integer> list, String listType) {
		System.out.println("\nBeginning of the duration method for " + listType);
		for (int i=0; i<100000; i++) {
			list.add(i);
		}
		int size = list.size();
		int elementToAdd = size + 100000;
		long startTime = System.currentTimeMillis();
		for (int i = size; i < elementToAdd; i++) {
/*			// elements will be added at the end - not much different!
			list.add(i);*/
			
			// Elements will be added from index = 0:
			list.add(0, i);  // big duration difference!
		}
			
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Duration of the list " + listType + " is " + duration + " ms");
	}

}
