package arrays;

public class SplittingStringIntoArray {

	public static void main(String[] args) {
		
		// Useful method when we want to split a large String into smaller pieces.
		// Create a String array of word elements separated by spaces.
		
		String location = "You are standing at the end of a road before a small brick building";
		
		String[] words = location.split(" ");
		
		for (String i : words) {
			System.out.println(i);
		}
	}
}
