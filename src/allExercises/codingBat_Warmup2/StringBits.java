package allExercises.codingBat_Warmup2;

public class StringBits {

	public static void main(String[] args) {
			
//		Given a string, return a new string made of every other char 
//		starting with the first, so "Hello" yields "Hlo".
		
		System.out.println(stringBits("Hello")); // → Hlo
		System.out.println(stringBits("Hi")); // → H
		System.out.println(stringBits("Heeololeo")); // → Hello
	}
 
	public static String stringBits(String str) {	
		String result = "";
		
		for (int i=0; i<(str.length()); i+=2) {
//			result += str.substring(i, i+1); //	either one works!
			result += str.charAt(i);
		}
		return result;
	}
}
