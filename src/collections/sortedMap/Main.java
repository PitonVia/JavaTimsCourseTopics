package collections.sortedMap;

public class Main {

	// declaring a static reference to the StockList class 
	private static StockList stockList = new StockList();
	
	public static void main(String[] args) {
		
		StockItem temp = new StockItem("bread", 0.86, 100);
		stockList.addStock(temp);
		
		temp = new StockItem("cake", 1.10, 7);
		stockList.addStock(temp);
		
		temp = new StockItem("car", 12.50, 2);
		stockList.addStock(temp);
		
		temp = new StockItem("chair", 62.0, 10);
		stockList.addStock(temp);
		
		temp = new StockItem("cup", 0.50, 200);
		stockList.addStock(temp);
		
		// Adding more cups to the stock
		temp = new StockItem("cup", 0.45, 7);
		stockList.addStock(temp);
		
		temp = new StockItem("door", 72.95, 4);
		stockList.addStock(temp);
		
		
		temp = new StockItem("juice", 2.50, 36);
		stockList.addStock(temp);
		
		temp = new StockItem("phone", 96.99, 35);
		stockList.addStock(temp);
		
		temp = new StockItem("towel", 2.4, 80);
		stockList.addStock(temp);
		
		temp = new StockItem("vase", 8.76, 40);
		stockList.addStock(temp);
		
		// print the items by calling overridden toString method of StockList
		System.out.println(stockList);
		
		System.out.println();
		
		// Prints all the StockItems in the same order as the toString method above
		for (String s : stockList.items().keySet()) {
			System.out.print(s + "   ");
		}
		System.out.println();
		
		// Now, we'll try to sell some items
		Basket timsBasket = new Basket("Tim");
		
		// calling static sellItem method inside the Main class
		sellItem(timsBasket, "car", 1);
		
		// Printing the contents of timsBasket by calling toString() method
		System.out.println(timsBasket);
		
		sellItem(timsBasket, "car", 1);

		// it should not be possible to sell the 3-rd car or spanner
		sellItem(timsBasket, "car", 1);
		sellItem(timsBasket, "spanner", 3);
		
		sellItem(timsBasket, "cup", 15);		
		sellItem(timsBasket, "chair", 6);
		System.out.println(timsBasket);
		
		System.out.println(stockList);
		
	}

	// Sells items
	public static int sellItem(Basket basket, String item, int quantity) {
		
		// retrieve an item from StockList
		StockItem stockItem = stockList.getItem(item);
		
		if (stockItem == null) {
			System.out.println("We don't sell" + item);
			return 0;
		}
		
		if (stockList.sellStock(item, quantity) != 0) {
			basket.addToBasket(stockItem, quantity);
			return quantity;
		}
		return 0;
	}
}
