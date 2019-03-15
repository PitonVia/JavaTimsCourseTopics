package inheritance.inheritanceChallenge;

public class Outlander extends Car {

	private int yearMade;
	private String colour;
	
	// Auto-generating constructor with pre-defined values for all Car fields
	public Outlander(int yearMade, String colour) {
		super("Outlander", "4WD", 4, 5, 6, false);
		this.yearMade = yearMade;
		this.colour = colour;
	}
	
	// rate is a difference in speed from the currentSpeed
	public void accelerate(int rate) {
		
		int newVelocity = getCurrentVelocity() + rate;
		
		if (newVelocity == 0) {
			stop();
			changeGear(1);
		} 
		
		else if (newVelocity > 0 && newVelocity <= 10) {
			changeGear(1);
		} else if (newVelocity > 10 && newVelocity <= 20) {
			changeGear(2);
		} else if (newVelocity > 20 && newVelocity <= 30) {
			changeGear(3);
		} else if (newVelocity > 20 && newVelocity <= 30) {
			changeGear(3);
		} 
		
		else {
			changeGear(4);
		}
		
		if (newVelocity > 0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
	}
	
	// No getters and setters for the Outlander class.	
}
