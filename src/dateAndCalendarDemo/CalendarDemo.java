package dateAndCalendarDemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		
		// Use .getInstance() of java.util to create a Calendar object
		Calendar cal = Calendar.getInstance();
		
		// Can use Calendar object with .getTime() with SimpleDateFormat object:
		SimpleDateFormat sdf = new SimpleDateFormat("MM//dd//yyyy HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));

		// Can retrieve calendar dates separately:
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM)); // returns 0 for AM, 1 for PM
		System.out.println(cal.get(Calendar.MINUTE));
	}

}
