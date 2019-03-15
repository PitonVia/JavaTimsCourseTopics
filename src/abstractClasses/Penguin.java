package abstractClasses;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
	}

	// For the Penguin class it makes sense to override the fly() method,
	// since penguins cannot fly.
	@Override
	public void fly() {
		System.out.println(getName() + " cannot fly");
	}
}
