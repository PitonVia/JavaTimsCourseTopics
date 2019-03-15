package ternaryOperator;

public class TernaryOperatorDemo {

	// The ternary operator is also known as the conditional operator. This operator consists of three operands and is used to 
	// evaluate Boolean expressions. The goal of the operator is to decide, which value should be assigned to the variable.
	
	
	// Ternary Operator Syntax:
	// variable x = (boolean expression) ? [value if true] : [value if false]
	
	public static void main(String[] args) {

		int a, b;
		
		a = 10;
		
	    b = (a == 10) ? 20: 30;
	    System.out.println( "Value of b is : " + b );
		
		b = (a == 1) ? 20: 30;
	    System.out.println( "Value of b is : " +  b );

	    System.out.println();
	    System.out.println("****************");
	    System.out.println();
	    
	    // Here, we will use ternary operator to determine whether to print single or plural items based on their quantity:
	    
	    int quantityApples = 1, quantityTomatoes = 5;
	    
	    System.out.println("You can have " + quantityApples + ((quantityApples <= 1) ? " apple" : " apples") + 
	    		" and " + quantityTomatoes + ((quantityTomatoes <= 1) ? " tomatoe" : " tomatoes") + " for lunch.");
	    
	}

}
