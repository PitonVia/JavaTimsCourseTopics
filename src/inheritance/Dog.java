package inheritance;

public class Dog extends Animal {

	// Additional fields applicable to dogs
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	// when we extend Animal class, i.e. Dog inherits Animal, we must call the
	// constructor of the Animal class, i.e. superclass
	// Note how 'super' key word is used calling the superclass (Animal) constructor 
	// to initialize the base fields of any animal. 
	// We can also add additional fields applicable only to dogs. 
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {
		// We can remove 'brain and 'body' parameters from the parentheses above  
		// and assign default value of '1' to them as all animals have these.
		// The line of code containing 'super' has to be the 1-st line of code in the constructor!
		super(name, 1, 1, size, weight);
		// We also need to initialize all the additional fields for the Dog
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	// Method is called internally from eat()
	private void chew() {
		System.out.println("Dog chews");
	}
	
	// Inheritance makes it possible to override base methods of the superclass.
	// This makes it possible to use the base method's functionality in the overridden
	// method while adding unique functionality applicable to the child class.
	@Override
	public void eat() {
		System.out.println("Dog eats");
		chew();
		// When we override a method, the same method in the Super class is called
		super.eat(); 
	}
	
	public void walk() {
		System.out.println("Dog walks");
		// When we create a .move() method inside the Dog class, this method will be called. 
		// When we use 'super.move()' (like in the 'run' method), only the .move() from the 
		// superclass will be called! Note the difference when running walk() and run() from the Main.
		move(5); 
	}
	public void run() {
		System.out.println("Dog runs");
		super.move(10); // calling Animal.move(int Speed)
	}

	@Override
	public void move(int speed) {
		System.out.println("Dog moves at speed " + speed);
		//super.move(speed);
	}
	
	

	
	
	
	
	
}
