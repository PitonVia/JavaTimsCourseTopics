package composition;

public class Window {

	private String shape;
	private Blinds blinds;
	public Window(String shape, Blinds blinds) {
		super();
		this.shape = shape;
		this.blinds = blinds;
	}
	
	public void lookOutsideTheWindow() {
		blinds.openBlinds();
		System.out.println("Looking to the sun from the window.");
	}
	
	public String getShape() {
		return shape;
	}
	public Blinds getBlinds() {
		return blinds;
	}	
}
