package allExercises.whileLoop;

public class NumberPalindrome {

	public static void main(String[] args) {
		// Create a method that checks if the number is a palindrome.
		// Palindrome number is the same when it is reversed.

		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(10));
		System.out.println(isPalindrome(1234));
		System.out.println(isPalindrome(-1441));
		
	}

	public static boolean isPalindrome(int number) {
		
		// Another way to declare a second int:
		int originalNum = number, reversedNum = 0;

		while (number != 0) {
			
			reversedNum = reversedNum * 10 + (number % 10);
			
			number /= 10;	
		}
		
		return (originalNum == reversedNum);
	}
}
