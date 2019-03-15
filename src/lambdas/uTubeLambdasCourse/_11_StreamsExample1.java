package lambdas.uTubeLambdasCourse;

import java.util.Arrays;
import java.util.List;

// Streams are very useful and powerful when working with collections, arrays, Strings, ints etc. 

// Streams consist of: 

// 	1.) Source:  					people.stream() 							 // e.g. List can be a source 
// 	2.) Intermediate operation(s):	.filter(lambda) OR .skip() OR .sorted() 	 // they return a stream
// 	3.) Terminal operation:			.forEach(lambda); OR .collect() OR .count(); // return void or a non-stream result 

// For large arrays ParallelStreams can be used to enable multiple threads.


import lambdas.uTubeLambdasCourse._04_exercise1.Person;

public class _11_StreamsExample1 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Java 8 introduced stream() method that Returns a sequential stream with this collection as its source.
		// stream() allows performing various method with the elements simultaneously. 
		// filter() uses Predicate elements and allows filtering elements by some criteria. 
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))  // filter() take Predicate interface as an arg
		.forEach(p -> System.out.println(p.getFirstName() + " " + p.getLastName()));
		
		System.out.println();
		
		// Returns count of elements where lastName starts with "C"
		long count = people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.count();
		
		System.out.println(count);
	}
	
}
