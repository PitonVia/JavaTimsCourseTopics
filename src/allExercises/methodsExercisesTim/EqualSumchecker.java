package allExercises.methodsExercisesTim;

public class EqualSumchecker {

	public static void main(String[] args) {
		// Return true if sum of the 1-st and 2-nd params equal to 3-rd param 
		
		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));
		System.out.println(hasEqualSum(1, -1, 0));
	}
	
	public static boolean hasEqualSum(int n1, int n2, int n3) {
		
		return ((n1+n2) == n3);
		
	}

}
