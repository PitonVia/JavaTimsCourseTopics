package collections.lists.linkedListDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer("Tim", 54.96);
		
		Customer anotherCustomer = customer;
		
		anotherCustomer.setBalance(12.18);
		
		// If we print the balance of customer, it will be 12.18 since there is just 1 object and both 
		// customer and anotherCustomer are references for that 1 object. 
		System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
		System.out.println();
		
		// Here's an example of an ArrayList of integers
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(3);
		intList.add(4);
		
		for (int i=0; i<intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
		System.out.println();
		
		// adding int 2 at index = 1
		intList.add(1, 2);
		
		// Note that when we are adding a new element at index 1, the other existing elements need to be moved
		// and their indexes are incremented. This is not a big deal for a small list, but if we have a million
		// elements inside the ArrayList, then updating all the indexes would become a performance issue. 
		for (int i=0; i<intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
		System.out.println();
		
		// LinkedList is storing a link to the next item in the list as well as the actual data. 
		// When an item is added to the LinkedList, only two links for that new element are updated - 
		// the link to the new item and a new link needs to be created from the new item to the next one.
		// In the case of removing an element, only 1 link to that element needs to be re-pointed and the
		// other link from that element needs will remain only until garbage collector deletes the  
		
	}
}
