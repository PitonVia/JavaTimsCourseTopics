package inheritance.inheritanceChallenge;

public class Car extends Vehicle {

	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currentGear;

	// Constructor with pre-defined value for currentGears
	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		// For new instances the gear will be set to 1.
		this.currentGear = 1;
	}
	
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.changeCurrentGear() changing to " + this.currentGear + " gear.");
	}
	
	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity() velocity " + speed + " direction " + direction);
		move(speed, direction);
		
	// No getters and setters for the Car class.	
	}	
}
