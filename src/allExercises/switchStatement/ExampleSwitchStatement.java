package allExercises.switchStatement;

public class ExampleSwitchStatement {

	public static void main(String[] args) {
		
//		int value = 3;
//		
//		if (value == 1 )
//			System.out.println("Value was 1");
//		else if (value == 2 )
//			System.out.println("Value was 2");
//		else 
//			System.out.println("Value was not 1 or 2");
		
		// The code above can be written using a switch statement.
		
		// If statements are more flexible as anything can be compared, 
		// while switch statements only allow to compare to the set case value.
		
		// Switch can be used with these data types: byte, short, char, int and Strings.
		
		int switchValue = 1;
		
		switch (switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;  // break must be included, else it will execute the code of the next case
			
		case 2:
			System.out.println("Value was 2");
			break;
		
		case 3: case 4: case 5:  // grouping of cases is possible
			System.out.println("Value was 3 or 4 or 5");
			System.out.println("It was actually " + switchValue);
			break;
			
		default:  // default is similar to 'else'
			System.out.println("Value was not 1 or 2 or 3 or 4 or 5");
			break;
				
				
		}
		
	}

}
