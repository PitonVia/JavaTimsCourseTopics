package allExercises.codingBat_Warmup2;

public class StringMatch {

	public static void main(String[] args) {
			
//		Given 2 strings, a and b, return the number of the positions where they 
//		contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, 
//		since the "xx", "aa", and "az" substrings appear in the same place in both strings.
		
		System.out.println(stringMatch("xxcaazz", "xxbaaz")); // → 3
		System.out.println(stringMatch("abc", "abc")); // → 2
		System.out.println(stringMatch("abc", "axc")); // → 0
	}
 
	public static int stringMatch(String a, String b) {	
		int length = Math.min(a.length(), b.length());
		int count = 0;
		for (int i=0; i <= length-2; i++) {
			if (a.substring(i, i+2).contentEquals(b.substring(i, i+2))) {
				count++;
			}
		}
		return count;
	}
}
