package allExercises.methodsExercisesTim;

public class Fibonacci {

	// The challenge was to create 3 static methods below and then,
	// Export the project into Series.jar to be imported into a different package.
	
//	public static void main(String[] args) {
//
//		System.out.println(nSum(3));
//
//		System.out.println(factorial(1));
//
//		System.out.println(fibonacci(7));
//		
//		System.out.println(fib(7));
//	}

	// Returns the sum of all numbers from 0 to n:
	public static int nSum(int n) {

		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	// Returns the product of all numbers from 1 to n:
	public static int factorial(int n) {

		if (n <= 0)
			return 0;

		int product = 1;

		for (int i = 1; i <= n; i++) {
			product *= i;
		}
		return product;
	}

	// Returns the n-th fibonacci's number. These are defined:
	// f(0) = 0 
	// f(1) = 1
	// f(n) = f(n-1) + f(n-2)
	// Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
	// The f(3) is found by adding the two numbers before it (1+1)
	// The f(4) is found by adding the two numbers before it (1+2),
	// And the 5 is (2+3), and so on!
	// if n=5 => (3) + (5) = 8

	public static int fibonacci(int n) {

		if (n==0 || n==1) return n;

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// Another solution involving an int array.
	static int fib(int n) {

		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n+2]; // 1 extra to handle case, n = 0

		/* 0th and 1st number of the series are 0 and 1 */
		f[0] = 0;
		f[1] = 1;

		for (int i=2; i<=n; i++) {
		
			//Add the previous 2 numbers in the series and store them
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}
}
