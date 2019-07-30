package allExercises.codingBat_Warmup2;

public class ArrayHas271 {

	public static void main(String[] args) {
			
//		Given an array of ints, return true if it contains a 2, 7, 1 pattern: 
//		a value, followed by the value plus 5, followed by the value minus 1. 
//		Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

		
		int[] intArray1 = {1, 2, 7, 1};
		int[] intArray2 = {1, 2, 8, 1};
		int[] intArray3 = {2, 7, 0};
		
		System.out.println(arrayHas271(intArray1)); // → true
		System.out.println(arrayHas271(intArray2)); // → false
		System.out.println(arrayHas271(intArray3)); // → true
	}
 
	public static boolean arrayHas271(int[] nums) {	

	  for (int i=0; i<nums.length-2; i++) {
	    if (nums[i] + 5 == nums[i+1]  && Math.abs(nums[i] - 1 - nums[i+2]) <= 2 ) return true; 
	  } 
	  return false;
	}
}
