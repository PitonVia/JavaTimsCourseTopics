package allExercises.codingBat_Warmup1;

public class FrontBack {

	public static void main(String[] args) {
			
//		Given a string, return a new string where the first and last chars have been exchanged.
		
		System.out.println(frontBack("code")); // → "eodc"
		System.out.println(frontBack("a")); // → "a"
		System.out.println(frontBack("ab")); // → "ba"	
		
		System.out.println(frontBack2("code")); // → "eodc"
		System.out.println(frontBack2("a")); // → "a"
		System.out.println(frontBack2("ab")); // → "ba"	
	}
 
	public static String frontBack(String str) {	
		if (str.length() < 2) {
			return str;
		}	
		String firstChar = str.substring(0, 1);
		String lastChar = str.substring(str.length()-1, str.length());
		String middlePart = str.substring(1, str.length()-1);		
		
		return lastChar + middlePart + firstChar;
	}
	
	// another solution using charAt()
	public static String frontBack2(String str) {	
		if (str.length() < 2) return str;
		
		String middlePart = str.substring(1, str.length()-1);		
		return str.charAt(str.length()-1) + middlePart + str.charAt(0);
	}
	
}
