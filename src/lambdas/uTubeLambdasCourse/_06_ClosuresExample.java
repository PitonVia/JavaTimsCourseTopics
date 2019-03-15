package lambdas.uTubeLambdasCourse;

public class _06_ClosuresExample {

	public static void main(String[] args) {
	
		int a = 10;
		// Lambda is executed in the doProcess method, which cannot access this variable "b". 
		// However, compiler is accessing it and treating it as a constant. This is called a CLOSURE.
		int b = 20;  
		
		// Calling the doProcess method using anonymous class to implement Process interface
		doProcess(a, new Process() {
			@Override
			public void process(int i) {
				// Note how the compiler can pick up the value of "b" even though it's not part of interface.
				// The compiler, however, will treat this value as a constant and will not allow changing it.
				System.out.println(i + b); 
			}			
		});	
		
		// Calling the doProcess method using a lambda expression to implement Process interface
		doProcess(a, i -> System.out.println(i + b)); 
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}

// Process interface with a single void process method.
interface Process {
	void process(int i);
}