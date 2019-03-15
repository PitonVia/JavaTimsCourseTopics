package composition;

public class Blinds {
	
	private String colour;

	public Blinds(String colour) {
		this.colour = colour;
	}

	public void closeBlinds() {
		System.out.println("Closing the " + colour + " blinds");
	}
	
	public void openBlinds() {
		System.out.println("Opening the " + colour + " blinds");
	}
	
	public String getColour() {
		return colour;
	}
}
