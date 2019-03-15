package lambdas.uTubeLambdasCourse;

// Java 8 allows writing non-abstract methods in interfaces so to qualify for lambda, an interface 
// has to have no more than 1 abstract method while it may have multiple non-abstract methods!!

// Any interface with a SAM (Single Abstract Method) is a functional interface, and its implementation may be treated as lambda expressions.
// Note that Java 8’s default methods are not abstract and do not count: a functional interface may still have multiple default methods. 

// Runnable interface has only one abstract method - run so we can use it with lambda

public class _03_RunnableExample {
	
	public static void main(String[] args) {
		
		
		// Method 1 - using anonymous class (without lambda) 
		// Here is a classic example of anonymous class usage - declaring an instance of Thread class to 
		// pass Runnable interface to it implemented by an instance of anonymous inner class.
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printed inside anonymous Runnable");
			}
		});

		// Calling the run() method of the Runnable interface implemented with an anonymous inner class
		myThread.run();
		
		// Method 2 - using lambda and less code
		// Thread requires an instance of Runnable so we will use a lambda instead of an instance of an anonymous class
		Thread myLambdaThread = new Thread( () -> System.out.println("Printed inside lambda Runnable"));
		
		// Calling the run() method of the Runnable interface implemented with a lambda
		myLambdaThread.run();		
	}
}
