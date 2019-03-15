package outoboxingAndUnboxing;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		String[] strArray = new String[10];
		int[] intarray = new int[10];

		ArrayList<String> strArrayList = new ArrayList<String>(); 
		strArrayList.add("Tim");
		
		// However, we cannot declare an int array list as follows:
		// ArrayList<int> intArrayList = new ArrayList<>(int); 
		
		// We have to use a wrapper class for integers: Integer
		// There are wrapper classes also available for other data types like double, etc. 
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for (int i=0; i<10; i++) {
			// .valueOf() takes a primitive int 'i' and converts it into Integer class 
			// This is example of AUTOBOXING - converting primitive type to wrapper class. 
			intArrayList.add(Integer.valueOf(i));
		}
		for (int i=0; i<10; i++) {
			// .intValue() takes an object of the wrapper class and converts it into a primitive int
			// This is example of UNBOXING - converting object of a wrapper class to a primitive type 
			System.out.println(i + " --> " + intArrayList.get(i).intValue());
		}
		System.out.println();
		
		// Java does Autoboxing and Unboxing automatically for you!
		
		// You can type in: 
		Integer myIntValue = 56;
		int myInt = myIntValue;
		
		// Instead of:
		Integer myIntValue2 = Integer.valueOf(56);	
		int myInt2 = myIntValue.intValue();
		
		// The next example demonstrates how autoboxing and unboxing are done automatically:
		ArrayList<Double> dblArrayList = new ArrayList<Double>();
		for (double dbl=0; dbl<10; dbl+=0.5) {
			dblArrayList.add(dbl); // automatic AUTOBOXING
		}
		for (int i=0; i<dblArrayList.size(); i++) {
			System.out.println(i + " --> " + dblArrayList.get(i)); // automatic UNBOXING
		}
		
	}
}
