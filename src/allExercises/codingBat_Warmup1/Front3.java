package allExercises.codingBat_Warmup1;

public class Front3 {

	public static void main(String[] args) {
			
//		Given a string, we'll say that the front is the first 3 chars of the string. 
//		If the string length is less than 3, the front is whatever is there. 
//		Return a new string which is 3 copies of the front.
		
		System.out.println(front3("Java")); // → "JavJavJav"
		System.out.println(front3("a")); // → "aaa"
		System.out.println(front3("Ab")); // → "AbAbAb"	
		
	}
 
	public static String front3(String str) {	
		if (str.length() < 3) {
			return str + str + str;
		}	
		String front = str.substring(0, 3);
		
		return front + front + front;
	}
	
	
}
