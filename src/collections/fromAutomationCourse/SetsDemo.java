package collections.fromAutomationCourse;

//HashSet, LinkedHashSet and TreeSet are implementing Set interface.
// Set does not accept duplicate values!

// HashSet - most common implementation of Set - collection of unique
// elements that does not guarantee sequential order of added elements.
// HashSets allows for very fast processing on its elements.

// LinkedHashSet - maintains order in which elements were added.

// TreeSet - maintains a natural sorting order of added elements.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		// Adding
		set.add("BMW");
		set.add("Honda");
		set.add("Audi");
		set.add("Audi");  // duplicates will not be added!
		set.add("Lada");
		set.add("Subaru");
		set.add("Mazda");
		set.remove("Mazda"); // removes element
		
		// Print all elements
		System.out.println(set);
		
		// Printing all elements using loop
		for (String car : set) {
			System.out.println(car);
		}
		
		// Iterator - very important!
		// It iterates through elements of Set.
		Iterator<String> i = set.iterator();  
		i.next(); // reaches Set element at Index = 0 
		i.next(); // reaches Set element at Index = 1 
		System.out.println("\nSet element at index = 2 is " + i.next());
		System.out.println(i.equals("Audi")); // is next iterator = Audi?
		System.out.println("Is next iterator available? " + i.hasNext());
		System.out.println();
		
		// Print all Set values using Iterator & while loop
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {  // while next iterator value exists,
			System.out.println(it.next()); // print that value
		}
		
		System.out.println("***********");
		
		// Print all Set values using Iterator & for loop
		for (Iterator iter = set.iterator(); iter.hasNext(); ) 
		       System.out.println(iter.next());
		       
		
		// Useful methods:
		System.out.println("\n size " + set.size());  // returns number of elements
		System.out.println("\n isEmpty " + set.isEmpty());  // boolean is Set is empty
		System.out.println("\n" + set.contains("Audi")); // boolean if Set contains element
		
		// LinkedHashSet - It maintains the order in which the elements are added
		Set<String> lhs = new LinkedHashSet<String>();
		lhs.add("BMW");
		lhs.add("Audi");
		lhs.add("Honda");
		System.out.println("\nLinkedSet");
		for (String item: lhs) {
			System.out.println(item);
		}
		
		// TreeSet - IT maintains the natural sorting 1, 2, 3... alphabetical
		Set<String> ts = new TreeSet<String>();
		ts.add("BMW");
		ts.add("Audi");
		ts.add("Honda");
		System.out.println("\nTreeSet");
		for (String item: ts) {
			System.out.println(item);
		}
		
	}

}
