package inheritance.inheritanceChallenge;

public class Vehicle {

	private String name;
	private String size;
	
	private int currentVelocity;
	private int currentDirection;
	
	// Constructor with pre-defined values for currentVelocity and currentDirection
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		// For new instances these values will be 0 by default
		this.currentVelocity = 0; 
		this.currentDirection = 0;
	}

	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle.steer() is steering at " + direction + " degrees.");
	}
	
	public void move(int velocity, int direction) {
		this.currentVelocity = velocity;
		this.currentDirection = direction;
		System.out.println("Vehicle.move() is moving at " + currentVelocity + " in direction " + currentDirection);
	}
	
	public void stop() {
		this.currentVelocity = 0;
		System.out.println("Vehicle.stop() is stopping. ");
	}
	
	// Auto-generated getters & setters for all fields
	public void changingGear(int gear) {
		System.out.println("Vehicle is changing gear to " + gear);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}
	public int getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}	
}
