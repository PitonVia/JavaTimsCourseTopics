package lambdas.uTubeLambdasCourse._04_exercise1;

import java.util.*;

public class SolutionJava7 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1 - sort the list by last names.
		
		// Here we sorted a list by creating (further down) a class sortByLastName, which implements the Comparator. 
		Collections.sort(people, new sortByLastName());
		System.out.println("Sorted by last name with sortByLastName class implemeting Comparator");
		
		// Here we are using an anonymous class to implement the Comparator inside the same code block
		Collections.sort(people, new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}	
		});
		
		System.out.println("Sorted by last name with anonymous class implemeting Comparator");
		

		
		// Step 2 - create a method that prints all elements in the list.
		System.out.println("\nPrinting entire list:\n");
		printList(people);
		
		
		// Step 3 - create a method that prints elements where last names begin with 'C'.
		System.out.println("\nPrinting persons based on the specified condition:\n");
		
		// We are again using an anonymous class to implement Condition interface 
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}		
		});
	}
	
	// Prints all elements in the list.
	public static void printList(List<Person> list) {
		for (Person p : list) {
			System.out.println(p);
		}
	}
	
	// Prints all elements in the list.
	// Note that this method is using Condition interface declared in the same package!
	public static void printConditionally(List<Person> list, Condition condition) {
		for (Person p : list) {
			if (condition.test(p)) {
				System.out.println(p);
			}		
		}
	}		
}

// Separate class that implements the Comparator interface
class sortByLastName implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getLastName().compareTo(p2.getLastName());
	}	
}