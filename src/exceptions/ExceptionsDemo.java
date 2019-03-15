package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {

	// EXCEPTION - event occurs during code execution that disrupts the normal
	// flow of the program

	// There are 2 main approaches to deal with errors:

	// 1. LBYL - Look Before You Leap  (e.g. conditional checks before code execution, e.g. if( y != null) return x/y;
	// 2. EAFP - Easy to Ask for Forgiveness then Permission (using try/catch block & exception handling)
	
	public static void main(String[] args) {

		int x = 98;
        int y = 0;

        System.out.println(divideLBYL(x,y));
        System.out.println(divideEAFP(x,y));
        //System.out.println(divide(x,y));
        System.out.println();

        // calling Scanner method to handle user input errors:
//        x = getInt();
        x = getIntLBYL();
        //x = getIntEAFP();

        System.out.println("x is " + x);
	}

	 //Approach 1 - LBYL:
    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        return 0;
    }

    //Approach 2 - EAFP:
    private static int divideEAFP(int x, int y) {
        // if no error, code within try{} will be executed:
        try {
            return x / y;
        } catch(ArithmeticException e) { // in case of an error specify exception
            // this code will be returned in case of error
            return 0;
        }
    }

    // If no method is used, program will crash:
    private static int divide(int x, int y) {
        return x / y;
    }

    // method that takes scanner input without any error handling:
    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        return s.nextInt();
    }

    // Scanner input with LBYL:
    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        boolean isValid = true;
        String input = s.next();
        for (int i=0; i<input.length(); i++) {
            // if any char of user input is NOT a digit
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            // since input passed validation, there should be no error converting it to int
            return Integer.parseInt(input);
        }
        return 0;
    }

    // Scanner input with EAFP error handling.
    // Note that in this case, EAFP approach requires less code.
    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }
	
}
