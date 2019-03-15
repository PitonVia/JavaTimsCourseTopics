package scannerUserInput;

import java.util.Scanner;

public class ScannerDemo {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Using the Scanner class to get user input along with .nextLine() and .nextInt() methods.
		
		// This code validates user input for int and ensures correct years range 
		// and prints user name and calculated user's age.

		int yearOfBirth = 0;
			
		System.out.println("Enter your year of birth: ");
		
		// Using .hasNextInt() to validate if user's input is an integer:
		boolean isInt = sc.hasNextInt();
		
		while (!isInt) {
			
			System.out.println("Your input is invalid. Year of birth has to be an integer.");
			System.out.println("Please try entering your year of birth again: ");
			sc.nextLine(); // handles next line skipping issue
			
			isInt = sc.hasNextInt();	
		}
		
		// Scanner internally converts String input into an integer using 
		// Integer.parseToInt() method when we use .nextInt()
		yearOfBirth = sc.nextInt();
		
		// validating using input for the correct range of years
		while (yearOfBirth < 1900 || yearOfBirth > 2017 ) {
			
			sc.nextLine(); // handles next line skipping issue
			
			System.out.println("The year of birth you've entered is not in range.");
			System.out.println("Please enter your valid year of birth: ");
			yearOfBirth = sc.nextInt();		
		}
		
		sc.nextLine(); // handles next line skipping issue
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		int age = 2018 - yearOfBirth;
		
		System.out.println("Your name is: " + name + ", and you are " + age + " years old.\n");
		
//		sc.close(); // Not closing the scanner here, since will be executing another method using scanner
		
		// Calling the method below: 
		System.out.println(getIntLBYL());
	}
	
	// Scanner input with LBYL - Look Before You Leap 
	// The method below has a different way of ensuring that that user types in an Integer!
    private static int getIntLBYL() {

    	System.out.println("Please enter an integer");
        boolean isValid = true;
        String input = sc.next();
        for (int i=0; i<input.length(); i++) {
            // if any char of user input is NOT a digit
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            // since input passed validation, there should be no error converting it to int
        	sc.close();
            return Integer.parseInt(input);
        }
        sc.close();
        return 0;
    }
}
