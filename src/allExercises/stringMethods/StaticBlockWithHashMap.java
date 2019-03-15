package allExercises.stringMethods;

import java.util.HashMap;

public class StaticBlockWithHashMap {

	private static final HashMap<String, String> MAP = new HashMap<String, String>();
	
	static {
	    MAP.put("banana", "honey");
	    MAP.put("peanut butter", "jelly");
	    MAP.put("rice", "beans");
	}	
}
