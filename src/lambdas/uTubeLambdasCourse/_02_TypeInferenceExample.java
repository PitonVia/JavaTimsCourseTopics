package lambdas.uTubeLambdasCourse;

public class _02_TypeInferenceExample {

	public static void main(String[] args) {
		
		// Defining the lambda for the StringLengthLambda interface
		StringLengthLambda myLambda = (String s) -> s.length(); 

		// Note that we can also get rid of the 'String' parameter type and leave just a value. 
		// Compiler checks the interface and knows which tuype of argument it's single method is using.  
		StringLengthLambda myLambda2 = (s) -> s.length(); 
		
		// Likewise, we can get rid of the parentheses when we have only 1 argument:
		StringLengthLambda myLambda3 = s -> s.length();
		
		// Calling the interface using lambda
		System.out.println(myLambda.getLength("Hello lambda"));
		System.out.println(myLambda2.getLength("Hello lambda"));
		System.out.println(myLambda3.getLength("Hello lambda"));
		
		// We can call a method that will take lambda as an argument: 
		printLambda(s -> s.length());
	}

	// Method will take an interface as an argument and will allow us to call lambda
	public static void printLambda(StringLengthLambda lambda) {
		System.out.println(lambda.getLength("Hi lambda!"));
	}
	
	// Creating an interface, which we will be implementing using lambda expressions
	interface StringLengthLambda {
		int getLength(String s);
	}
	
}
