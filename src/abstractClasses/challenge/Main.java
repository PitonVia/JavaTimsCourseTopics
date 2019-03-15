package abstractClasses.challenge;

public class Main {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList(null);
		
		list.traverse(list.getRoot());
		System.out.println();
		
		
		String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
		
		// Creating a String array that will be comprised of string components of the stringData String split by spaces:
		String[] data = stringData.split(" ");

		for (String s : data) {
			list.addItem(new Node(s));
		}
		
		list.traverse(list.getRoot());
		System.out.println();
		
		list.removeItem(new Node("Perth"));
		list.traverse(list.getRoot());
		
	}

}
