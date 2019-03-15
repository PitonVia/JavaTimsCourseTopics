package generics;

import java.util.ArrayList;

public class GenericsIntro {

	public static void main(String[] args) {

		// Generics allow to create classes, interfaces and methods that take type as parameters called type parameters.
		// Generics helps prevent bugs at the earliest time of code creation - at compile time. 
		
		// Here's an example of bad coding practice - a raw ArrayList. Note that the data type for the ArrayList is not 
		// specified so any object can be used. If we used a String instead of int, the code would crash at runtime.
		// Note that Eclipse provides warnings to the lines of code about the lack of parameterization.
		
		ArrayList items = new ArrayList();
		items.add(1);
		items.add(2);
		//items.add("Tim");
		items.add(3);
		
		printDoubled(items);
		System.out.println();
		
		// Here are a specifying the data type of the Array, a.k.a. parameterized type. 
		ArrayList<Integer> items2 = new ArrayList<>();
		items2.add(1);
		items2.add(2);
		items2.add(3);
		
		printDoubled2(items2);
		
	}
	
	private static void printDoubled(ArrayList list) {
		for (Object i : list) {
			// Note that we need to cast to Integer to specify the type of Object
			System.out.println((Integer) i * 2);
		}
	}
	private static void printDoubled2(ArrayList<Integer> list) {
		for (Integer i : list) {
			// Note that the Integer cast is no longer needed as we've specified the int type in the for loop
			System.out.println(i * 3);
		}
	}

}
