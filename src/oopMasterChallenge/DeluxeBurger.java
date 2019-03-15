package oopMasterChallenge;

public class DeluxeBurger extends Hamburger {

	private double basePrice = 5.00;
	
	// 2 extra required additions:
	private double chips;
	private double drink;
	
	public DeluxeBurger(double price, String rollType, String meatType) {
		super(price, rollType, meatType);
		this.basePrice = price;
		this.chips = 1.20;
		this.drink = 0.50;
	}

	// We need to prevent possibility of adding 4 items from HamburgerClass
	@Override
	public void addLettuce() {
		System.out.println("Sorry, cannot add lettuce to the DeluxBurger!");
	}

	@Override
	public void addTomato() {
		System.out.println("Sorry, cannot add tomato to the DeluxBurger!");
	}

	@Override
	public void addCarrot() {
		System.out.println("Sorry, cannot add carrot to the DeluxBurger!");
	}

	@Override
	public void addOnion() {
		System.out.println("Sorry, cannot add onion to the DeluxBurger!");
	}
	
	
	@Override
	public void getBasePriceAndAdditions() {
		
		super.getBasePriceAndAdditions();
		
		System.out.print(this.getClass().getSimpleName() + " comes with: ");
		System.out.println("1 chips @ the price of $" + this.chips + " and 1 drink @ the price of $" + this.drink);		
	}

	@Override
	protected double calcTotalPrice() {
		
		double totalPrice = super.calcTotalPrice() + this.chips + this.drink;
		
		return totalPrice;
	}
	
	@Override
	public double printReceipt() {
		
		double totalPrice = super.printReceipt();

		return totalPrice;
	}
}
