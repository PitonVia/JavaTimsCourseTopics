package collections.sortedMap;

import java.util.*;

public class Basket {
	
	private final String name;
	// The map holds StockItem as a Key and integer for the quantity of items as a value
	private final Map<StockItem, Integer> list;
	
	// constructor
	public Basket(String name) {
		this.name = name;
		this.list = new HashMap<>();
	}
	
	
	// Adding item to the basket list
	public int addToBasket(StockItem item, int quantity) {
		if ((item != null) && (quantity > 0)) {
			// check if we already have the item in the basket
			// Returns either the value for quantity to which the specified key is mapped, or defaultValue if this map does not have this item.
			int inBasket = list.getOrDefault(item, 0);
			// If the quantity of this item was already in the list, add it to the quantity passed in parameter when adding item to the list.
			list.put(item, inBasket + quantity);
			return inBasket;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		// we want to return a list of all items it contains
		
		String s = "\nShopping Basket " + name + " contains " + list.size() +  ((list.size() <=1) ? " item." : " items.") + "\n";
		double totalCost = 0.0;
		
		// Not how we are iterating through a map
		for (Map.Entry<StockItem, Integer> item : list.entrySet()) {

			s = s + item.getKey() + ". " + item.getValue() + " purchased.\n";
			
			totalCost += item.getKey().getPrice() * item.getValue();
		}
		return s + "Total cost " + totalCost;
	}
}
