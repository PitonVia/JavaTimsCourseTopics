package allExercises.methodsExercisesTim;

public class MinutesToYearsAndDaysCalculator {

	public static void main(String[] args) {
		// method take minutes and prints message in the format: "XX min = YY y and ZZ d" 
		// 		XX - represents the original value of minutes
		// 		YY - represents the calculated number of years
		// 		ZZ - represents the calculated number of days
		// 1 hr = 60 min;  1 day = 24 hrs;  1 year = 365 days

		printYearsAndDays(525601);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
		printYearsAndDays(1);
		printYearsAndDays(-1);
		printYearsAndDays(145);
	
	}

	public static void printYearsAndDays(long minutes) {
		
		if (minutes < 0 ) 
			System.out.println("Invalid Value");
	
		else {
			
			long years = minutes / (365*24*60);
			long remainderYears = minutes % (365*24*60); 
			long days = remainderYears / (24*60);
			
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
		}
	}
}
