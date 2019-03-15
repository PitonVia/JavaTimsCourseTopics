package lambdas.uTubeLambdasCourse;

import java.util.Arrays;
import java.util.List;

import lambdas.uTubeLambdasCourse._04_exercise1.Person;

public class _10_CollectionsIteratorExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Regular for loop
		for (int i=0; i<people.size(); i++) {
			System.out.println(people.get(i));
		}
		System.out.println();
		
		// For each loop
		for (Person p : people) {
			System.out.println(p);
		}
		System.out.println();
		
		// Java 8 introduced forEach() method for collections that takes Consumer interface instance as an arg.
		// Hence, we can use a lambda expression to implement this functional interface!
		// Performs action for each element until all elements have been processed or the action throws an exception.
		people.forEach(p -> System.out.println(p));
		System.out.println();
		
		// Same as above but using method reference:
		people.forEach(System.out::println);
		System.out.println();

	}
}
