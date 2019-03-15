package oopMasterChallenge;

public class Main {

	public static void main(String[] args) {

		Hamburger burger = new Hamburger(2.0, "white roll", "beef");
		
		burger.addCarrot();
		burger.addLettuce();
		burger.addLettuce();
		burger.addTomato();
		burger.addOnion();
		
		burger.getBasePriceAndAdditions();
		burger.printReceipt();

		
		HealthyBurger hBurger = new HealthyBurger(4.0, "chicken");
		
		hBurger.addTomato();
		hBurger.addCarrot();
		hBurger.addOnion();
		hBurger.addLettuce();
		hBurger.addAvocado();
		hBurger.addAvocado();
		hBurger.addPickle();
		
		hBurger.getBasePriceAndAdditions();
		hBurger.printReceipt();
			
		
		DeluxeBurger dBurger = new DeluxeBurger(10.0, "premium bun", "lamb & veal");
		
		dBurger.addTomato();
		dBurger.addOnion();
		dBurger.addCarrot();

		dBurger.getBasePriceAndAdditions();
		
		dBurger.printReceipt();

	}
}
