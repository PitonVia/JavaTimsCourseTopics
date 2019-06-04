package allExercises.codingBat_Warmup1;

public class FindEs {

	public static void main(String[] args) {
			
//		Return true if the given string contains between 1 and 3 'e' chars.
		
		System.out.println(stringE("Hello")); // → true
		System.out.println(stringE("Heelle")); // → true
		System.out.println(stringE("Heelele")); // → false
		System.out.println(stringE("e")); // → true
		System.out.println(stringE("")); // → false
		
	}
 
	// solution using string method charAt()
	public static boolean stringE(String str) {	
		
		int countE = 0;
		
		for (int i=0; i<str.length(); i++) {
	
			if (str.charAt(i) == 'e') {
				countE += 1;
			}
		}
		return (countE >= 1 && countE <= 3);
	}
	
	// solution using char[]
	public static boolean stringE2(String str) {	
		
		char[] charA = str.toCharArray();
		
		int countE = 0;
		
		for (int i=0; i<charA.length; i++) {
	
			if ((char) charA[i] == 'e') {
				countE += 1;
			}
		}
		return (countE >= 1 && countE <= 3);
	}
		
}
