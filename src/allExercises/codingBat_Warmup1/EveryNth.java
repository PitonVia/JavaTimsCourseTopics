package allExercises.codingBat_Warmup1;

public class EveryNth {

	public static void main(String[] args) {
			
//		Given a non-empty string and an int N, return the string made starting with char 0, and then 
//		every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
		
		System.out.println(everyNth2("Miracle", 2)); // → "Mrce"
		System.out.println(everyNth2("abcdefg",3)); // → "adg"
		System.out.println(everyNth2("movie",1)); // → "movie"
		System.out.println(everyNth2("Chocolates", 4)); // → "Coe");
	}
 
	public static String everyNth(String str, int n) {	
		
		if (n > str.length()) {
			return str.substring(0,1);
		}
		
		String newString = str.substring(0,1);
		int incr = n;
		int remainder = 0;
		
		if (str.length()%n > 0) {
			remainder = 1;
		}
		
		for (int i=1; i<(str.length()/n+remainder); i++) {
				newString += str.substring(incr, incr+1);
				incr += n;
		}

		return newString;
	}
	
	// Alternative simple solution:
	public static String everyNth2(String str, int n) {	
		
		String result = "";
		  
		  // Look at every Nth char
		  for (int i=0; i<str.length(); i+=n) {
		    result = result + str.charAt(i);
		  }
		  return result;
	}
}
