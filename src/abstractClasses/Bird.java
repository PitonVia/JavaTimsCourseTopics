package abstractClasses;

// We want to make Bird an abstract class to add an abstract fly() method
public abstract class Bird extends Animal implements CanFly {

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is pecking");
	}

	@Override
	public void breath() {
		System.out.println(getName() + " is breathing");	
	}

	// Overriding the fly() method from the CanFly interface
	@Override
	public void fly() {
		System.out.println(getName() + " is flying");
		
	}
	
}
