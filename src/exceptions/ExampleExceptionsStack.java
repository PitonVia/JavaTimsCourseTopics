package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// In this example, there may be two possible exceptions: 
// 		1.) When user enters "0" for y --> java.lang.ArithmeticException (division by zero)
// 		2.) When user enters a non-integer for x or y --> java.util.InputMismatchException
//		3.) When user enters "Ctrl + D" multiple times for x or y --> java.util.NoSuchElementException

public class ExampleExceptionsStack {

	public static void main(String[] args) {
		
		try {
			int result = divide();
			System.out.println(result);
		} catch (ArithmeticException | NoSuchElementException e) {
			System.out.println(e.toString());
			System.out.println("Unable to perform division, program exiting...");
		}
	}

	private static int divide() {
		
		int x, y;
		
//		try { 
			x = getInt();
			y = getInt();
			System.out.println("x is: " + x + ", y is: " + y);
			return x/y;
//		} catch (NoSuchElementException e) {
//			throw new NoSuchElementException("not suitable input");
//		} catch (ArithmeticException e) {
//			throw new ArithmeticException("cannot divide by 0");
//		}
	}

	private static int getInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer ");
		while(true) {
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				// If exception caught, prompt user to enter Integer again!
				sc.nextLine();
				System.out.println("Please enter a number using only digits ");
			}
		}	
	}
}
