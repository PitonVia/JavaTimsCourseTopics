package allExercises.codingBat_Warmup1;

public class NotString {

	public static void main(String[] args) {
			
//		Given a non-empty string and an int n, return a new string where the char 
//		at index n has been removed. The value of n will be a valid index of a char 
//		in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
		
		System.out.println(missingChar("kitten", 1)); // → "ktten"
		System.out.println(missingChar("kitten", 0)); // → "itten"
		System.out.println(missingChar("kitten", 4)); // → "kittn"	
	}

	// uses 2 overloaded substring methods: 
	public static String missingChar(String str, int n) {
		if (n>=0 || n<str.length()) {
			return str.substring(0, n) + str.substring(n+1);
		}	
		return str;
	}
	
}
