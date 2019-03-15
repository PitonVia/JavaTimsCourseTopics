package allExercises.stringMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CommonStringMethods {

	public static void main(String[] args) {

		String str = "This is the test string";
		
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.concat(" This is the appended string" ));
		System.out.println(str.contains("is"));  // returns true if contains 'is'
		System.out.println(str.contains("si"));
		System.out.println(str.startsWith("This")); // Starts with "This"
		System.out.println("***************");	
		
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = "  Welcome  ";
		String str4 = "";
		
		
		System.out.println(str1.equals(str2));
			
		System.out.println(str.indexOf("s"));  // returns index of 1-st occurrence
		System.out.println(str.indexOf("q"));  // returns '-1' if does not find
		System.out.println(str.isEmpty());
		System.out.println(str4.isEmpty());
		System.out.println(str3.trim());
		System.out.println(str.replace("e", "Z"));
		System.out.println(str.substring(17));
		System.out.println(str.substring(5, 16));

		char[] charArray = str1.toCharArray();
		for (int i=0; i<charArray.length; i++) {
			System.out.println(charArray[i] + "  is  Index: " + i);
		}
		System.out.println("***************");
		
		// 'for each' loop (variation)
		for (char d : charArray) {
			System.out.println(d);
		}
		System.out.println("***************");
		
		       
        // will print out content of char array converted into string.
        System.out.println(new String(charArray));
		
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println("-----------------");
		
		
		// Creating a lambda function - same code as 'everySecondChar()' below:
        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i=0; i<s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        // calling the lambda function above:
        System.out.println(lambdaFunction.apply("1234567890 L"));
        
        System.out.println("-----------------");
		
     // Need to sort & correct first chars of lower-case names:
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        // Declaring a new sorted list with upper case chars:
        List<String> firstUpperCaseList = new ArrayList<>();
        topNames2015.forEach( name ->
                firstUpperCaseList.add(name.substring(0,1).toUpperCase()+name.substring(1)));
        firstUpperCaseList.sort((s1, s2) -> s1.compareTo(s2));
        firstUpperCaseList.forEach( s -> System.out.println(s));
        System.out.println("-----------------");
        
     // Method references - same as the two rows of code above:
        firstUpperCaseList.sort(String::compareTo);
        firstUpperCaseList.forEach(System.out::println);
        
		System.out.println();
		System.out.println("*********************");
		System.out.println();
		
		// charAt() and 
		String s = "Payment $100 Paid";
		
		System.out.println(s.charAt(8));
		System.out.println(s.indexOf("$"));
		
		// We want to extract the last name from the String (i.e. the word after the space)
		// Using the substring with indefOf methods can help:
		String fullName = "Tim Buchalka";
		String lastName = fullName.substring(fullName.indexOf(' ') + 1);
		System.out.println(lastName);
		
		
	}

}
