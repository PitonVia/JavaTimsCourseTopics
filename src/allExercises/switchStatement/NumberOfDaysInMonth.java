package allExercises.switchStatement;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		// Create a boolean method to check if a year is a leap year.
		// A leap year is divisible by 4, but not by 100 or divisible by 400.
		
		// Create 2-nd method to return the number of days in a month. 
		// If it is a leap year, there will be 29 days in Feb.

		System.out.println(isLeapYear(-1));
		System.out.println(isLeapYear(1));
		System.out.println(isLeapYear(100));
		System.out.println(isLeapYear(400));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(10000));
		System.out.println();
		
		System.out.println(getDaysInMonth(2,400));
		System.out.println(getDaysInMonth(2,401));
		System.out.println(getDaysInMonth(-1,1));
		System.out.println(getDaysInMonth(1,1));
		System.out.println(getDaysInMonth(2,2020));
		
	}

	public static boolean isLeapYear(int year) {
		
		if ((year < 1) || (year > 9999))
			return false;
			
		return(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
		
	}
	
	public static int getDaysInMonth(int month, int year) {
		
		if (month < 1 || month > 12 || year < 1 || year > 9999)
			return -1;
		
		int days = 0;
		
		switch(month) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31;
			break;
		
		case 2:
			if (isLeapYear(year))
				days = 29;
			else 
				days = 28;
			break;
			
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		}
		
		return days;
	}
	
}
