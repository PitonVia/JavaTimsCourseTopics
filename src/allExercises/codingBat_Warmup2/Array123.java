package allExercises.codingBat_Warmup2;

public class Array123 {

	public static void main(String[] args) {
			
//		Given an array of ints, return true if the sequence of numbers 1, 2, 3 
//		appears in the array somewhere.
		
		int[] intArray1 = {1, 1, 2, 3, 1};
		int[] intArray2 = {1, 1, 2, 4, 1};
		int[] intArray3 = {1, 1, 2, 1, 2, 3};
		
		System.out.println(array123(intArray1)); // → true
		System.out.println(array123(intArray2)); // → false
		System.out.println(array123(intArray3)); // → true
	}
 
	public static boolean array123(int[] nums) {	

	  for (int i=0; i<nums.length-2; i++) {
	    if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true; 
	  } 
	  return false;
	}
}
