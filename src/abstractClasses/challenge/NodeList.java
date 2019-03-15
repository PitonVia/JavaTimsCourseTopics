package abstractClasses.challenge;

public interface NodeList {

	// root is a head record
	ListItem getRoot();
	boolean addItem(ListItem item);
	boolean removeItem(ListItem item);
	void traverse(ListItem root);
}
