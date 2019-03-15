package streams.lambdaChallenge;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Main {

	public static void main(String[] args) {
		
		// 1.) Convert the anonymous class below to a lambda expression:
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				String myString = "Let's split this up into an array";
				String[] parts = myString.split(" ");  // splitting by spaces
				for (String part : parts) {
					System.out.println(part);
				}		
			}			
		};
//		runnable.run(); // test output

		// Same functionality as above but using lambda expression
		Runnable lambdaRunnable = () -> {
			String myString = "Let's split this up into an array";
			String[] parts = myString.split(" ");  // splitting by spaces
			for (String part : parts) {
				System.out.println(part);
			}	
		};		
		lambdaRunnable.run(); // test output
		System.out.println();
		System.out.println("-------------- Examples 2 - 5 ---------------");
		
		
		// 2.) Creating a lambda function from a method returning a String.
		// The method is using StringBuilder that builds a string from every 2-nd character.
		// Note that it maps to Functional interface that takes a String as an argument and returns a String.
        Function<String, String> lambdaFunction = s -> {
        	
            StringBuilder returnVal = new StringBuilder();
            for (int i=0; i<s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
        
        // 3.) Use the Function above with apply() and a string input:
        System.out.println(lambdaFunction.apply("1234567890"));
        
        // 5.) Calling method that prints every 2-nd character of a String:
        System.out.println(everySecondCharacter(lambdaFunction, "1234567890"));
        
        System.out.println();
        System.out.println("-------------- Examples 6 & 7 ---------------");
		
        // 6.) Write a lambda expression for a Supplier interface that returns "I love Java!"
        // supllier does not take any arguments, but returns the Type specified for it - String in this case:
        Supplier<String> iLoveJava = () -> "I love Java!";
        
        // 7.) Using the get() method of Supplier to print the result
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
        
        System.out.println();
        System.out.println("-------------- Example 8 ---------------");
        
        // 8.) Need to change first chars to Upper Case and sort these names:
        List<String> topNames2015 = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava", "oliver",
                "Jack", "Charlie", "harry", "Jacob" );
        
        // Declaring a new sorted list with upper case chars:
        List<String> firstUpperCaseList = new ArrayList<>();
        // Using forEach() to add modified Strings to the new list
        // Using substring() to convert 1-st char to upper case and then concat the remaining part of each string 
        topNames2015.forEach(s -> firstUpperCaseList.add(s.substring(0,1).toUpperCase() + s.substring(1))); 
        
        // Sorting items in the List:
        firstUpperCaseList.sort((s1, s2) -> s1.compareTo(s2));  // same as: (String::compareTo) using method reference
        // Printing sorted gNumbers ArrayList items:
        firstUpperCaseList.forEach(s -> System.out.println(s)); // same as: (System.out::println) using method reference
        
        System.out.println();
        System.out.println("-------------- Example 9 ---------------");
        
        // 9.) Use the List from Example 8 and perform the same operations using stream   
        topNames2015.stream()
        	.map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
        	.sorted(String::compareTo)  // can also leave the parentheses empty so default compareMethod is used!
        	.forEach(System.out::println);
        
        System.out.println();
        System.out.println("-------------- Example 10 ---------------");	
        
        // 10.) Refer to example 9 and print how many names begin with letter "A" using stream 
        long count = topNames2015.stream()
        	.map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
        	.filter(s -> s.startsWith("A")) // using filter() to pick only names that start with "A"
        	.sorted()
        	.peek(System.out::println)  // we want to check which names start with "A"
        	.count();
        System.out.println("There are " + count + " names that start with \"A\"");
        	
        System.out.println();
        System.out.println("-------------- Example 11 ---------------");
	}
	
    // 4.) Returns a string after applying source String to the Function
    public static String everySecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }
	
	// Writing a method for example 2 - returns every second character of any String:
    public static String everySecondChar(String source) {
        
    	StringBuilder returnVal = new StringBuilder();
        
    	for (int i=0; i<source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }
    



    
	
	
}
