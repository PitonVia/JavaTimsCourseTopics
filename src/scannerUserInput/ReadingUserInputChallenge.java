package scannerUserInput;

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {
		// Code should read user input, pick first 3 valid integers and 
		// print calculated sum of those integers.

		Scanner sc = new Scanner(System.in);
		
		int counter = 1;
		int sum = 0;
		
		while (counter < 4) {
		
			System.out.println("Enter number #" + counter + ": ");
			
			while (!sc.hasNextInt()) {
				System.out.println("Invalid Number");
				System.out.println("Enter number #" + counter + ": ");
				
				sc.nextLine(); // handles next line skipping issue
				
				sc.hasNextInt();	
			}		
			
			int number = sc.nextInt();
			sc.nextLine(); // handles next line skipping issue
		
			counter++;
			sum += number;
		}		
		System.out.println("The sum of 3 entered numbers was: " + sum);	
		
		sc.close();
	}
}
