package allExercises.codingBat_Warmup2;

public class StringRemoveX {

	public static void main(String[] args) {
			
//		Given a string, return a version where all the "x" have been removed. 
//		Except an "x" at the very start or end should not be removed.
		
		System.out.println(stringX("xxHxix")); // → xHix
		System.out.println(stringX("abxxxcd")); // → abcd
		System.out.println(stringX("xabxxxcdx")); // → xabcdx
		System.out.println(stringX("")); // → 
	}
 
	public static String stringX(String str) {	
		
		if (str.length() <= 2) return str;
		
		String result = "";
		for (int i=1; i <= (str.length()-2); i++) {	
			if (str.charAt(i) != 'x') {
				result += str.charAt(i);
			}	
		}
		return str.substring(0, 1) + result + str.substring(str.length()-1);
	}
	
	// official solution
	public String stringX2(String str) {
		String result = "";
		for (int i=0; i<str.length(); i++) {
			// Only append the char if it is not the "x" case
			if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
		    result += str.substring(i, i+1); // Could use str.charAt(i) here
		    }
		}
		return result;
	}
}
