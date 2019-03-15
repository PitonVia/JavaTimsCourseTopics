package allExercises.forLoop;

public class StringPolyndrom {

	public static void main(String[] args) {
		// Write a method that checks to see if a given word is a palindrome. 
		// Example palindromes: 'noon' and 'racecar'."

		System.out.println(isPalindrome2("racecar"));
		System.out.println(isPalindrome2("noname"));
		System.out.println(isPalindrome2("oooaaaooo"));
	}
	
	// Solution #1 using reversed loop
	public static boolean isPalindrome(String str) {
		
		String reversedString = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			// Note the charAt() method that returns char values of the specified index
			reversedString += str.charAt(i);
		}
		return reversedString.equals(str); 
	}

	// Solution #2 using StringBuilder
	public static boolean isPalindrome2(String str) {
		
		String reversedString = (new StringBuilder(str)).reverse().toString();
		
		return reversedString.equals(str); 
	}
}
