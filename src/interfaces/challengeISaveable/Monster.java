package interfaces.challengeISaveable;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
	
	private String name;
	private int hitPoints;
	private int strength;
	
	public Monster(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}


	@Override
	public List<String> write() {

		List<String> values = new ArrayList<>();
		
		// Adding the class fields to the List
		values.add(0, this.name);
		// Not the trick with using "" + to convert an int into String
		values.add(1, "" + this.hitPoints);
		// Here's another way to convert an int to String
		values.add(2, String.valueOf(this.strength));
		
		return values;
	}

	@Override
	public void read(List<String> savedValues) {

		if (savedValues != null  && savedValues.size() > 0) {
			this.name = savedValues.get(0);
			// We want to parse the String back to int
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
		}	
	}
	
	@Override
	public String toString() {
		return  String.class.getSimpleName() + " " + this.name + ", hitpoints= " + 
				this.hitPoints + ", strength= " + this.strength;
	}

	// Getters
	public String getName() {
		return name;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public int getStrength() {
		return strength;
	}
}
