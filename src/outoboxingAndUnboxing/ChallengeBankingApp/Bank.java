package outoboxingAndUnboxing.ChallengeBankingApp;

import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<Branch> branches;
	
	
	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branch>();
	}
	
	// Add branch
	public boolean addBranch(String branchName) {
		
		if (findBranch(branchName) == null) {
			this.branches.add(new Branch(branchName));
			return true;
		}
		System.out.println("Branch " + branchName + " already exists.");
		return false;
	}
	
	
	// Add a customer with initial amount to an existing branch
	public boolean addCustomer(String branchName, String customerName, double initialAmount) {
		
		Branch existingBranch = findBranch(branchName);
		
		if (existingBranch != null) {
			existingBranch.addCustomer(customerName, initialAmount);
			return true;
		}
		System.out.println("Branch " + branchName + " does not exist!");
		return false;
	}
	
	// Add a transaction for existing customer in an existing branch:
	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		
		Branch existingBranch = findBranch(branchName);
		
		if (existingBranch != null) {
			existingBranch.addCustomerTransaction(customerName, amount);
			return true;
		}
		System.out.println("Branch " + branchName + " does not exist!");
		return false;
	}
	
	// Internal method to find if Branch already exists 
	private Branch findBranch(String branchName) {
		
		for (Branch b : branches) {
			if (b.getName().equals(branchName)) {
				//System.out.println("Found branch: " + branchName);
				return b;
			}
		}
		//System.out.println("Branch " + branchName + " already exists.");
		return null;
	}

	// Print customers and optionally (if showTransaction = true) print transactions for each customer:
	public boolean printCustomers(String branchName, boolean showTransactions)  {
				
		Branch existingBranch = findBranch(branchName);
		
		if (existingBranch != null) {
			ArrayList<Customer> customers = existingBranch.getCustomers();
			System.out.println("Printing customers for branch: " + branchName + "\n");
			
			for (Customer c : customers) {
				System.out.println("Customer " + customers.indexOf(c) + " --> " + c.getName());
				
				if (showTransactions) {
					ArrayList<Double> transactions = c.getTransactions();
					System.out.println("\nPrinting transactions for: " + c.getName() + "\n");
					
					for (Double d : transactions) {
						System.out.println("Transaction " + transactions.indexOf(d) + " --> " + d);
					}
				}	
			}	
			return true;
		}
		return false;
	}
	
		
	public String getName() {
		return name;
	}	
}
