package collections.lists.arrayListChallengeMobilePhone;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static MobilePhone mPhone = new MobilePhone();

	public static void main(String[] args) {

		/*
		 * mPhone.addContact("Bob", "123456"); mPhone.addContact("Jane","543210");
		 * mPhone.addContact("Doug","333777");
		 * 
		 * mPhone.findContactByName("Bob"); mPhone.findContactByName("Doug");
		 */

		printOptionsMenu();

		int choice = 0;
		boolean running = true;

		while (running) {

			System.out.println("Enter your selection: ");

			while (!sc.hasNextInt()) {
				System.out.println("Please enter a number for your selection.");

				sc.nextLine();
				sc.hasNextInt();
			}

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 0:
				printOptionsMenu();
				break;
			case 1:
				printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				findContact();
				break;
			case 6:
				System.out.println("Quitting the mobile phone.");
				running = false;
			default:
				System.out.println("Please enter a number from 0 to 6.");			
			}
		}
	}

	// Case 3 - updating contact by proving existing name, new name and new phone #
	private static void updateContact() {
		System.out.print("Enter existing name that needs to be updated: ");
		String existingName = sc.nextLine();
		
		// if existingName is actually on the list
		if (mPhone.findContactByName(existingName)) {
			System.out.print("Enter a new name: ");
			String newName = sc.nextLine();	
			System.out.print("Enter phone number: ");
			String newPhoneNumber = sc.nextLine();
			mPhone.updateContactByName(existingName, newName, newPhoneNumber);
		}	
	}

	// Case 4 - remove a contact
	private static void removeContact() {
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		mPhone.removeContactByName(name);
	}

	// Case 5 - find a contact
	private static void findContact() {
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		mPhone.findContactByName(name);
	}

	// Case 2 - add a new contact
	private static void addNewContact() {
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter phone number: ");
		String phoneNumber = sc.nextLine();

		mPhone.addContact(name, phoneNumber);
	}

	// Case 1 - print list of contacts
	public static void printContacts() {
		mPhone.printListOfContacts();
	}

	// Case 0 - print menu options
	public static void printOptionsMenu() {
		System.out.println("Welcome to the mobile phone program! \n");
		System.out.println("Press 0: to prints the menu of available options.");
		System.out.println("Press 1: to print the list of contacts");
		System.out.println("Press 2: to add a new contact to the phone");
		System.out.println("Press 3: to update an existing contact");
		System.out.println("Press 4: to remove a contact from the phone");
		System.out.println("Press 5: to find a contact in the phone");
		System.out.println("Press 6: to exit the mobile phone");
		System.out.println();
	}

}
