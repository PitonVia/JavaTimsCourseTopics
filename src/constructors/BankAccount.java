package constructors;

public class BankAccount {

	private int accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;
	
	// This empty constructor will overwrite the default constructor.
	public BankAccount() {
		// Special case when we want to set default values when an object of the class is 
		// declared without any parameters. In this case the line of code starting with 
		// 'this' must be written as the 1-st line of the code inside the constructor.
		this(9999999,0.0,"default name", "default@email", "default phone");
		System.out.println("Empty constructor was called.");
	}
	
	// Overloading the empty constructor by creating the 2-nd constructor with all parameters.
	public BankAccount(int accountNumber, double balance, String name, String email, String phoneNumber) {
		System.out.println("Constructor with parameters was called.");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;		
	}

	// Auto-generating constructor using some of the parameters
	public BankAccount(String name, String email, String phoneNumber) {
		// Here we're setting default values for acc'tNum and balance only!
		// Since for the remaining 3 parameters values will be specified when object is initialized.
		// 'this' is calling the 2-nd constructor where all fields are initialized!!!
		this(9999999, 100.0, name, email, phoneNumber);
		// Also, we do not need the 3 lines of code below, since this constructor 
		// will actually call the 2-nd constructor (above), which already has this code!!!
		// It is called Constructor Chaining and helps reduce the duplication of code.
/*		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;*/
		
		// Constructor chaining is when other constructors are calling one constructor, which 
		// has all the field values initialized. This helps avoid code duplication.
		
	}

	// Method to deposit funds
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println(amount + " was deposited. New balance is: " + this.balance);
	}
	
	// Method to withdraw funds
	public void withdraw(double amount) {
		if (amount <= this.balance ) {
			this.balance -= amount;
			System.out.println(amount + " was withdrawn. New balance is: " + this.balance);
		} else {
			System.out.println("Withdrawal was not completed. Withdrawal amount exceeded the balance of " + this.balance);
		}
	}
	
	// Creating setters and setters for each field:
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail( ) {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

	
