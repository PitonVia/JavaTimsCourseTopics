package dateAndCalendarDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		// Declare an instance of the Date class from java.util package
		Date d = new Date();
		
		// use .toString() to convert date in default format to string
		System.out.println(d.toString());
		
		// How to customize date and time to a specific format.
		// E.g.:   mm/dd/yyyy hh:mm:ss

		// For this purpose java has a designated class SimpleDateFormat
		// Need to specify desired format in the parentheses
		SimpleDateFormat sdf = new SimpleDateFormat("MM//dd//yyyy HH:mm:ss");
		
		// SimpleDateFormat object will work with the Date class object:
		System.out.println(sdf.format(d));
	}

}
