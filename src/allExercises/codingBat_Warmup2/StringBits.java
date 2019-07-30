package allExercises.codingBat_Warmup2;

public class StringBits {

	public static void main(String[] args) {
			
//		Given a non-empty string like "Code" return a string like "CCoCodCode".
//		Note that the new string contains 4 parts, each part has +1 char from the beginning of the string. 
		
		System.out.println(stringSplosion("Code")); // → CCoCodCode
		System.out.println(stringSplosion("Hi")); // → HHi
		System.out.println(stringSplosion("")); // → 
	}
 
	public static String stringSplosion(String str) {	
		String result = "";
		
		for (int i=0; i <= (str.length()); i++) {
			result += str.substring(0,i);
		}
		return result;
	}
}
