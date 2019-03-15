package allExercises.methodsExercisesTim;

public class TeenNumberChecker {

	public static void main(String[] args) {
		// a number is a "teen" if it is in the range of 13-19 (inclusive)
		// return true if 1 of 3 params is within the "teen" range

		System.out.println(hasTeen(9,99,19));
		System.out.println(hasTeen(23,15,42));
		System.out.println(hasTeen(22,23,34));
	}

	public static boolean hasTeen(int n1, int n2, int n3) {
		
		return ((n1>=13) && (n1<=19)) || ((n2>=13) && (n2<=19)) || ((n3>=13) && (n3<=19));
	}
	
}
