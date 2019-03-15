package lambdas.uTubeLambdasCourse;

import java.util.function.BiConsumer;

public class _05_ExceptionHandlingExample {

	public static void main(String[] args) {
		
		// Declaring an integer array
		int [] someNumbers = {1, 2, 3, 4};
		
		int key = 0;
		
		// Calling process method, which operates on the int [], takes a key and performs some processing on the 
		// array based on the provided lambda expression that uses the key, in this case it is division.
		// Now, there is a challenge - how do we catch Arithmetic exception when the key is 0?
		// We are going to create a method that wraps the lambda in another lambda that has a try catch.  
		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k))); 
	
	}

	// Passing BiConsumer interface, which takes 2 objects as args and returns void.
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		
		for (int i : someNumbers) {
			// Using accept method to operate on two Integer args so that we could use lambda to 
			// define the operation we would like to perform with these two Integers
			consumer.accept(i, key);
		}	
	}
	
	// Wrapper lambda method that returns a lambda expression 
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic exception caught in wrapper lambda - cannot divide by 0.");
			}
		};
	}
}
