package allExercises.codingBat_Warmup2;

public class DoubleX {

	public static void main(String[] args) {
			
//		Given a string, return true if the first instance of "x" in the string is 
//		immediately followed by another "x".
		
		System.out.println(doubleX3("axxbb")); // → true
		System.out.println(doubleX3("axaxax")); // → false
		System.out.println(doubleX3("xxxxx")); // → true
		System.out.println(doubleX3("xjxx")); // → false
		System.out.println(doubleX3("ooox")); // → false
	}
 
	// My solution
	public static boolean doubleX(String str) {	
		
		for (int i=0; i<str.length()-1; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
				return true;
			} 
			if (str.charAt(i) == 'x' && str.charAt(i+1) != 'x') {
				return false;
			}
		}	
		return false;
	}
	
	// Proposed solution uses indexOf()
	public static boolean doubleX2(String str) {	
		
		int i = str.indexOf("x");
		if (i == -1) return false; // if i == -1, then string contains No "x".
		
		// check if i+1 is within string bounds
		if (i+1 >= str.length()) return false;
		
		if (str.charAt(i+1) == 'x') return true;
			
		return false;
	}
	
	// Proposed simplified solution uses indexOf()
	public static boolean doubleX3(String str) {	
		
		int i = str.indexOf("x");
		if (i == -1) return false; // if i == -1, then string contains No "x".
		
		str = str.substring(i);
		if (str.startsWith("xx")) return true;
			
		return false;
	}
}
