package encapsulation;

public class Player {
	
/*  There are a number of issues with the design of this class:
 * 
 *  a) All the fields have public access modifiers
 *  b) There is no constructor to initialize the filed values (i.e. default constructor only)
 *  
 *  These issues will cause the following problems down the road:
 *  
 *  1.) The health integer can be set to any value from the Main class. 
 *  2.) There is no constructor and fields have to be initialized outside the class
 *		so if we change any field variable name, further changes will be required for
 *		other classes that call these fields. 
 *	3.) We may actually forget to initialize these field values from other classes. */
 
	
	// Note we are making the fields public
	public String name;
	public int health;
	public String weapon;
	
	// There is no constructor to initialize the values above. 
	// Default constructor will be used and values can be initialized
	// manually from the Main class, since all the fields are public.
	
	// Reduces health of Player when damage occurs
	public void loseHealth(int damage) {
		this.health -= damage;
		if (this.health <= 0) {
			System.out.println("Player knocked out!");
		}		
	}
	
	// Returns amount of health
	public int healthRemaining() {
		return this.health;
	}	
}
