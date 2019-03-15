package abstractClasses.challenge;

public abstract class ListItem {
	
	protected ListItem rightLink = null;
	protected ListItem leftLink = null;
	
	protected Object value;

	// Constructor
	public ListItem(Object value) {
		this.value = value;
	}
	
	// Abstract methods:
	abstract ListItem next();
	abstract ListItem setNext(ListItem item);
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem item);
	// Method for field-by-field comparison of objects
	abstract int compareTo(ListItem item);
	
	// Auto-gen getter and setter for value field
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}
