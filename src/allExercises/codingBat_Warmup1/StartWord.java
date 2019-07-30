package allExercises.codingBat_Warmup1;

public class StartWord {

	public static void main(String[] args) {
			
//		Given a string and a second "word" string, we'll say that the word matches the string if 
//		it appears at the front of the string, except its first char does not need to match exactly. 
//		On a match, return the front of the string, or otherwise return the empty string. 
//		So with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". 
//		The word will be at least length 1.
		
		System.out.println(startWord("hippo", "hi")); // → "hi"
		System.out.println(startWord("hippo", "xip")); // → "hip"
		System.out.println(startWord("hippo", "i")); // →  "h"
		System.out.println(startWord("h", "ix")); // → ""
		
	}
 
	public static String startWord(String str, String word) {	
		
		if (str.length()<1) return "";
		
		if (str.length()==1 && word.length()>1) return "";
		
		String beginningStr = str.substring(0,1); 
		int commonLength = Math.min(word.length(), str.length());
		
		if (str.substring(1, commonLength).equals(word.substring(1, commonLength))) {
		    return beginningStr + word.substring(1, commonLength);
		}
		
		return "";
	}
	
	
}
