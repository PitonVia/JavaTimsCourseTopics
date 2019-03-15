package collections.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
	
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<String> groceryList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		boolean quit = false;
		
		int choice = 0;
		
		printInstructions();
		
		while(!quit) {
			System.out.println("Enter your choice: ");
			
			while (!sc.hasNextInt()) {
				System.out.println("Invalid Number");
				System.out.println("Enter an integer");
				
				sc.nextLine(); // handles next line skipping issue
				
				sc.hasNextInt();	
			}		
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				printGroceryList();
				break;
			case 2:
				addGroceryItem();
				break;
			case 3:
				modifyGroceryItem();
				break;
			case 4:
				removeGroceryItem();
				break;
			case 5:
				findItem();
					break;
			case 6:
				copyArraylist();
				break;
			case 7:
				System.out.println("Quitting grocery list.\n");
				quit = true;
				break;			
			}
		}
		sc.close();
	}

	public static void addGroceryItem() {
		// Prompting user to enter grocery item to be added to ArrayList.
		System.out.println("Please add grocery item: ");
		String item = sc.nextLine();
		groceryList.add(item);
		if (groceryList.contains(item)) {
			System.out.println("Added " + item + " to the grocery list.\n");
		} else {
			System.out.println(item + " was not added to the grocery list.\n");
		}	
		//sc.nextLine();
	}
	
	public static void uselessMethod() {
		System.out.println("I'm never used");
	}
	
	public static void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " in your grocery list.");
		
		for (int i=0; i<groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	public static void modifyGroceryItem() {
		// Prompting user to enter grocery item # to replace it with another item
		System.out.println("Enter item mumber: ");
		int position = sc.nextInt()-1;
		sc.nextLine();
		System.out.println("Enter new item: ");
		String newItem = sc.nextLine();
		groceryList.set(position, newItem);
		System.out.println("Item " + (position+1) + " was changed to " + newItem + "\n");
	}
	
	public static void removeGroceryItem() {
		// Prompting user to enter grocery item # to be removed from the grocery list
		System.out.println("Enter item # to be removed: ");
		int position = sc.nextInt()-1;
		sc.nextLine();
		System.out.println("Removing " + groceryList.get(position) + " from the grocery list.\n");
		groceryList.remove(position);
	}
	
	public static void findItem() {
		// Prompting user to enter grocery item to be searched
		System.out.println("Enter item to be searched: ");
		String searchItem = sc.nextLine();
		
		int position = groceryList.indexOf(searchItem);
		if (position >=0) {
			System.out.println("Found " + groceryList.get(position));
		} else {
			System.out.println(searchItem + " is not in the list.");
		}			
	}
	
	// Creates a copy of the grocery list array using .addAll(ArrayList)
	private static void copyArraylist() {

		ArrayList<String> newArrayList = new ArrayList<>(groceryList);
		System.out.println("Created the newArrayList containing all the grocery list items:");
		System.out.println(newArrayList.toString());
	}
	
	private static void printInstructions() {
        System.out.println("Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To process ArrayList");
        System.out.println("\t 7 - To quit the application.\n");	
	}
}
