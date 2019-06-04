package allExercises.codingBat_Warmup1;

public class StartOz {

	public static void main(String[] args) {
			
//		Given a string, return a string made of the first 2 chars (if present), however include first  
//		char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz". 
		
		System.out.println(startOz2("ozymandias")); // → "oz"
		System.out.println(startOz2("bzoo")); // → "z"
		System.out.println(startOz2("oxx")); // → "o"
		System.out.println(startOz2("o")); // → "o"
		System.out.println(startOz2("abc")); // → ""
		System.out.println(startOz2("")); // → ""
		
		System.out.println("CARIB                        T".length());
		
	}
 
	public static String startOz(String str) {	
		if (str.length()>1 && str.substring(0,2).equals("oz")) return "oz";
		else if (str.length()>0 && str.substring(0,1).equals("o")) return "o";
		else if (str.length()>1 && str.substring(1,2).equals("z")) return "z";
		return "";
	}
	
	// Alternative solution
	public static String startOz2(String str) {
		  String result = "";
		  
		  if (str.length() >= 1 && str.charAt(0)=='o') {
		    result += str.charAt(0);
		  }
		  
		  if (str.length() >= 2 && str.charAt(1)=='z') {
		    result += str.charAt(1);
		  }
		  
		  return result;
		}
}
