package optionals;

import java.util.Optional;

public class ClassExample {

	public static void main(String[] args) {
		
		// person has an email, so there are no issues to print it
		Person person = new Person("JAMES", "JAMES@email.com");
		
		System.out.println(person.getName().toLowerCase());
		
		String email = person
				.getEmail()
				.map(String::toLowerCase) // converting email to lower case
				.orElse("Email was not provided."); // since email is not null, returning email value
	
		System.out.println(email);
		System.out.println();
		
		// person2 does not have an email, so if we try to print email, we'll get a NullPointerException
		Person person2 = new Person("JONES", null);
		
		System.out.println(person2.getName().toLowerCase());
		
		String email2 = person2
				.getEmail()
				.map(String::toLowerCase)
				.orElse("Email was not provided."); // since email is null, returning the other specified value
	
		System.out.println(email2);
		System.out.println();
		
		// An alternative way to work with null email using if statement with isPresent() and get() methods
		if (person2.getEmail().isPresent()) {
			System.out.println(person.getEmail().get().toLowerCase());
		} else {
			System.out.println("Email was not provided.");
		}
		
	}
}

// We are declaring an inner class Person: 
//Every person has a name, but not everyone has an email. 
//Hence email may be null for some Person.
class Person {
	
	private final String name;
	private final String email;
	
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	// We are altering the getter for email, since it may be null
	// By using Optional with ofNullable(value) method, we can specify what to do if email is null.
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
	public String getName() {
		return name;
	}	
}