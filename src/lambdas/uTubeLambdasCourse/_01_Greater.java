package lambdas.uTubeLambdasCourse;

//Advantages of Lambdas: 

//1.) They enable functional programming 
//The benefit of functional programming is improved readability and easier maintainability of code.
//2.) Readable and concise code (in some cases) 
//3.) Make APIs and libraries easier to use
//4.) Enable support for parallel processing

//Lambdas can only be used for functional interfaces that usually have a single method. 

//Lambdas expressions are executed by calling the interface method on it, just as if it were an instance of a class.
//Lambda expressions are not just a shortcut for anonymous classes, which implement functional interfaces. 


public class _01_Greater {

	public void greet(Greeting greeting) {
		greeting.foo();
	}
	
	public static void main(String[] args) {
		
		// Lambda allows to assign a method to a variable in Java 8 by stripping the method of non-required parts such 
		// as access modifies, return type and method's namem which are replaced by lambda's name and add an "->".
		// If the body of the lambda expression is just 1 line, then can get rid of curly braces also!
		
		// Using lambda for an interface with 1 method with the same return type and signature
		MyAdd addFunction = (int a, int b) -> a + b;
		
		// We can use the same interface for division - example shows lambda with more than 1 lines of code:
		MyAdd safeDivideFunction = (int a, int b) -> {
			if (b == 0) return 0; 
			return a / b;		
		};
		
		// Using the interface that returns an int and takes String as an argument. 
		MyStringLength stringLengthFunction = (String s) -> s.length();
		
		// We are using lambda for a simple interface that has 1 function with void return type. 
		Greeting greetingFunction = () -> System.out.println("Hello!");
		
	
		// Example of the anonymous function:
		Greeting innerClassGreating = new Greeting() {
			public void foo() {
				System.out.println("Hello!");
			}
		};
		
		
		_01_Greater greater = new _01_Greater();
		
		greater.greet(greetingFunction); // calling implementation using lambda expression
		greater.greet(innerClassGreating); // using implementation of an anonymous inner class
		
		
	}

	// Declaring a simple interface that matches its single function with no return (void) and no parameters.
	interface Greeting {
		void foo();
	}
	
	// Declaring an interface with a single function that returns an int and has the same two int parameters.
	interface MyAdd {
		int foo(int x, int y);
	}
	
	// Declaring an interface with a single function that returns an int and takes a string as an argument.
	interface MyStringLength {
		int length(String string);
	}
	

}
