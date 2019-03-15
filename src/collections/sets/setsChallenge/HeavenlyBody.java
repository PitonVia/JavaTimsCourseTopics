package collections.sets.setsChallenge;

import java.util.*;

public abstract class HeavenlyBody {

	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;
	// Key works with enum 
	private final BodyTypes bodyType;
	private final Key key;
	
    // Using 'enum' allows to group constants together to specify all possible BodyTypes parameters.
    // Using enum has 2 advantages:
    // 1. you get runtime error if bodyType is not specified correctly.
    // 2. it has a printing advantage when overriding toString() method.
    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

	// Constructor including the new field for bodyType
	public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
		this.bodyType = bodyType;
		this.key = new Key(name, bodyType);
	}

	// Method for adding a satellite to the set 
	public boolean addSatellite(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}
	
	// Overriding the Object's equals method
	@Override
	public final boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if (this.name.equals(theObject.getName())) {
            	return this.bodyType == theObject.getBodyType();
            }
        }
        return false;
	}
	
    // Need to return key object to do look up in the map
    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }
	
	// In addition to overriding equals, all need to override hashCode():
    @Override
    public int hashCode() {
        // Adding number 57 to guarantee that '0' will not be returned for hashes:
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }
    
    // enum makes it easy to print bodyType values, which need not be converted 
    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod; 
	}

	// Getters
	public String getName() {
		return name;
	}
	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites); // this code will not impact original satellites HashMap
	}
	// added a getter for the bodyType
	public BodyTypes getBodyType() {
		return bodyType;
	}
	// added a getter for the Key
	public Key getKey() {
		return key;
	}
	
	// Creating a static inner Key class for planet keys:
	public static final class Key {
		
		private String name;
		private BodyTypes bodyType;
		
		// Private Constructor
		private Key(String name, BodyTypes bodyType) {
			this.name = name;
			this.bodyType = bodyType;
		}

		@Override
		public boolean equals(Object obj) {
			Key key = (Key) obj;
			if (this.name.equals(key.getName())) {
				return (this.bodyType == key.getBodyType());
			}
			return false;
		}

		@Override
		public int hashCode() {
			return this.name.hashCode() + 57 + this.bodyType.hashCode();
		}

		// Getters
		public String getName() {
			return name;
		}
		public BodyTypes getBodyType() {
			return bodyType;
		}
	}
}
