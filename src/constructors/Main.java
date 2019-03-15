package constructors;

public class Main {

	public static void main(String[] args) {
		
		// Works with the BankAccount class in the same package. 
		
		// Creating a new instance using parameterized constructor:
		BankAccount paramAccount = new BankAccount(12345, 0.00, "Tom", "tom@gmail.com", "127-1644");
		
		System.out.println(paramAccount.getEmail());
		
		// Creating a new instance using empty constructor:
		BankAccount account = new BankAccount();
		
		account.setAccountNumber(123456789);
		System.out.println(account.getAccountNumber());
		
		account.deposit(500);
		account.deposit(250);
		account.withdraw(300);
		account.withdraw(450);
		account.withdraw(1);

		// Note when an object was initialized using the 3-rd constructor, 
		// the 2-nd constructor with all the parameters was called as well!!!
		BankAccount thirdAccount = new BankAccount("Don", "don@email.com", "213-23223");
		
		System.out.println("Name is: " + thirdAccount.getName());
		
		System.out.println();
		System.out.println("*******");
		
		// Testing the VipCustomer class
		
		VipCustomer cust1 = new VipCustomer(); // using 1-st constructor
		System.out.println(cust1.getName() + "  " + cust1.getCreditLimit());
		System.out.println();
		
		VipCustomer cust2 = new VipCustomer("Joe", 5000.0); // using 2-nd constructor
		System.out.println(cust2.getName() + "  " + cust2.getCreditLimit());
		System.out.println();
		
		VipCustomer cust3 = new VipCustomer("Andy", 3000.0, "andy@hotmail.com"); // using 3-rd constructor
		System.out.println(cust3.getName() + "  " + cust3.getCreditLimit());
		
		
	}

}
