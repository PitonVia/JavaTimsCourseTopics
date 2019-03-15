package collections.lists.arrayListChallengeMobilePhone;

import java.util.ArrayList;

public class MobilePhone {

	private ArrayList<Contact> contacts; 

	public MobilePhone() {
		this.contacts = new ArrayList<Contact>();
	}

	// Adds a new contact to the list
	public void addContact(String name, String phoneNumber) {		
		contacts.add(new Contact(name, phoneNumber));
		System.out.println("Added a new contact: " + name + " to the phone.\n");
	}
	
	// Prints the list of all contacts
	public void printListOfContacts() {	
		// If the list is empty, print message
		if (contacts.isEmpty()) {
			System.out.println("The contacts list is empty!");
		}

		for (int i=0; i<contacts.size(); i++) {	
			System.out.println("Contact # " + (i+1) + " is " + contacts.get(i).getName() + " - " + contacts.get(i).getPhoneNumber());
		}
		System.out.println();
	}
	
	// Find if a contact is in the list by "name"
	public boolean findContactByName(String name) {
		
		for (Contact c : contacts) {
			if (c.getName().equals(name)) {
				System.out.println("Found " + name + " in the contact list.\n");
				return true;
			} 
		} 
		System.out.println(name + " was not found in the contact list!\n");
		return false;	
	}
	
	// Find if a contact is in the list by "name" and return its Index
	private int findContactByNameInternal(String name) {
		
		int index = 0;
		
		for (Contact c : contacts) {
			if (c.getName().equals(name)) {
				index = contacts.indexOf(c);
				return index;
			} 
		} 
		return -1;
	}	
	
	// Remove a contact by "name"
	public void removeContactByName(String name) {
		
		if (findContactByNameInternal(name) >= 0) {
			System.out.println("Removing " + name + " from the contact list.\n");
			contacts.remove(findContactByNameInternal(name));
		} else {
			System.out.println(name + " was not found in the contact list!.\n");
		}	
	}
	
	// Update a contact by "name"
	public void updateContactByName(String existingName, String newName, String newPhoneNumber) {
		
		if (findContactByNameInternal(existingName) < 0) {
			System.out.println(existingName + " was not found in the contact list!.\n");
		} else {
			// .set() takes index of existing contact and a new instance of the Contact class
			contacts.set(findContactByNameInternal(existingName), new Contact(newName, newPhoneNumber));
			System.out.println("Updated " + existingName + " to " + newName + "\n");
		}
	}
}
