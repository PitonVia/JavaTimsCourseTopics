package lambdas.uTubeLambdasCourse;

public class _07_ThisReferenceExample {

	// Lambda does not work with 'this' reference in the same way that anonymous classes do! 
	
	// In case of the anonymous class implementation, 'this' points to the anonymous class instance.
	// In case of the lambda implementation, 'this' points to the instance of an outside class i.e. _07_ThisReferenceExample  

	// doProcess() uses Process interface that was declared inside the _06_ClosuresExample class:
	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public static void main(String[] args) {
		
		_07_ThisReferenceExample thisRefEx = new _07_ThisReferenceExample();
		
		// Implementing process interface with an anonymous class
		thisRefEx.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i is: " + i);
				// Note that 'this' points to the anonymous Process instance from doProcess()
				System.out.println(this);
			}
			
			// Overriding toString method:
			@Override
			public String toString() {
				return "This is toString() of the anonymous inner class";
			}
		});
		
		System.out.println();
		
		// Implementing process interface with a lambda expression
		// Note that we cannot override the toString() with the lambda implementation!
		thisRefEx.doProcess(10, i -> System.out.println("Value of i is: " + i));
	
		System.out.println();
		
		// The following code would result in an error since we cannot 'this' in the static context: 
/*		thisRefEx.doProcess(10, i -> { 
			System.out.println("Value of i is: " + i);
			System.out.println(this); // lambda is treating 'this' differently, it points to the instance of the class outside lambda.
		});	*/
		
		// 
		thisRefEx.execute();
		
	}
	
	// Now we are using a non-static method to use 'this' with lambda! 
	public void execute() {
		doProcess(10, i -> { 
			System.out.println("Value of i is: " + i);
			// 'this' points to the thisRefEx instance of the _07_ThisReferenceExample class in the Main().
			System.out.println(this);
		});
	}
	
	// Overrides the toString() for the _07_ThisReferenceExample class
	@Override
	public String toString() {
		return "This is tostring() of the main _07_ThisReferenceExample class instance";
	}
}
