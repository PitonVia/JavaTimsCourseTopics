package abstractClasses.challenge;

public class MyLinkedList implements NodeList{

	private ListItem root = null;
	
	// Constructor
	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	// when adding items, if it is the 1-st item, we need to add it in the head of the list (as root)
	// Else, we have to use the compareTo() method to determine item's position
	@Override
	public boolean addItem(ListItem newItem) {
		// if the list was empty, add the item as a root
		if (this.root == null) { 
			this.root = newItem;
			return true;
		}
		
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int comparison = currentItem.compareTo(newItem);
			// If the newItem is greater, then need to move the newItem right if possible
			if (comparison < 0) {
				if (currentItem.next() != null) {
					currentItem = currentItem.next();
				} else {
					// there is no next item, so insert at the end of the list
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem);
					return true;
				}
			} else if (comparison > 0) {
				// If newItem is less, need to insert it before the item it was compared to
				if (currentItem.previous() != null) {
					currentItem.previous().setNext(newItem);
					newItem.setPrevious(currentItem.previous());
					newItem.setNext(currentItem);
					currentItem.setPrevious(newItem);		
				} else {
					// The node with a previous is the root
					newItem.setNext(this.root);
					this.root.setPrevious(newItem);
					this.root = newItem;
				} 
				return true;
			} else { 
				// They are equal
				System.out.println(newItem.getValue() + " is already in the list.");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		if (item != null) {
			System.out.println("Deleting item " + item.getValue());
		}
		
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int comparison = currentItem.compareTo(item);
			if (comparison == 0) {
				// fount the item to delete, but neet to check if it is root
				if (currentItem == this.root) {
					this.root = currentItem.next();
				} else {
					currentItem.previous().setNext(currentItem.next());
					if (currentItem.next() != null) {
						currentItem.next().setPrevious(currentItem.previous());
					}
				}
				return true;
			} else if (comparison < 0) {
				// we haven't reached the point in the list yet so we want to move to the next item
				currentItem = currentItem.next();
			} else { // comparison is > 0
				// we are at a point greater than the one that needs to be deleted
				// so the item is not in the list
				return false;
			}
		}
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		if (root == null) {
			System.out.println("The list is empty");
		} else {
			// as long as we have some items in the list
			while (root != null) {
				System.out.println(root.getValue()); 
				root = root.next();
			}	
		}
	}
}
