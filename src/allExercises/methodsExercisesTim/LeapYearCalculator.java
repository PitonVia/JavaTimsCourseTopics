package allExercises.methodsExercisesTim;

public class LeapYearCalculator {

	public static void main(String[] args) {
		// calculate and return true if it is a leap year
		// leap year is divisible by 4 but not by 100, or divisible by 400
		
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(400));
		System.out.println(isLeapYear(2018));
		System.out.println(isLeapYear(2000));
	}

	public static boolean isLeapYear(int year) {
	
		boolean leapYear;
		
		if ((year < 1) || (year > 9999))
			leapYear = false;
		
		else if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			leapYear = true;
		
		else 
			leapYear = false;
		
		return leapYear;
	}
	
	// Nice shorter version of the method:
	public static boolean isLeapYear2(int year) {
	    
		if (year > 0 || year < 10000)
	        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	    else
	        return false;
	    }
	
	
	
}
