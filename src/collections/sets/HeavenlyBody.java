package collections.sets;

import java.util.*;

public final class HeavenlyBody {

	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;

	// Constructor
	public HeavenlyBody(String name, double orbitalPeriod) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	// Method for adding moons to the set 
	public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}
	
	// Overriding the Object's equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		// This code compares class of the object to an instance of its class:
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        // Because calling 'getClass()' method on a null object returns an exception,
        // we need to include the condition to check if the obj is null:
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        // We have decided that name should not be duplicated.
        // This is to ensure that obj won't have any duplicate names:
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
	}
	
	
	// In addition to overriding equals, all need to override hashCode():
    @Override
    public int hashCode() {
        System.out.println("hashCode called");
        // Adding number 57 to guarantee that '0' will not be returned for hashes:
        return this.name.hashCode() + 57;
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
	
}
