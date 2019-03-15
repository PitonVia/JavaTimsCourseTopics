package outoboxingAndUnboxing.ChallengeBankingApp;

import java.util.ArrayList;

public class Branch {

	private String name;
	private ArrayList<Customer> customers;
	
	// Constructor
	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<Customer>();
	}
	
	// Returns boolean since we want to check if customer already exists
	public boolean addCustomer(String customerName, double initialAmount) {
		
		if (findCustomer(customerName) == null) {
			this.customers.add(new Customer(customerName, initialAmount));
			return true;
		}
		System.out.println("Customer " + customerName + " already exists.");
		return false;
	}
	
	// Adds transaction
	public boolean addCustomerTransaction(String customerName, double amount) {
		
		Customer existingCustomer = findCustomer(customerName);
		
		if (existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true;
		}
		System.out.println("Customer " + customerName + " does not exist for branch " + this.name);
		return false;	
	}
	
	// Internal method to find if customer exists for the branch
	private Customer findCustomer(String customerName) {
		
		for (Customer c : customers) {
			if (c.getName().equals(customerName)) {
				//System.out.println("Found customer: " + customerName);
				return c;
			}
		}
		
		return null;
	}
	
	public void printCustomers() {
		for (int i=0; i<customers.size(); i++) {
			System.out.println((i+1) + " " + customers.get(i).getName());
		}
	}
	
	public void printCustomerTransactions(String customerName) {
		
		Customer existingCustomer = findCustomer(customerName);
		
		existingCustomer.printTransactions();
	}

	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public String getName() {
		return name;
	}
}
