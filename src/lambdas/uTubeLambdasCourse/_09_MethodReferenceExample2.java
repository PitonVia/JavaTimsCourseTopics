package lambdas.uTubeLambdasCourse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lambdas.uTubeLambdasCourse._04_exercise1.Person;

//  Method references can only be used to replace a single-method lambda expression!!
// It is an alternative way to achieve exactly the same result as when using a lambda. 

// So to use a method reference, you first need a lambda expression with one method. And to use a lambda  
// expression, you first need a functional interface, an interface with just one abstract method.

// In other words:
// Instead of using AN ANONYMOUS CLASS, you can use A LAMBDA EXPRESSION.
// And if this just calls one method, you can use A METHOD REFERENCE.

// Method reference syntax:			Object::methodName 


public class _09_MethodReferenceExample2 {

public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Note that we can replace 'p -> System.out.println(p)' with the method reference
		System.out.println("Printing all people using lambda");
		printConditionally(people, p -> true, p -> System.out.println(p));
		
		System.out.println();
		
		// Here we are implementing the method reference of println() method of 'out' object:
		System.out.println("Printing all people using method reference");
		printConditionally(people, p -> true, System.out::println);
		
		
	}
	
	// Prints all elements in the list.

	public static void printList(List<Person> list) {
		for (Person p : list) {
			System.out.println(p);
		}
	}
	
	// Prints all elements in the list.
	// Note that this method is using Predicate and Consumer interfaces with class Person as a Type
	public static void printConditionally(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : list) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}		
		}
	}		
}
