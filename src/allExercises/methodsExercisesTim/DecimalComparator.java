package allExercises.methodsExercisesTim;

public class DecimalComparator {

	public static void main(String[] args) {
		// return true if two double numbers are the same up to 3 decimal places

		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		
	}

	public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
		
		// remember to add parentheses so entire expression is casted to int
		n1 = (int) (n1 * 1000);
		n2 = (int) (n2 * 1000);
		
		if (n1 == n2) {
			return true;
		} 

		return false;
	}
	
	// 	One line code solution
	public static boolean areEqualByThreeDecimalPlaces2(double num1, double num2) {
	    
	    return (int)(num1*1000) == (int)(num2*1000); 
	    
	}  
}