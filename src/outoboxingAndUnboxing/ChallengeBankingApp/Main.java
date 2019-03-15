package outoboxingAndUnboxing.ChallengeBankingApp;

public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank("National bank");
		
		bank.addBranch("Adelaide");
		bank.addCustomer("Adelaide", "Tim", 50.05);
		bank.addCustomer("Adelaide", "Mike", 175.34);
		bank.addCustomer("Adelaide", "Percy", 220.12);
		
		bank.addBranch("Sydney");
		bank.addCustomer("Sydney", "Bob", 150.54);
		
		bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
		bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
		bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
		
		bank.printCustomers("Adelaide", true);
		
		// negative scenario: adding existing branch
		System.out.println();
		bank.addBranch("Sydney");
		
		
		// negative scenario: adding existing customer to branch
		System.out.println();
		bank.addCustomer("Adelaide", "Tim", 200.00);
		
		// negative scenario: adding transaction for not existing customer
		System.out.println();
		bank.addCustomerTransaction("Adelaide", "Adam", 44.22);

		
		
		
		

	}

}
