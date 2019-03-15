package scannerUserInput;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

	public static void main(String[] args) {
		// Print the min and max numbers entered by the user.
		// If user enters a non-int, break out of the endless while loop.

		Scanner sc = new Scanner(System.in);
		
		// 1-st way to ensure that min and max value will be updated is to assign the 
		// smallest possible int value to max and the highest possible int value to min.
//		int min = Integer.MAX_VALUE;  // 2147483647  largest int value
//		int max = Integer.MIN_VALUE; // -2147483648 smallest int value
		
		// 2-n way is to leave initial values of min and max = 0 and to assign the value
		// of the first entered number to min & max by declaring a new boolean var and
		// adding a flag inside the while loop.
		
		int min = 0;
		int max = 0;
		boolean firstNumber = true;
		
		while (true) {
			
			System.out.println("Enter number:");
			
			// if user enters a non-integer
			if (!sc.hasNextInt()) {
				break;
			}
			
			int number = sc.nextInt();
			sc.nextLine(); // handles next line skipping issue
			
			if(firstNumber) {
				firstNumber = false;
				min = number;
				max = number;
			}
			
			if (number > max) 
				max = number;
		
			if (number < min) 
				min = number;
		}
		System.out.println("min= " + min + ", max= " + max);
		
		sc.close();
	}
}
