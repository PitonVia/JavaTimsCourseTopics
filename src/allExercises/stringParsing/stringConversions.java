package allExercises.stringParsing;

public class stringConversions {

	public static void main(String[] args) {
		// Using Integer (wrapper class for the primitive type 'int')
		// with the static .parseInt() method to convert String to an int
		// This allows to perform calculations using the converted int 

		String numberAsString = "2018";
		String doubleAsString = "2018.123";
		
		// Parsing String to an integer
		int convertedInt = Integer.parseInt(numberAsString);
		System.out.println(convertedInt + 1);
		
		// Parsing String to a double
		double convertedDouble = Double.parseDouble(doubleAsString); 
		System.out.println(convertedDouble);
		
	}

}
