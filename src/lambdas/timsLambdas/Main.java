package lambdas.timsLambdas;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

// This class is using the Employee public class

public class Main {

	public static void main(String[] args) {
		
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red Ridinghood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        // Declaring a list of 'Employee' objects.
        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        // Using forEach() with lambda expression that implements Consumer interface
        // The Iterator is calling the void accept() method of Consumer for each Employee object in the List
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
        System.out.println();
        
        // Another variation - shorter code
        employees.forEach(e -> System.out.println(e.getName() + " is " + e.getAge()));
        System.out.println();
        
        // We want to print only those employees who are older than 30
        System.out.println("Print employees who are over 30 years old:");
        
        // Here's how we do it with a for each loop:
/*      for (Employee e : employees) {
        	if (e.getAge() > 30) {
        		System.out.println(e.getName());
        	}
        }       */
        
        // Using lambda expression to print employees who are older than 30
        employees.forEach(e -> {
        	if (e.getAge() > 30) {
        		System.out.println(e.getName());
        	} 	
        });
        System.out.println();
        
        // There is a better way to do filter employees by age using a stream with filter and forEach methods.  
        employees.stream()
		.filter(e -> e.getAge() > 30)
		.forEach(e -> System.out.println(e.getName())); 
        System.out.println();
    
        
		// Using Function and substring() to get a list of last names:
	    Function<Employee, String> getLastName = (Employee employee) -> {
	        return employee.getName().substring(employee.getName().indexOf(' ') + 1);
	    };
	    // Need to apply the function to print the employee with index = 1:
	    String lastName = getLastName.apply(employees.get(1));
	    System.out.println(lastName);  // Prints "Buchalka"
	
	    // Using Function and substring() to get a list of first names:
	    Function<Employee, String> getFirstName = (Employee employee) -> {
	        return employee.getName().substring(0, employee.getName().indexOf(' '));
	    };
	    String firstName = getFirstName.apply(employees.get(1));
	    System.out.println(firstName); // Prints "Tim"
		System.out.println();
	    
		// Chaining functions together using 'andThen()'.
	    // 1-st function 'upperCase' is converting name to upper case
	    Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
	    System.out.println(upperCase.apply(employees.get(0)));
	    // 2-nd function 'firs_Name' is picking the first name out of complete name
	    Function<String, String> first_Name = name -> name.substring(0, name.indexOf(' '));
	    // 3-rd function is combining the 1-st and 2-nd functions together: 
	    Function chainedFunction = upperCase.andThen(first_Name);
	    System.out.println(chainedFunction.apply(employees.get(0))); 
	    System.out.println();
	    
	    // IntUnaryOperator is an interface that takes and returns an Integer
	    IntUnaryOperator incrBy5 = x -> x+5; // it adds 5 to any int that we pass as a parameter
	    int incrInt = incrBy5.applyAsInt(10);  // adds 5 to 10
	    System.out.println(incrInt);
	   
	}

}
