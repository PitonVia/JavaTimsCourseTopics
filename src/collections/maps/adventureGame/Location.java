package collections.maps.adventureGame;

import java.util.*;

public class Location {

	private final int locationID;
	private final String description;
	private final Map<String, Integer> exits;
	

	// Constructor
	public Location(int locationID, String description) {
		this.locationID = locationID;
		this.description = description;
		this.exits = new HashMap<String, Integer>();
		// key "Q" for location 0 or quitting will be initialized with the constructor, since
		// it is used for any location and it prevents duplicated code
		this.exits.put("Q", 0); 
	}

	// Adds direction and location to the exits HashMap
	public void addExit(String direction, int location) {	
		exits.put(direction, location);
	}

	// Getters for all fields
	public int getLocationID() {
		return locationID;
	}
	public String getDescription() {
		return description;
	}
	// Modified getter - instead of returning exits, we are creating a new HashMap of exits.
	// This ensures that nothing outside of Location class can change our exits HashMap 
	// (i.e. from the interface it will only be possible to modify a copy of exits)  
	// This is an example of the defensive programming technique - anything that does not need 
	// to be exposed to the outside of the class, is not exposed. 
	public Map<String, Integer> getExits() {
//		return exits;
		return new HashMap<String, Integer>(exits);
	}
}
