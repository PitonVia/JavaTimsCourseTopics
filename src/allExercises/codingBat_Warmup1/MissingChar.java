package allExercises.codingBat_Warmup1;

public class MissingChar {

	public static void main(String[] args) {
		
// 		Given a string, return a new string where "not " has been added to the front. 
//		However, if the string already begins with "not", return the string unchanged. 
//		Note: use .equals() to compare 2 strings.
		
		
		System.out.println(notString("candy"));
		System.out.println(notString("x"));
		System.out.println(notString("not bad"));
		
		System.out.println(notString2("not"));
		System.out.println(notString2("not is not"));
		System.out.println(notString2("123"));
		
	}

	public static String notString(String str) {
		if (str.startsWith("not")) return str;	
		return "not " + str;
	}
	
	// alternative solution using substring()
	public static String notString2(String str) {
		if (str.length() >=3 && str.substring(0,  3).equals("not")) return str;	
		else return "not " + str;
	}
}
