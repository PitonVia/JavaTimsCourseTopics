package oopMasterChallenge;

public class HealthyBurger extends Hamburger {

	private double basePrice = 3.00;
	
	// 2 extra additions:
	private double avocadoPrice = 0.90;
	private double picklePrice = 0.70;
	
	// Counting extra additions for total price calculation.
	private int avocadoCount = 0;
	private int pickleCount = 0;
	
	// Constructor
	public HealthyBurger(double price, String meatType) {
		super(price, "brown rye roll", meatType);
		this.basePrice = price;		
	}

	public void addAvocado() {
		avocadoCount++;	
	}
	
	public void addPickle() {
		pickleCount++;
	}

	@Override
	public void addLettuce() {
		super.addLettuce();
	}

	@Override
	public void addTomato() {
		super.addTomato();
	}

	@Override
	public void addCarrot() {
		super.addCarrot();
	}

	@Override
	public void addOnion() {
		super.addOnion();
	}
	
	@Override
	public void getBasePriceAndAdditions() {
		
		super.getBasePriceAndAdditions();
		
		if (avocadoCount > 0) {
			System.out.println("Avocado qty: " + avocadoCount + " @ $" + avocadoPrice);
		}
		if (pickleCount > 0) {
			System.out.println("Pickle qty: " + pickleCount + " @ $" + picklePrice);
		}	
	}

	@Override
	protected double calcTotalPrice() {
		
		double totalPrice = super.calcTotalPrice() + this.avocadoCount * this.avocadoPrice + this.pickleCount * this.picklePrice;
		
		return totalPrice;
	}

	@Override
	protected double printReceipt() { 

		double totalPrice = super.printReceipt();

		return totalPrice;
	}
}
