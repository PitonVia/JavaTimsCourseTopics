package collections.sortedMap;

import java.util.*;

public class StockList {

	private final Map<String, StockItem> list;

	// Constructor
	public StockList() {
		this.list = new LinkedHashMap<>();
	}
	
	// Add items to the list
	public int addStock(StockItem item) {
		if (item != null) {
			// Checking if we already have stock quantities of this item
			StockItem inStock = list.get(item.getName());
			// if there are already stocks of this item, adjust the quantity
			if (inStock != null) {
				item.adjustStock(inStock.quantityInStock());
			}
			// If there was no stocks of this item, then add it to the list from the item argument
			list.put(item.getName(), item);
			return item.quantityInStock();
		}
		return 0;
	}
	
	// Sell items
	public int sellStock(String item, int quantity) {
		
		// getOrDefault(Object key, V defaultValue)
		// Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
		StockItem inStock = list.getOrDefault(item, null);
		
		// if item is in the list and its stock quantity >= quantity passed in parameter and passed quantity > 0
		if ((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)) {
			// then, we will reduce the stock quantity by passing a negative quantity from the argument
			inStock.adjustStock(-quantity);
			// return the quantity we are taking out of stock
			return quantity;
		}
		// else, return 0 to indicate that nothing was taken from the stock
		System.out.println("Could not sell " + quantity + " " + item + "s.");
		return 0;
	}
	
	// Creating a custom getter method for the StockItem item by key 
	public StockItem getItem(String key) {
		return list.get(key);
	}
	
	// Getter for an unmodifiable (read-only) map of StockList items
	public Map<String, StockItem> items() {
		return Collections.unmodifiableMap(list);
	}
	
	// Creating a custom getter method for the list of items
	public Map<String, StockItem> getListOfItems() {
		// returning a read-only map that cannot be modified
		return Collections.unmodifiableMap(list);
	}

	@Override
	public String toString() {
		// we want to return a list of all items it contains
		
		String s = "\nStock List\n";
		double totalCost = 0.0;
		
		// Not how we are iterating through a map
		for (Map.Entry<String, StockItem> item : list.entrySet()) {
			
			// Calls overridden toString method of the StockItem class
			StockItem stockItem = item.getValue();
			
			double itemValue = stockItem.getPrice() * stockItem.quantityInStock();
			
			s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
			s = s + String.format("%.2f", itemValue) + "\n";
		
			totalCost += itemValue;
		}
		return s + "Total stock value " + String.format("%.2f", totalCost);
	}
}
