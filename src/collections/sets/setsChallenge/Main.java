package collections.sets.setsChallenge;

import java.util.*;


public class Main {

	// Declaring a new map that will hold Strings as keys and HeavenlyBody objects as values:
	private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>(); 
	
	// Declaring a set for storing objects of HEavenly body class:
	private static Set<HeavenlyBody> planets = new HashSet<>();
	
	public static void main(String[] args) {
		
		HeavenlyBody temp = new Planet("Mercury", 88);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);
	
		temp = new Planet("Venus", 225);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);
		
		temp = new Planet("Earth", 365);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);
		
		HeavenlyBody tempMoon = new Moon("Moon", 27);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon); // Note that we are calling the addMoon to add a moon to temp=Earth
		
		temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new DwarfPlanet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);
	
        System.out.println();
        
        // Printing all the planets
        System.out.println("Planets");
        for (HeavenlyBody i : planets) {
            System.out.println(i);
        }
        
        System.out.println();

        // To print all moons of Jupiter:
        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Jupiter", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for (HeavenlyBody i : body.getSatellites()) {
            System.out.println(i);
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
        HeavenlyBody pluto = new Planet("Pluto", 842);
        planets.add(pluto);
        // Note that the new Pluto has not been added to the Set and did not get printed.
        System.out.println("Planets");
        for (HeavenlyBody i : planets) {
            System.out.println(i);
		}	
        
        // Test to verify symmetric equality - for symmetric equality both
        // print statements have to return 'true':
        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));

        System.out.println();

        // Removes mapping from the key
        solarSystem.put(pluto.getKey(),pluto);
        // Retrieves HeavenlyBody = 'pluto'
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));

        System.out.println();
        System.out.println("The solar system contains:");
        for (HeavenlyBody i : solarSystem.values()) {
            System.out.println(i);
        }

	}
}
