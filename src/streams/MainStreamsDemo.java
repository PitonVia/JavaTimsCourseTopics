package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//STREAM - public interface Stream<T> a set of object references supporting sequential and parallel aggregate operations.

// 1. Stream code must not be interfering, i.e. not changing the object.
// 2. Stream code must be stateless, i.e. result of an operation cannot depend on any result outside of the operation.
// 3. Stream can be created from scratch for objects of the same Type using Stream.of() method. Stream cannot be created
// from objects of mixed types - e.g. int & String.
// 4. Once a stream is terminated, it cannot be reused. 

public class MainStreamsDemo {

	public static void main(String[] args) {
		
		// Declaring a List from a String array
		List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");
 
		
		// 1.) We want to create a new List consisting of String that start from "g" or "G" sorted alphabetically.
		// We can do it the old way, which involves more code or we could solve this using a stream. 
		
		// Declaring a new ArrayList for storing all strings that start from "G".
		List<String> gNumbers = new ArrayList<>();
        
		 System.out.println("Printing results using the old way:");
		
        // The OLD WAY: involves forEach() method where Consumer interface is implemented with a lambda:
        someBingoNumbers.forEach(number -> {
            if(number.toUpperCase().startsWith("G")) {   
                gNumbers.add(number); // adding items starting from "G" to a new ArrayList:
            }
        });
        
        // Sorting items in gNumbers ArrayList:
        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
        // Printing sorted gNumbers ArrayList items:
        gNumbers.forEach((String s) -> System.out.println(s));
        
        System.out.println("\nPrinting results using stream():");
        
        // Using stream 
        someBingoNumbers.stream()
        	.map(String::toUpperCase) // same as: s -> s.toUpperCase()
        	.filter(s -> s.startsWith("G"))
        	.sorted()
			.forEach(System.out::println); // notice that it prints "G64" and not "g64"
        System.out.println();
     
        // 2.) Creating two Streams of String objects from scratch and concatenating them
        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        System.out.println("-------- Example 2 ------------");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        
        // Now we can operate on the concatenated stream. 
        // Removing duplicate Strings from the concatenated stream and print unique items:
        System.out.println("Unique Strings in concatStream: ");
        System.out.println(concatStream
        						.distinct()
        						.peek(System.out::println)  // great way to print elements without terminating the stream!!
        						.count()); // prints the count of unique strings
        System.out.println();
        System.out.println("-------- Example 3 ------------");
        
        // 3.) We may want to save the output of Stream into a new List or Set rather than just print it to the console. 
        
        // We can declare a new List and use the collect() method to populate it with Stream results: 
        List<String> sortedGNumbers = someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G")) // works with Predicate and returns a Stream of items that pass the condition 
                .sorted()
                .collect(Collectors.toList()); // terminal operation - returns a List
        
        // Now we can use sortedGNumbers List anywhere else!!
        
        for (String s : sortedGNumbers) {
            System.out.println(s);  // printing the items of the new sortedGNumbers List
        }

        
        // We may use another constructor of the collect() method if we want to make a new ArrayList
        List<String> sortedGNumbers2 = someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G")) // works with Predicate and returns a Stream of items that pass the condition 
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll); // terminal operation - returns an ArrayList
        System.out.println();
        
        
        // From here, we will be working with the Employee and Department instances.
        System.out.println("-------- Example 4 - working with classes ------------");
        
        // Creating new employees
        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Deer", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        // Creating a new Department
        Department hr = new Department("Human Resources");
        
        // Adding employees to the ArrayList of employees, which is part of Department instance
        hr.addEmployees(jane);
        hr.addEmployees(jack);
        hr.addEmployees(snow);
        
        // Creating another department and adding 1 employee to its ArrayList: 
        Department accounting = new Department("Accounting");
        accounting.addEmployees(john);

        // 4.) Print all employees that work for the company i.e. from all departments.
        System.out.println("Printing all employees:");
        
        // To print all employees, we can create a List of department instances:
        List<Department> departments = new ArrayList<>();
        // Adding department objects to the ArrayList of departments
        departments.add(hr);
        departments.add(accounting);
        
        // We could add getEmployee or printEmployee methods to the Department class and then iterate over
        // the departments List to print all the employees, but we will use Streams with a flatMap() method.
        
        // .flatMap() method allows to flatten nested lists!
        
        // .flatMap() is a function that returns a stream of departments, then we call getEmployees() method, 
        // which returns a list and then we call a .stream() on that list to return a stream of employees.
        departments.stream()
        	.flatMap(dep -> dep.getEmployees().stream())
        	.forEach(System.out::println);
        System.out.println();
        
        System.out.println("-------- Example 5 ------------");
        
        // 5.) Return the youngest employee in the company.
        
        // We will use reduce() method, which combines all the items from a Stream into a single result.
        // There are 3 versions of reduce() - we will use the simplest that reduces a Stream to its single element!
        departments.stream()
    	.flatMap(dep -> dep.getEmployees().stream())
    	// reduce takes any 2 employees as parameters, compares their age and then uses ternary operator to return
    	// e1 if it's age is less than age of 2e. It compares age of all employees and returns the youngest employee.
    	.reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
    	.ifPresent(System.out::println);  // uses Optional to check if reduce() returns any result
    System.out.println();
    //System.out::println
              
        
	}

}
