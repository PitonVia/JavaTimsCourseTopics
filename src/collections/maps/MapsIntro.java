package collections.maps;

import java.util.*;

public class MapsIntro {

	// Map - replaces obsolete dictionaries abstract class. 
	// Like a dictionary, map has key-value pairs where keys must be unique and 1 key can map to a single value.
	
	// The Map interface includes methods for basic operations (put, get, remove, replace, containsKey, containsValue, size, and empty), 
	// bulk operations (such as putAll and clear), and collection views (such as keySet, entrySet, and values).
	
	// Java platform has 3 general-purpose Map implementations: HashMap, TreeMap, and LinkedHashMap. 
	// Their behavior and performance are precisely analogous to HashSet, TreeSet, and LinkedHashSet.
	
	// HashMap - does not keep Keys in any order.
	
	public static void main(String[] args) {
		
		Map<String, String> languages = new HashMap<>();
		
		languages.put("Java", "a compiled high-level object oriented, platform-independent langauge");
		languages.put("Python", "an interpreted, object oriented high-level langauge with dynamic semantics");
		languages.put("Algol", "an algorithmic langauge");
		System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instatuction Code"));
		System.out.println(languages.put("Lisp", "Therein lies madness"));
		
		System.out.println(languages.get("Java"));
		// Note that if are putting a new value to the same key, the old value will be overwritten.
		// If we are printing the put(), when it overrides a value, it will print the old value.
		System.out.println(languages.put("Java", "This course is about Java"));
		System.out.println(languages.get("Java"));
		
		// If you want to avoid overwriting an existing value, you can use .containsKey()
		if (languages.containsKey("Python")) {
			System.out.println("Python is already in the Map");
		} else {
			languages.put("Python", "Python is an awesome language!");
		}
		
		System.out.println();
		languages.remove("Lisp");
		
		// Can remove element provided Key:Value pair matches:
		if (languages.remove("BASIC", "Beginners language")) {
			System.out.println("BASIC removed.");
			languages.remove("BASIC");
		} else {
			System.out.println("BASIC not removed, key/value pair not found!");
		}
		
		
		System.out.println("=====================");
		
		// Printing the contents of the Map by looping through Keys
		// Note how to iterate through a map by using key
		for (String key : languages.keySet()) {
			System.out.println(key + " : " + languages.get(key));
		}
		
		
//		System.out.println(languages.get("Python"));
//		System.out.println(languages.get("Algol"));
//		System.out.println(languages.get("BASIC"));
//		System.out.println(languages.get("Lisp"));
		

	}

}
