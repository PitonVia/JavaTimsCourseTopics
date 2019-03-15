package encapsulation;

// There is the enhanced player class, which addresses all the 
// design issues of the Player class.

public class EnhancedPlayer {
 
	private String name;
	private int health = 100; // setting default value
	private String weapon;
	
	// Constructor initializing all the fields:
	public EnhancedPlayer(String name, int health, String weapon) {
		this.name = name;
		// Only a number >0 and <=100 can be assigned to health 
		if (health > 0 && health <= 100) {
			this.health = health;
		}	
		this.weapon = weapon;
	}

	// Reduces health of the EnhancedPlayer when damage occurs
	public void loseHealth(int damage) {
		this.health -= damage;
		if (this.health <= 0) {
			System.out.println("Player knocked out!");
		}		
	}
	
	// This time we will just create a getter to return amount of health
	public int getHealth() {
		return this.health;
	}	
}
