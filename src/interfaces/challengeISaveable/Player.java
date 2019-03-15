package interfaces.challengeISaveable;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

	private String name;
	private int hitPoints;
	private int strength;
	private String weapon; 
	
	// Constructor
	public Player(String name, int hitPoints, int strength) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	@Override
	public List<String> write() {
		
		List<String> values = new ArrayList<>();
		
		// Adding the class fields to the List
		values.add(0, this.name);
		// Not the trick with using "" + to convert an int into String
		values.add(1, "" + this.hitPoints);
		// Here's another way to convert an int to String
		values.add(2, Integer.toString(this.strength));
		values.add(3, this.weapon);
		
		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		
		// If the list is not null and if it has at least one item
		if (savedValues != null  && savedValues.size() > 0) {
			this.name = savedValues.get(0);
			// We want to parse the String back to int
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
			this.weapon = savedValues.get(3);
		}
	}
	
	// Overriding toString() method
	@Override
	public String toString() {
		// 
		return String.class.getSimpleName() + " " + this.name + ", hitpoints=" + this.hitPoints + 
				", strength= " + this.strength + ", weapon= " + this.weapon;
	}

	// Auto-gen all getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
}
