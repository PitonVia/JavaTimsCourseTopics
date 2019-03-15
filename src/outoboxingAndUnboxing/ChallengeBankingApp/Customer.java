package outoboxingAndUnboxing.ChallengeBankingApp;

import java.util.ArrayList;

public class Customer {

	private String name;
	private ArrayList<Double> transactions;
	
	
	public Customer(String name, double initialBalance) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
		// Customer has to be created with initial balance
		addTransaction(initialBalance);
	}

	// Add transactions
	public void addTransaction(double amount) {
		this.transactions.add(amount);
	}
	
	// Print transactions
	public void printTransactions() {
		for (Double d : transactions) {
			System.out.print(d + " ");
		}
	}
		
	public String getName() {
		return name;
	}
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
}
