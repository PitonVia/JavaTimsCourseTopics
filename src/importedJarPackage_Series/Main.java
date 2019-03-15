package importedJarPackage_Series;

// Importing Series.jar 
import packagesChallenge.Series;

// The jar file is actually located here:  D:\Yo\QA\JAVA\Jars

public class Main {

	public static void main(String[] args) {

		// Calling nSum() method:
		for (int i=0; i<=12; i++) {
			// Note how we are calling method's name preceded by jar name
			System.out.print(" " + Series.nSum(i));		
		}
		System.out.println("\n");
		
		// Calling factorial() method:
		for (int i=0; i<=10; i++) {
			System.out.print(" " + Series.factorial(i));		
		}
		System.out.println("\n");
		
		// Calling fibonacci() method:
		for (int i=0; i<=12; i++) {
			System.out.print(" " + Series.fibonacci(i));		
		}
	}
}
