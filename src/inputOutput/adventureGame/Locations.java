package inputOutput.adventureGame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

// Note that the class implements Map interface!
// We will have to implement all the Map's methods that will be overriden. 
// Once implemented, this class behaves like a map, but we can customize it to load its contents from an external source!

public class Locations implements Map<Integer, Location> {

	// Declaring a field for the Map implemented as a HashMap
	private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

	// Creating a static Main method inside the class to access a file:
	public static void main(String[] args) throws IOException {

		// Creating a try with resources - this ensures that resources will be closed.
		// Creating a new instance of FileWriter passing the path + file name into
		// constructor.
		try (BufferedWriter locFile = new BufferedWriter(new FileWriter("src/inputOutput/adventureGame/locations.txt"));
			BufferedWriter dirFile = new BufferedWriter(new FileWriter("src/inputOutput/adventureGame/directions.txt"))) {

			for (Location location : locations.values()) {
				// Writing to the file Strings containing location ids and descriptions
				locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");

				// Creating a nested loop to write all the directions for locations
				for (String direction : location.getExits().keySet()) {
					if (!direction.equalsIgnoreCase("Q")) {
						dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction)	+ "\n");
					}
				}
			}
		}

		// Another older way to write the code above, but only for 1 file: locations.txt
		/*
		 * FileWriter locFile = null; // good to set it to null first, to allow checking
		 * that it is != null before closing it.
		 * 
		 * try { // Creating a new instance of FileWriter passing the path + file name
		 * into constructor // Note how we are creating a new file inside the right
		 * package locFile = new
		 * FileWriter("src/inputOutput/adventureGame/locations.txt");
		 * 
		 * for (Location location : locations.values()) { // Writing to the file Strings
		 * containing location ids and descriptions
		 * locFile.write(location.getLocationID() + ", " + location.getDescription() +
		 * "\n"); // Useful method to throw your own exceptions to test catch and
		 * finally blocks: // throw new
		 * IOException("testing IOException handling while writing code. To be removed before production!!!"
		 * ); } } finally { System.out.println("In finally block"); if (locFile != null)
		 * { // very useful check as file might not have been opened
		 * System.out.println("Attempting to close the file"); locFile.close(); //
		 * always remember to close resources when working with IO! } }
		 */
	}

	// Creating a static initialization block to load the map with the 5 first
	// items:
	static {

		// We want to read locations and directions from files
		try (Scanner scanner = new Scanner(new BufferedReader (new FileReader("src/inputOutput/adventureGame/locations_big.txt")))) {
			scanner.useDelimiter(",");
			while (scanner.hasNextLine()) {
				int loc = scanner.nextInt();
				scanner.skip(scanner.delimiter());
				String description = scanner.nextLine();
				System.out.println("Imported loc: " + loc + ": " + description);
				Map<String, Integer> tempExit = new HashMap<>();
				locations.put(loc, new Location(loc, description, tempExit));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 

		// Now read the exits
		try (BufferedReader dirFile = new BufferedReader(new FileReader("src/inputOutput/adventureGame/directions_big.txt"))) {
			String input;
			while ((input = dirFile.readLine()) != null) {

				String[] data = input.split(",");
				int loc = Integer.parseInt(data[0]);
				String direction = data[1];
				int destination = Integer.parseInt(data[2]);
				
				System.out.println(loc + ": " + direction + ": " + destination);
				Location location = locations.get(loc);
				location.addExit(direction, destination);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// This code was manually loading the Map with location and directions, without
		// using files.
		/*
		 * Map<String, Integer> tempExit = new HashMap<String, Integer>();
		 * locations.put(0, new Location(0,
		 * "You are sitting in front of a computer learning Java",null));
		 * 
		 * tempExit = new HashMap<String, Integer>(); tempExit.put("W", 2);
		 * tempExit.put("E", 3); tempExit.put("S", 4); tempExit.put("N", 5);
		 * locations.put(1, new Location(1,
		 * "You are standing at the end of a road before a small brick building"
		 * ,tempExit));
		 * 
		 * tempExit = new HashMap<String, Integer>(); tempExit.put("N", 5);
		 * locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
		 * 
		 * tempExit = new HashMap<String, Integer>(); tempExit.put("W", 1);
		 * locations.put(3, new Location(3,
		 * "You are inside a building, a well house for a small spring",tempExit));
		 * 
		 * tempExit = new HashMap<String, Integer>(); tempExit.put("N", 1);
		 * tempExit.put("W", 2); locations.put(4, new Location(4,
		 * "You are in a valley beside a stream",tempExit));
		 * 
		 * tempExit = new HashMap<String, Integer>(); tempExit.put("S", 1);
		 * tempExit.put("W", 2); locations.put(5, new Location(5,
		 * "You are in the forest",tempExit));
		 */
	}

	// Next 12 Overriden methods need to be implemented as part of Map's interface:
	@Override
	public void clear() {
		this.locations.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return this.locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return this.locations.containsValue(value);
	}

	@Override
	public Set<Entry<Integer, Location>> entrySet() {
		return this.locations.entrySet();
	}

	@Override
	public Location get(Object key) {
		return this.locations.get(key);
	}

	@Override
	public boolean isEmpty() {
		return this.locations.isEmpty();
	}

	@Override
	public Set<Integer> keySet() {
		return this.locations.keySet();
	}

	@Override
	public Location put(Integer key, Location value) {
		return this.locations.put(key, value);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location> arg0) {
		// Leaving this method as it - we are not going to use it!
	}

	@Override
	public Location remove(Object key) {
		return this.locations.remove(key);
	}

	@Override
	public int size() {
		return this.locations.size();
	}

	@Override
	public Collection<Location> values() {
		return this.locations.values();
	}
}
