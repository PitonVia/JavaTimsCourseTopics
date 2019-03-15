package allExercises.methodsExercisesTim;

public class FlourPackProblem {

	public static void main(String[] args) {
		// Method checks if it is possible to assemble a package.
		// bigCount represents count of big flour bags (5 Kg)
		// smallCount represents count of small flour bags (1 Kg)
		// goal represents the amount of kilos required to assemble a package

		System.out.println(canPack(-1, 0, 0));
		System.out.println(canPack(0, 0, 0));
		System.out.println(canPack(2, 1, 11));
		System.out.println(canPack(2, 1, 9));
		System.out.println(canPack(1, 0, 6));
		System.out.println(canPack(2, 1, 5));
		System.out.println(canPack(4, 18, 19));
		System.out.println(canPack(6, 2, 17));
		System.out.println(canPack(0, 5, 6));
		
	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		
		bigCount *=5;
		
		if (bigCount < 0 || smallCount < 0 || goal < 0) return false;	
		
		return ((bigCount + smallCount) >= goal) && (goal % 5 <= smallCount);
	}
}
