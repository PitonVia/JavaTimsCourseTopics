package allExercises.methodsExercisesTim;

public class LastDigitChecker {

	public static void main(String[] args) {
		// Method returns true if at least 2 numbers share the last digit.
		
		System.out.println(hasSameLastDigit(9, 100, 100));
		System.out.println(hasSameLastDigit(10, 133, 1000));
		System.out.println(hasSameLastDigit(-1, 133, 290));
		System.out.println(hasSameLastDigit(18, 188, 290));

	}

	public static boolean hasSameLastDigit(int n1, int n2, int n3) {
		
		if (n1<10 || n2<10 || n3<10 || n1>1000 || n2>1000 || n3>1000)
			return false;
				
		return ((n1%10==n2%10) || (n2%10==n3%10) || (n3%10==n1%10));		
	}
}
