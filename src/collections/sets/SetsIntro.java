package collections.sets;

import java.util.*;

public class SetsIntro {

	// Sets are unordered collections that can store unique elements only.
	// Everything that applies to keys in Map, also applies to a Set. 
	
	// Declaring a new map that will hold Strings as keys and HeavenlyBody objects as values:
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>(); 
	
	// Declaring a set for storing objects of HEavenly body class:
	private static Set<HeavenlyBody> planets = new HashSet<>();
	
	public static void main(String[] args) {
		
		HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
	
		temp = new HeavenlyBody("Venus", 225);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("Earth", 365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // Note that we are calling the addMoon to add a moon to temp=Earth
		
		temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
	
        // Printing all the planets
        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
        	System.out.println("\t" + planet.getName());
        }
        System.out.println();

        // To print all moons of Jupiter:
        HeavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody i : body.getSatellites()) {
            System.out.println("\t" + i.getName() + " : " + i.getOrbitalPeriod());
        }
        System.out.println();
        
        // So far we were able to print moons belonging to a specific planet, but at
        // the moment there is no collection representing all the available moons.

        // To print all moons union of all planets' moons can be generated.
        // A union of two or more sets is a Set containing all unique elements of the Sets.
        // addAll method can be used to generate union.
        
        // First, we will create a new HashSet for storing all the moons:
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody i : planets) {
            moons.addAll(i.getSatellites());
        }
        
        // Once all moons have been added to the 'moons' HashSet, we can print:
        System.out.println("All moons");
        for (HeavenlyBody i : moons) {
            System.out.println("\t" + i.getName() + " : " + i.getOrbitalPeriod());
        }
        System.out.println();
        
        // Adding another "Pluto" planet with a diff orbitalPeriod:
        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);
        // Note that the new Pluto has not been added to the Set and did not get printed.
        System.out.println("Planets");
        for (HeavenlyBody i : planets) {
            System.out.println("\t" + i.getName() + " : " + i.getOrbitalPeriod());
        }
	}
}
