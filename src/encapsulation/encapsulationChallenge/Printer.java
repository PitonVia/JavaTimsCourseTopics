package encapsulation.encapsulationChallenge;

public class Printer {

	private static int pagesPrinted = 0;
	private int tonerLevel = 100;
	private boolean duplex = true;
	
	
	// Constructor ensures that toner level cannot exceed 100%
	public Printer(int tonerLevel) {
		if (tonerLevel >=0 && tonerLevel <=100) {
			this.tonerLevel = tonerLevel;
		}
	}

	// Method to fill up the tonerLevel up to 100%
	public void fillUpToner(int tonerAmount) {
		
		if (tonerAmount <= 0) {
			System.out.println("The new toner is empty");
		} 
		else if (this.tonerLevel + tonerAmount >= 100) {
			System.out.println("The toner is filled up to the max - 100%");
			this.tonerLevel = 100;
		}
		else {
			this.tonerLevel += tonerAmount;
			System.out.println("Adding " + tonerAmount + "% to the toner lever");
		}	
	}
	
	// Method to print pages
	public void print(int pages, boolean duplex) {
		
		if (this.tonerLevel - pages/10 > 0) {
			
			if (duplex) {
				pagesPrinted += pages/2 + pages%2;
				System.out.println("Printed with duplex " + pages + " pages");
			} else {
				pagesPrinted += pages;
				System.out.println("Printed on single pages " + pages + " pages");	
			}
		
			// for each 10 pages, the tonerLevel goes down by 1%.
			this.tonerLevel -= pages/10;	
			
		} else {
			System.out.println("There is not enough ink in the toner to print this job.");
			System.out.println("Please fill up the toner.");
		}		
	}
	
	// Generating getters for pagesPrinted and tonerLevel
	public static void getPagesPrinted() {
		System.out.println("Total pages printed= " + pagesPrinted);		
	}
	public void getTonerLevel() {
		System.out.println("The toner level= " + tonerLevel);	
	}
}
