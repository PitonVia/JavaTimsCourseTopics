package constructors;

public class VipCustomer {

	private String name;
	private double creditLimit;
	private String email;
	
	// Empty constructor with all default values
	public VipCustomer() {
		this("default name", 1000.00, "default@email");
	}
	
	// 2-nd constructor passes 2 values with default value for 'email'
	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "default@email");
	}
	
	// 3-rd constructor 
	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	// Generating getters for all the fields:
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
}
