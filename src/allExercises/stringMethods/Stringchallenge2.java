package allExercises.stringMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Stringchallenge2 {

	// 1. Assume you have a string "it is a test string". 
		// You need to write a code to reverse the characters of the string. 
		// Optional: use Scanner class to provide user input.
	
	
	public static void main(String[] args) {
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter a string to be reversed ");
		String userInput = s.nextLine();*/
		//System.out.println(userInput.length());
		
		String testString = "it is a test string";
		System.out.println(testString.length());
		
		printReverse(testString);
		
		// Solution # 2 using StringBuilder:
		StringBuilder strBld = (new StringBuilder("it is a test string")).reverse();
		System.out.println(strBld);
		
		// OR a shorter version of solution # 2: 
		// can replace 'new String(testString)' to "it is a test string"
		String reverse2 = new StringBuilder(new String(testString)).reverse().toString();
		System.out.println(reverse2);
		
		
		// Solution # 3 - another simple way to do the same using charAt() String method:
		String str = "test string";
		String output = "";

		for (int i = str.length()-1; i>=0; i--) {
			output = output + str.charAt(i);
		}
		System.out.println(output);
	
	}
	public static void printReverse(String testString){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string to be reversed ");
		testString = s.nextLine();
		
		while (testString.isEmpty() || testString == null) {
			System.out.println("Please enter a valid string, empty & null strings are not accepted");
			testString = s.nextLine();
		}
		
		// First convert String to character array:
		char[] charArray = testString.toCharArray();
		
		for (int i = charArray.length-1; i >= 0 ; i--){
		    System.out.print(charArray[i]);
		}
		System.out.println();
		s.close();
		}
		
}
