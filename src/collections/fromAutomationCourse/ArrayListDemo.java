package collections.fromAutomationCourse;

import java.util.ArrayList;
import java.util.List;

// ArrayList, LinkedList and Vector are implementing List interface.
// It is possible to add duplicate elements to all List implementations.
// Elements are added and stored in List in sequential order.

//ArrayList VS. regular Array:
//Main diff between array and ArrayList is that ArrayList has a dynamic size, 
//i.e., elements can be added or deleted in it. In regular array, the size is
//specified once when it is declared and the number of elements remains fixed.

// ArrayList VS. LinkedList:
// ArrayList - used when elements are added/removed at the end
// LinkedList - used when elements are added/removed from the beginning or
// from the middle.

// If many elements of an ArrayList need to be removed or re-positioned,
// it is better to use LinkedList.

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> cars = new ArrayList<String>();
		// Adding
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");
		cars.add(3, "Huyndai"); // add element "Huyndai" at index =3
		cars.remove(3);  // removes element at index = 3
		
		// Print entire ArrayList		
		System.out.println(cars);
		
		// Get element at Index
		cars.get(1);
		System.out.println("The item on index 1 is: " + cars.get(1));
		
		// Index of element value
		System.out.println(cars.indexOf("Audi"));
		System.out.println("***********\n");
		
		// Size - returns the number of element array list contains
		int size = cars.size();
		System.out.println("The size of the list is: " + size);
						
		// Contains element (boolean)
		System.out.println(!cars.contains("Audi")); // prints 'false' since using not: '!'
		
		// isEmpty (boolean)
		System.out.println(cars.isEmpty()); // prints false since array list is not empty
		System.out.println("***********\n");
		
		// Iteration
		System.out.println("Iteraton example");
		for (int i = 0; i < size; i++) {
			System.out.println("Item on index " + i + " is: " + cars.get(i));
		}
		
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

	}

}
