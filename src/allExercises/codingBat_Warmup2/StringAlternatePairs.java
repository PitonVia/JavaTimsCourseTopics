package allExercises.codingBat_Warmup2;

public class StringAlternatePairs {

	public static void main(String[] args) {
			
//		Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... 
//		so "kittens" yields "kien".
		
		System.out.println(altPairs("kitten")); // → kien
		System.out.println(altPairs("Chocolate")); // → Chole
		System.out.println(altPairs("CodingHorror")); // → Congrr
		System.out.println(altPairs("")); // → 
	}
 

	public static String altPairs(String str) {	
		
		if (str.length() <= 2) return str;
		
		String result = "";
		// The trick here is to amend the step from i++ to i+=4 as we want 
		// to take 4 chars at a time while displaying just the first 2! 
		for (int i=0; i < str.length()-1; i+=4) {	
			result += str.substring(i, i+2);
		}
		// in case we have one extra 5-th character after last cycle
		if (str.length() % 4 == 1 ) {
			result += str.substring(str.length()-1);
		}
		
		return result;
	}
	
	// official solution
	public String stringX2(String str) {
		
		String result = "";  
		// Run i by 4 to hit 0, 4, 8, ...
		for (int i=0; i<str.length(); i += 4) {
			// Append the chars between i and i+2
		    int end = i + 2;
		    if (end > str.length()) {
		    	end = str.length();
		    }
		    result = result + str.substring(i, end);
		}
		  
		return result;
	}
}
