package allExercises.codingBat_Warmup2;

public class ArrayFront9 {

	public static void main(String[] args) {
			
//		Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
//		The array length may be less than 4.
		
		int[] intArray1 = {1, 2, 9, 3, 4};
		int[] intArray2 = {1, 2, 3, 4, 9};
		int[] intArray3 = {1, 2, 3, 4, 5};
		
		System.out.println(arrayFront9(intArray1)); // → true
		System.out.println(arrayFront9(intArray2)); // → false
		System.out.println(arrayFront9(intArray3)); // → false
	}
 
	public static boolean arrayFront9(int[] nums) {	
		
		if (nums.length <= 4) {
		    for (int i=0; i<nums.length; i++) {
		      if (nums[i] == 9) return true; 
		    }
		    return false;
		  }
	  // handling the rest of int[] having length > 4 ints
	  for (int i=0; i<4; i++) {
	    if (nums[i] == 9) return true; 
	  } 
	  return false;
	}
	
	// optimized solution
	public static boolean arrayFront9Opt(int[] nums) {	
	
		// First figure the end for the loop
		int end = nums.length;
		if (end > 4) end = 4;
		
		for (int i=0; i<end; i++) {
		    if (nums[i] == 9) return true;
		  }
		return false;
	}
}
