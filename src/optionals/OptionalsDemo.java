package optionals;

import java.util.Optional;

// Before Java 8 Optional class was introduced, if-else statements were used to avoid NullPointerExceptions:

	/*	String email = null;

		if (person.getEmail() != null) {
			email = email.toLowerCase();
		} else {
			// default behaviour
		}	*/


// Optional has 3 methods:
	
	// 1. Optional.empty()   	- Returns an empty Optional instance. No value is present for this Optional.
	// 2. Optional.of(value)	- Returns an Optional with the specified present non-null value.
	// 3. Optional.ofNullable() - Returns an Optional value if non-null, otherwise returns an empty Optional.


public class OptionalsDemo {

	public static void main(String[] args) {
		
		// Using the empty() method for Object class with a null Object
		Optional<Object> empty = Optional.empty();
		System.out.println(empty.isPresent()); // returns false, since Object is null
		System.out.println();
		
		// Using the of(value) method for a String that is Not null
		Optional<String> helloString = Optional.of("Hello!");
		System.out.println(helloString.isPresent()); // returns true, since String = "Hello and is Not null. 
		System.out.println();
		
		// orElse(other value) - returns the value if present, otherwise returns the other value
		String orElse = helloString.orElse("Howdy!");
		System.out.println(orElse);
		System.out.println();
		
		
		
		// Using the ofNullable(value) method for a null String
		Optional<String> hello = Optional.ofNullable(null);
		hello
			.map(String::toUpperCase)
			.orElse("Howdy!");  // orElse() returns the other value: String 'Howdy!'
		System.out.println(hello);  
		System.out.println();
		
		// Using chain methods on helloString with map() and orElseGet() methods
		orElse = helloString
				.map(String::toUpperCase)
				.orElseGet(() -> {
					// ..some extra computations to get the value
					return "world"; // helloString is Not null, since not getting 'world'.
				});
		System.out.println(orElse);
		System.out.println();
		
	}
}
