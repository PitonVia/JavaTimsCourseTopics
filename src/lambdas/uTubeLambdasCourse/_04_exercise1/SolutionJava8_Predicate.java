package lambdas.uTubeLambdasCourse._04_exercise1;

import java.util.*;
import java.util.function.Predicate;

// Note that both SolutionJava7 and SolutionJava8 were using Condition interface that is declared in the same package. 
// The custom condition interface was taking object of Person class as an argument and returned a boolean. 

// We can use the Predicate functional interface for the same purpose and, since we have implemented the Condition 
// interface by using lambda, we don't need to change this implementation. 

// The Predicate functional interface is a Function that receives a generified value <T> and returns a boolean. 

// We will update the printConditionally() to demonstrate how this works. 

public class SolutionJava8_Predicate {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1 - sort the list by last names.
			
		// Here we are using a lambda to implement the Comparator inside the same code block
		Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// Here we are using a SHORTER version of lambda by removing type of arguments
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		System.out.println("Sorted by last name with lambda implemeting Comparator");
		
		// Step 2 - create a method that prints all elements in the list.
		System.out.println("\nPrinting entire list:\n");
		printList(people);
		
		
		// Step 3 - create a method that prints elements where last names begin with 'C'.
		System.out.println("\nPrinting persons based on the specified condition:\n");
		printConditionally(people, p -> p.getLastName().startsWith("C")); 

		// Bonus - reusing the printConditionally method to print the entire list by using lambda
		// to implement Condition that will always be True:
		System.out.println("\nBonus print of list with lambda specifying true Condition:\n");
		printConditionally(people, p -> true); // simple true Condition implemented with lambda!
		
	}
	
	// Prints all elements in the list.
	public static void printList(List<Person> list) {
		for (Person p : list) {
			System.out.println(p);
		}
	}
	
	// Prints all elements in the list.
	// Note that this method is using Predicate interface with class Person as a Type
	public static void printConditionally(List<Person> list, Predicate<Person> predicate) {
		for (Person p : list) {
			if (predicate.test(p)) {
				System.out.println(p);
			}		
		}
	}		
}
