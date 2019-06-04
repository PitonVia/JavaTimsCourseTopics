package allExercises.codingBat_Warmup1;

public class DelDel {

	public static void main(String[] args) {
			
//		Given a string, if the string "del" appears starting at index 1, return a string 
//		where that "del" has been deleted. Otherwise, return the string unchanged.
		
		System.out.println(delDel("adelbc")); // → "abc"
		System.out.println(delDel("adel")); // → "a"
		System.out.println(delDel("adedbc")); // → "adedbc"
		System.out.println(delDel("add")); // → "add"
		
		System.out.println("CARIB                        T".length());
		
	}
 
	public static String delDel(String str) {	
		if (str.length()>=4 && str.substring(1,4).equals("del")) {
			return str.substring(0,1) + str.substring(4);
		}
		return str;
	}
	
	
}
