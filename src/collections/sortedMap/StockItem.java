package collections.sortedMap;

public class StockItem implements Comparable<StockItem> {

	private final String name;
	private double price;
	private int quantityStock = 0; // can be initialized later
	

	// Constructor 
	public StockItem(String name, double price) {
		this.name = name;
		this.price = price;
		// quantity can also be initialized here (but you would not initialize it both in the field and in the constructor)
		this.quantityStock = 0; 
	}
	
	// Overloading constructor - allowing to add the quantity of stock
	public StockItem(String name, double price, int quantityStock) {
		this.name = name;
		this.price = price;
		this.quantityStock = quantityStock;
	}

	// Method replacing a setter for quantity of stock 
	public void adjustStock(int quantityStock) {
		int newQuantity = this.quantityStock + quantityStock;
		if (newQuantity >= 0) {
			this.quantityStock = newQuantity;
		}	
	}
	
	// Custom setter for price to ensure it's > 0
	public void setPrice(double price) {
		if (price > 0.0) {
			this.price = price;
		}
	}
	
	// Overriding compareTo method part of Comparable interface
	@Override
	public int compareTo(StockItem o) {
		System.out.println("Entering StockItem.compareTo");
		// First, we are comparing if the passed item refers to the same object in memory
		if (this == o) {
			return 0;
		}
		if (o != null) {
			// Comparing the StockItem's name String to the one that is being passed as an argument
			// Return will be either 1-, 0 or 1 values
			return this.name.compareTo(o.getName());
		}
		throw new NullPointerException();
	}
	
	// Overriding toString
	@Override
	public String toString() {
		return this.name + " : price " + this.price; 
	}

	// We are overriding equals and hashCode so that we can safely use name field as a key in a map!
	@Override
	public boolean equals(Object obj) {
		System.out.println("Entering StockItem.equals");
		// First test if we are comparing to the same object in memory
		if (obj == this) {
			return true;
		}
		// If object is null or if it is a different class
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			return false;
		}
		// Now, we want to compare the name of current object against the name of the obj passed as a parameter
		String objName = ((StockItem) obj).getName();
		return this.name.equals(objName);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + 31;
	}
	
	// Generating getters 
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int quantityInStock() {
		return quantityStock;
	}
}
