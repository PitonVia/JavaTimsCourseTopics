package allExercises.overloadingMethods;

public class SecondsAndMinutesChallenge {

	public static final String INVALID_VALUE_MSG = "Invalid value";
	
	public static void main(String[] args) {
		// Write two methods:
		
		// 1-st method should take minutes and seconds and return duration
		// string is the following format: "XXh YYm ZZs" where XX stands for 
		// hours, YY stands for minutes and ZZ stands for seconds. 
		
		// 2-nd method should take seconds only, calculate how many minutes
		// are in the seconds and call the 1-st method to return duration.
		
		System.out.println(getDurationString(120, 12));
		System.out.println(getDurationString(0, 30));
		System.out.println(getDurationString(-1, 1));
		System.out.println(getDurationString(1000, 10));
		System.out.println();
		
		System.out.println(getDurationString(3661));
		System.out.println(getDurationString(0));
		System.out.println(getDurationString(-1));
		System.out.println(getDurationString(65));
	}
	
	private static String getDurationString(int minutes, int seconds) {
				
		if ((minutes < 0) || (seconds < 0) || (seconds > 59)) 
			return INVALID_VALUE_MSG;	
		
		// calculate how many hours in minutes
		int hours = minutes / 60;
		minutes = minutes % 60; 
		
		String hoursString = hours + "h";
		if (hours <10) {
			hoursString = "0" + hoursString;
		}
		String minutesString = minutes + "m";
		if (minutes <10) {
			minutesString = "0" + minutesString;
		}
		
		String secondsString = seconds + "s";
		if (seconds <10) {
			secondsString = "0" + secondsString;
		}
		
		return hoursString + " " + minutesString + " " + secondsString; 	
	}
	
	public static String getDurationString(int seconds) {
		
		if (seconds < 0) 
			return INVALID_VALUE_MSG;	
		
		// calculate how many minutes in seconds
		int minutes = seconds / 60;
		seconds = seconds % 60; 
		
		return getDurationString(minutes, seconds);	
	}

}
