package oopMasterChallenge;

public class Hamburger {

	private double basePrice = 2.00;
	
	// 2 main ingredients:
	private String rollType;
	private String meatType;
	
	// 4 additions' prices :
	protected double lettucePrice = 0.50;
	protected double tomatoPrice = 0.80;
	protected double carrotPrice = 0.30;
	protected double onionPrice = 0.10;
	
	// Counting additions for total price calculation.
	protected int lettuceCount = 0;
	protected int tomatoCount = 0;
	protected int carrotCount = 0;
	protected int onionCount = 0;
	
	// Constructor
	public Hamburger(double price, String rollType, String meatType) {
		basePrice = price;
		this.rollType = rollType;
		this.meatType = meatType;
	}
	
	public void addLettuce() {
		System.out.println("Added 1 lettuce");
		lettuceCount++;	
	}
	
	public void addTomato() {
		System.out.println("Added 1 tomato");
		tomatoCount++;
	}
	
	public void addCarrot() {
		System.out.println("Added 1 carrot");
		carrotCount++;
	}
	
	public void addOnion() {
		System.out.println("Added 1 onion");
		onionCount++;
	}

	public void getBasePriceAndAdditions() {
		
		System.out.println("The base price of the " + this.getClass().getSimpleName() + " is " + basePrice);
		
		if (lettuceCount > 0) {
			System.out.println("Lettuce qty: " + lettuceCount + " @ $" + lettucePrice);
		}
		if (tomatoCount > 0) {
			System.out.println("Tomato qty: " + tomatoCount + " @ $" + tomatoPrice);
		}
		if (carrotCount > 0) {
			System.out.println("Carrot qty: " + carrotCount + " @ $" + carrotPrice);
		}
		if (onionCount > 0) {
			System.out.println("Onion qty: " + onionCount  + " @ $" + onionPrice);
		}	
	}
	
	protected double calcTotalPrice() {
		
		double totalPrice = basePrice + lettuceCount * lettucePrice + tomatoCount * tomatoPrice +
				carrotCount * carrotPrice + onionCount * onionPrice;
		
		return totalPrice;
	}
	
	protected double printReceipt() {
		
		double totalPrice = calcTotalPrice();
		
		// Tax details and sub-totals:
		double tax = 0.13;
		double taxAmount = totalPrice * tax;
		double grandTotalPrice = tax + totalPrice;
		
		System.out.print("The total price of the " + this.getClass().getSimpleName() + 
				" with " + this.meatType + " and on "+ this.rollType + " is: ");
		System.out.printf("%.2f", totalPrice);
		
		System.out.print("\n" + "The total tax amount is: ");
		System.out.printf("%.2f", taxAmount);
		
		System.out.print("\n" + "The Grand Total Price with Tax is: ");
		System.out.printf("%.2f", grandTotalPrice);
		System.out.println("\n");
		
		return totalPrice;
	}
}
