package allExercises.stringMethods;

public class formatDoublesTo2Decimals {

	public static void main(String[] args) {

		double value = 609.999994;
		
		System.out.println(value);
		 
		String formattedValue = String.format("%.2f", value);
		
		System.out.println("\n" + formattedValue);

	}

}
