package inheritance;

public class Fish extends Animal {

	private int gills;
	private int eyes;
	private int fins;
	
	// Auto-generated constructor with all the base class fields + fish fields
	public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
		// 'super' calls the constructor of the parent class to initialize inherited base fields
		// The line of code containing 'super' has to be the 1-st line of code in the constructor!
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	// Method is called internally from swim()
	private void moveMuscles() {
		
	}
	
	// Method is called internally from swim()
	private void moveBackFin() {
			
		}
	
	private void swim(int speed) {
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}
		
	
}
