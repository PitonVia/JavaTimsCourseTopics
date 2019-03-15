package allExercises.stringMethods;

public class StringChallenge1 {

	// 1. Assume you have a string "this is a test string".
	// You need to write a code to reverse the string.
	// The output should be "string test a is this".

	public static void main(String[] args) {

		String testString = "this is a test string";
		testString.trim();
		System.out.println(testString);

		String[] wordArray = testString.split(" ");
		String reverse = ""; // declaring a new empty string

		for (String word : wordArray) {
			// adding each iteration to the empty string
			reverse = word + " " + reverse;
			// System.out.println(reverse);
		}
		// trimming any extra spaces outside the string
		System.out.println(reverse);

		// Checking that both strings have the same number of characters
		System.out.println(testString.length() == reverse.trim().length());
		System.out.println();
		System.out.println("*********************");
		System.out.println();
		
		// Here is another simple way to do the same using charAt() String method:
		String str = "test string";
		String output = "";

		for (int i = str.length()-1; i>=0; i--) {
			output = output + str.charAt(i);
		}
		System.out.println(output);
		
	}
}
