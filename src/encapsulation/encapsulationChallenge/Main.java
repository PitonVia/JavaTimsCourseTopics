package encapsulation.encapsulationChallenge;

public class Main {

	public static void main(String[] args) {

		Printer printer = new Printer(50);
		
		printer.fillUpToner(35);
		printer.getTonerLevel();
		System.out.println();
		
		printer.fillUpToner(20);
		printer.getTonerLevel();
		System.out.println();
		
		printer.print(501, true);
		printer.getTonerLevel();
		printer.getPagesPrinted();
		System.out.println();
		
		printer.print(101, true);
		printer.getTonerLevel();
		printer.getPagesPrinted();
		System.out.println();
		
		printer.print(399, true);
		printer.getTonerLevel();
		printer.getPagesPrinted();
		System.out.println();
		
	}
}
