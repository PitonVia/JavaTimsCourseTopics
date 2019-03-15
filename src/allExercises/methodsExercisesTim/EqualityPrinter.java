package allExercises.methodsExercisesTim;

public class EqualityPrinter {

	public static void main(String[] args) {
		// If all 3 numbers are equal, print: "All numbers are equal"
		// If all 3 numbers are different, print: "All numbers are different"
		// Otherwise, print: "Neither all are equal or different"

		printEqual(1,1,1);
		printEqual(1,1,2);
		printEqual(-1,-1,-1);
		printEqual(1,2,3);
		
	}

	public static void printEqual(int n1, int n2, int n3) {
		
		if ((n1<0) || (n2<0) || (n3<0))
			System.out.println("Invalid Value");
		
		else if ((n1==n2) && (n2==n3) && (n3==n1)) 
			System.out.println("All numbers are equal");
		
		else if ((n1!=n2) && (n2!=n3) && (n3!=n1))
			System.out.println("All numbers are different");
		
		else
			System.out.println("Neither all are equal or different");
	}
}
