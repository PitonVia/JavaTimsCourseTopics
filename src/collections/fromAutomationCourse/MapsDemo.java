package collections.fromAutomationCourse;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// MAPs - store elements as key:value pairs.
// Keys always have to be unique. 

// HashMap - does not guarantee order of its entries, but very fast processing.
// LinkedMap - maintains the order in which entries were added.
// TreeMap - maintains a natural sorting order of added entries.

// Interview question: explain the difference between HashMap and HashTable:
// 1. HashMap is not synchronized and not thread-safe, while HashTable is.
// HashTable should be used in multi-threaded applications.
// 2. HashMap accepts null values, while HashTable does not. 
// 3. HashMap works with Iterator while HashTabel and Vector only work with 
// enumerator.



public class MapsDemo {

	public static void main(String[] args) {
		
		// Integer is the key, String is the value.
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		
		// adding
		hashMap.put(1, "BMW"); 
		hashMap.put(2, "BMW"); // duplicate values are allowed
		hashMap.put(6, "Audi");
		hashMap.put(4, "Honda");
		hashMap.put(4, "Mercedes"); // duplicate key will overwrite value
		hashMap.put(42, "Lotus");
		hashMap.remove(42);  // remove an element by providing key
		hashMap.put(42, "Lotus");
		
		// getting
		System.out.println(hashMap.get(1));  //specify the key to get the value 
		System.out.println(hashMap.get(2));
		System.out.println(hashMap.get(4));  // returns Mercedes
		System.out.println(hashMap.get(42));  // returns null
		System.out.println();
		
		// Create a set of indexed key:value pairs
		Set<Entry<Integer,String>> set = hashMap.entrySet();
//		Can remove <Entry<Integer,String>> part of Set declaration:
//		Set set = hashMap.entrySet();
		
		// Now can utilize all the methods applicable to Sets:
		Iterator<Entry<Integer, String>> iter = set.iterator();
		
		while (iter.hasNext()) {
			Map.Entry<Integer,String> me = (Map.Entry<Integer, String>)iter.next();
			System.out.println(me.getKey()); // print keys separately
			System.out.println(me.getValue()); // print values separately
		}
		System.out.println();
		
		
		// To retrieve all Map entries using a for loop
		for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key: " + key + ", value: " + value);
		}
		System.out.println();

		// Alternative way to retrieve Map elements:
		for (Integer key : hashMap.keySet()) {
			String value = hashMap.get(key);
			System.out.println("key: " + key + ", value: " + value);
		}
	}

}
