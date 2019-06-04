package allExercises.codingBat_Warmup2;

public class CountXX {

	public static void main(String[] args) {
			
//		Count the number of "xx" in the given string. 
//		We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
		
		System.out.println(countXX("abcxx")); // → 1
		System.out.println(countXX("xxx")); // → 2
		System.out.println(countXX("xxxx")); // → 3
	}
 
	public static int countXX(String str) {	
		
		int count = 0;
		
		for (int i=0; i<(str.length()-1); i++) {
			if (str.substring(i,i+2).contentEquals("xx")) {
				count +=1;
			}
		}
		return count;
	}
}
