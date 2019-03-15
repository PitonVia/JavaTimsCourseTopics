package allExercises.switchStatement;

public class CharSwitchStatementChallenge {

	public static void main(String[] args) {
		// Create a switch statement testing for A,B,C,D or E.
		// Print message if any of these are found and then break.
		// Add a default that prints a message saying "Not found"

		char charSwitch = 'Z';
		
		switch (charSwitch) {
		
		case 'A':
			System.out.println("Found " + charSwitch);
			break;
			
		case 'B':
			System.out.println("Found " + charSwitch);
			break;
			
		case 'C': case 'D': case 'E':
			System.out.println("Found " + charSwitch);
			break;
			
		default:
			System.out.println("Not found");
			break;
		}
		
	}

}
