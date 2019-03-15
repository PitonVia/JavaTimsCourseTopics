package abstractClasses;

public class Dog extends Animal {
	
	// Constructor
	public Dog(String name) {
		// Note how String name comes from the super Animal class
		super(name); 
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating");
	}

	@Override
	public void breath() {
		System.out.println(getName() + " is breathing");	
	}

}
