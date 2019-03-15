package composition;

public class Room {

	private String name;
	private Window window;
	private TV tv;
	
	public Room(String name, Window window, TV tv) {
		this.name = name;
		this.window = window;
		this.tv = tv;
	}
	
	public void checkOutside() {
		System.out.println("Inside the room. Coming to the window.");
		// We are calling the instance of the Window class directly to access
		// the lookOutsideTheWindow() method inside that class
		window.lookOutsideTheWindow();
	}
	
	public void watchTV() {
		System.out.println("Finding that remote control inside the room!");
		// We are using a public getter to access a method inside the TV class
		getTV().watchShow();
	}
	// private getter for the .watchTV() above
	private TV getTV() {
		return tv;
	}
	// public getter to access TV class method from Main
	public TV getTv() {
		return tv;
	}
}
