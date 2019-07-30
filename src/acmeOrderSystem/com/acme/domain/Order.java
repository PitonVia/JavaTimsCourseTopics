package acmeOrderSystem.com.acme.domain;

import acmeOrderSystem.com.acme.utils.MyDate;

public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	public static double taxRate;
	
	static {
		taxRate = 0.05;
	}
	
	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate=d;
		orderAmount=amt;
		customer=c;
		product=p;
		quantity=q;
	}
	
	public Order(MyDate d, double amt, String c){
		this.orderDate=d;
		this.orderAmount=amt;
		this.customer=c;
		this.product= "Anvil";
		this.quantity= 1;
	}
	

	public static void setTaxRate(double newRate) {
		Order.taxRate = newRate;
	}
	
	public static void computeTaxOn(double amt) {
		System.out.println("The tax for " + amt + " is: " + amt * Order.taxRate);
	}
	
	public double computeTax() {
		System.out.println("The tax for this order is: " + this.orderAmount * Order.taxRate);
		return this.orderAmount * Order.taxRate;
	}
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}
