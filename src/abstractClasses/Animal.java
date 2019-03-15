package abstractClasses;

// Declaring the Animal class as abstract:
public abstract class Animal {
	
	private String name;

	// Constructor
	public Animal(String name) {
		this.name = name;
	}
	
	// Declaring a couple of abstract methods that MUST be implemented by the subclasses.
	public abstract void eat();
	public abstract void breath();

	// Getter for the name
	public String getName() {
		return name;
	}
}
