package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

	public static void main(String[] args) {
		// List is a public interface that represents an ordered collection (a.k.a. sequence)
		
		// ArrayList is an implementation of the List.
		// Vector is another implementation of the list similar to ArrayList, but it synchronized.
		// ArrayList is a resize-able array that can hold object data types like classes, 
		// String, etc. It cannot hold primitive data types, which are not wrapped in classes! 
		// E.g. to create an ArrayList of integers we have to use a special wrapper class: Integer.
		
		// All elements inside an ArrayList have to be objects of the same data type 

		// The kind of objects an ArrayList holds is specified inside the < >
		// ArrayList is a class so we need to add () at the end when we create a new Array List:
		ArrayList<String> myArrayList = new ArrayList<>();
		
		// After initialization, we can use methods of the ArrayList class:
		myArrayList.add("Hello");
		myArrayList.add(" ");
		myArrayList.add("beautiful");
		myArrayList.add("World!");
		
		// .size() method returns how many elements are in the ArrayList
		System.out.println("ArrayList contains " + myArrayList.size() + " elements.");
		System.out.println();
		
		// .set(index,element) used to replace an element at Index:
		myArrayList.set(1, "my");
		
		// Check if element exists in the ArrayList .contains(element)
		boolean exists = myArrayList.contains("my");
		System.out.println("ArrayList contains element= \"my\"? " + exists);
		System.out.println();
		
		// Check is the array list is empty using .isEmpty()
		System.out.println("Is the ArrayList empty? " + myArrayList.isEmpty());
		System.out.println();
		
		// Another cool way to search for an element using .indexOf(element)
		// If element exist, the index of element (0 or higher int) will be returned
		// Otherwise .indexOf(element) returns -1.
		int position = myArrayList.indexOf("my");
		if (position >= 0) {
			System.out.println("Element \"" + myArrayList.get(position) + "\" was found at index " + position);
		}
		System.out.println();
		
		// Prints all the elements in the ArrayList using for loop and .get(index) method:
		for (int i=0; i<myArrayList.size(); i++) {
			System.out.println("Element " + i + ". is " + myArrayList.get(i));
		}
		System.out.println();
		
		// Prints all the elements in the ArrayList using for each loop and .indexOf(element) method:
		for (String e: myArrayList) {
			System.out.println("Element " + myArrayList.indexOf(e) + ". is " + e);	
		}
		System.out.println();
		
		// Remove an element from ArrayList using .remove(Index) (also can use .remove(element))
		String itemToBeRemoved = myArrayList.get(1);
		System.out.println("Removing element \"" + itemToBeRemoved + "\" from the ArrayList.");
		myArrayList.remove(1);
		System.out.println();
		
		// Another simple printing method .toString():
		System.out.println(myArrayList.toString());
		System.out.println();
		
		// Copying ArrayList using .addAll(ArrayList) method:
		ArrayList<String> newArrayList = new ArrayList<String>();
		newArrayList.addAll(myArrayList);
		System.out.println(newArrayList.toString() + " was copied using .addAll(ArrayList) method!\n");
		
		// Copying ArrayList at initialization:
		ArrayList<String> newArrayList2 = new ArrayList<String>(myArrayList);
		System.out.println(newArrayList2.toString() + " was copied at initialization!\n");
		
		// Copying ArrayList to a regular array using .toArray() method:
		String[] myNewArray = new String[myArrayList.size()];
		
		myNewArray = myArrayList.toArray(myNewArray);
		System.out.println(Arrays.toString(myNewArray) + " was converted to a regular String array!\n");
	}
}
