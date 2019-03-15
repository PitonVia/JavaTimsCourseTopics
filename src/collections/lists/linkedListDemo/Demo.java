package collections.lists.linkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		LinkedList<String> placesToVisit = new LinkedList<String>();
		
/*		// Adding entries to the LinkedList
		placesToVisit.add("Sydney");
		placesToVisit.add("Melbourne");
		placesToVisit.add("Brisbane");
		placesToVisit.add("Perth");
		placesToVisit.add("Canberra");
		placesToVisit.add("Adelaide");
		placesToVisit.add("Darwin");
		
		placesToVisit.add(1, "Alice Springs");
		
		placesToVisit.remove(4); // removed "Perth"  */
		
		// LinkedList is great when multiple items need to be added or removed from the list
		// and in cases where items need to be sorted in a specific order.
		
		// Calling method to add entries to the LinkedList in alphabetical order
		addInOrder(placesToVisit, "Sydney");
		addInOrder(placesToVisit, "Melbourne");
		addInOrder(placesToVisit, "Brisbane");
		addInOrder(placesToVisit, "Perth");
		addInOrder(placesToVisit, "Canberra");
		addInOrder(placesToVisit, "Adelaide");
		addInOrder(placesToVisit, "Darwin");
		addInOrder(placesToVisit, "Alice Springs");
		addInOrder(placesToVisit, "Darwin"); // check that duplicates are not allowed
		
		printList(placesToVisit);
		
		// Calling the visit method:
		visit(placesToVisit);
		
	}
	
	// Prints the LinkedList elements using Iterator
	private static void printList(LinkedList<String> linkedList) {

		// Using the Iterator to go through List elements one by one
		Iterator<String> i = linkedList.iterator();

		// As long as the next record exists,
		while (i.hasNext()) {
			// go to the next item.
			System.out.println("Now visiting " + i.next());
		}
		System.out.println("==========================");	
	}
	
	// Compares any new item added to the LinkedList against existing items and modifies the LinkedList 
	// so that a new item is placed in correct position in alphabetical/lexicographical order
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		
		// Here we will use the ListIterator as we are dealing with the LinkedList.
		// ListIterator has these additional methods that allow to go back: hasPrevious() and previous() 
		ListIterator<String> listIter = linkedList.listIterator();
		
		while (listIter.hasNext()) {
			// compareTo() is used for lexicographical comparison of 2 strings
			int comparison = listIter.next().compareTo(newCity);
			// If they are equal, then the item already in the List so do not add
			if (comparison == 0) {
				System.out.println(newCity + " is already included as a destination.");
				return false;
			// newCity should appear before the item it was compared to 
			} else if (comparison > 0) {
				listIter.previous();
				listIter.add(newCity);
				return true;
			// move on to next item to compare as the newCity does not come before the item it was compared to
			} else if (comparison < 0) {
				// nothing to do here
			}		
		}
		// If we went through all the items and did not add the newCity, then it must be the last item
		// that we have to add to the end of the list.
		listIter.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList cities) {
		Scanner sc = new Scanner(System.in);
		
		boolean quit = false; // will set it to true when we want to exit
		// Since ListIterator is between the items and we cannot switch its direction immediately without  
		// passing an item, we have to track the direction of iterating through the LinkedList:
		boolean goingForward = false; 
		
		ListIterator<String> iter = cities.listIterator();
		
		// note use of the isEmpty() to check if the LinkedList is empty
		if (cities.isEmpty()) {
			System.out.println("No cities in the itinerary");
			// Note that 'return;' here is used in a void method  to branch out of a control flow block and exit the method!!!
			return;
		} else {
			System.out.println("Now visiting: " + iter.next());
			printMenu();
		}
		
		while (!quit) {
			int action = sc.nextInt();
			sc.nextLine();
			switch(action) {
			case 0:
				System.out.println("Vacation is over.");
				quit = true;
				break;
			case 1:
				if (iter.hasNext() && (goingForward == true)) {
					System.out.println("Now visiting: " + iter.next());
					goingForward = true;
				} else if (iter.hasNext() && (goingForward == false)) {
					iter.next();
					System.out.println("Now visiting: " + iter.next());
					goingForward = true;
				} else {
					System.out.println("Reached the end of the list.");
				}
				break;
			case 2:
				if (iter.hasPrevious() && (goingForward == false)) {
					System.out.println("Now visiting: " + iter.previous());
					goingForward = false;
				} else if (iter.hasPrevious() && (goingForward == true)) {
					iter.previous();
					System.out.println("Now visiting: " + iter.previous());
					goingForward = false;
				} else {
					System.out.println("We are at the start of the list.");
				}
				break;
			case 3:
				printMenu();
				break;
				
			}
		}
		
	}

	private static void printMenu() {
		System.out.println("Available actions:\npress " );
		System.out.println("0 - to quit\n" + 
						"1 - go to next city\n" + 
						"2 - go to previous city\n" + 
						"3 - print the actions menu\n");
		
	}


}
