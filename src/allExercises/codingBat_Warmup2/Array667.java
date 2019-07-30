package allExercises.codingBat_Warmup2;

public class Array667 {

	public static void main(String[] args) {
			
//		Given an array of ints, return the number of times that two 6's are next to each other 
//		in the array. Also count instances where the second "6" is actually a 7.
		
		int[] intArray1 = {6, 7, 2};
		int[] intArray2 = {6, 6, 2, 6};
		int[] intArray3 = {6, 6, 7, 2, 6};
		
		System.out.println(array667(intArray1)); // → 1
		System.out.println(array667(intArray2)); // → 1
		System.out.println(array667(intArray3)); // → 2
	}
 
	public static int array667(int[] nums) {	
		int count = 0;
	
		for (int i=0; i<nums.length-1; i++) {
		    if (nums[i] == 6 && nums[i+1] == 6 || nums[i] == 6 && nums[i+1] == 7) {
		    	count ++;
		    }  
		}
		return count;
	}	
}
