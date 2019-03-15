package allExercises.switchStatement;

public class DayOfTheWeekChallenge {

	public static void main(String[] args) {
		// create a method that will print days of the week
		
		printDayOfTheWeek("Monday");
		printDayOfTheWeek("tueSDay");
		printDayOfTheWeek("WEDNESDAY");
		printDayOfTheWeek("sunday");
		printDayOfTheWeek("munday");
			
	}

	private static void printDayOfTheWeek(String day) {
		
		switch(day.toLowerCase()) {
		
		case "sunday":
			System.out.println(day.toUpperCase());
			break;
		case "monday":
			System.out.println(day.toUpperCase());
			break;
		case "tuesday":
			System.out.println(day.toUpperCase());
			break;
		case "wednesday":
			System.out.println(day.toUpperCase());
			break;
		case "thursday":
			System.out.println(day.toUpperCase());
			break;
		case "friday":
			System.out.println(day.toUpperCase());
			break;
		case "saturday":
			System.out.println(day.toUpperCase());
			break;
		default:
			System.out.println("Invalid day!");
			break;
		}
		
	}
}
