package interfaces.challengeISaveable;

import java.util.List;

public interface ISaveable {
	
	// Method 1 - to save or write values and returns an List 
	// Method 2 - to read values from the List
	// Because we are using List and not ArrayList, we are allowing max flexibility for the 
	// classes that will be implementing this interface
	
	List<String> write();
	void read(List<String> savedValues);
	
	
}
