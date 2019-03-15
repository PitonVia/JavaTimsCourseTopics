package lambdas.uTubeLambdasCourse;

//  Method references can only be used to replace a single-method lambda expression!!
// It is an alternative way to achieve exactly the same result as when using a lambda. 

// So to use a method reference, you first need a lambda expression with one method. And to use a lambda  
// expression, you first need a functional interface, an interface with just one abstract method.

// In other words:
// Instead of using AN ANONYMOUS CLASS, you can use A LAMBDA EXPRESSION.
// And if this just calls one method, you can use A METHOD REFERENCE.

// Method reference syntax:			Object::methodName 


public class _08_MethodReferenceExample1 {

	public static void main(String[] args) {
		
		// Calling a simple method that prints "Hello" 
		printMessage();
		
		// If I want to use Thread to call the same method where lambda is implementing the Runnable interface
		Thread t = new Thread(() -> printMessage());
		
		// Starts the thread, which will call the printMessage() 
		t.start();
		
		// Method reference provides another way to use lambda with Thread and printMessage() 
		Thread t2 = new Thread(_08_MethodReferenceExample1::printMessage);
		
		t2.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello!");
	}
}
