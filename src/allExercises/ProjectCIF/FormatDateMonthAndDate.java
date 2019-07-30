package allExercises.ProjectCIF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FormatDateMonthAndDate {

	// AS400 Date Format is: YYYYMMDD
	// Desired output is: Mon DD, YYYY
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println(formatDateMonthAndDate("0")); // → ""
		System.out.println(formatDateMonthAndDate(null)); // → ""
		
		System.out.println(formatDateMonthAndDate("19650101")); // → Jan 01, 1965
		System.out.println(formatDateMonthAndDate("19800528")); // → May 28, 1980	
		System.out.println(formatDateMonthAndDate("20001331")); // → null 31, 2000
		System.out.println(formatDateMonthAndDate("34560801")); // → Aug 01, 3456		
	}
 
	// utility returns formatted date (month and date) in English or Spanish based on selected language
	// the date string being formatted is like: "MMDD" or "MDD"	
	public static String formatDateMonthAndDate(String date) {	
	
		if (date==null) {
			System.out.println("AS400 date field has a null value");
			return "";	
		} 
		if (date.equals("0")) {
			System.out.println("AS400 date field has a zero value");
			return "";
		} 
		if (date.length() != 8) {
			System.out.println("AS400 date field has invalid value");
			return "";
		}
		String year = date.substring(0, 4);
		String day = date.substring(6);

		String month = date.substring(4,6);
		Map<String,String> mapOfMonths = populateMapOfMonths();
		String convertedMonth = mapOfMonths.get(month);
		if (convertedMonth == null) {
			System.err.println("AS400 value for month inside date field is incorrect!");
		}
		
		return convertedMonth + " " + day + ", " + year;
	}
	
	// returns a Map of Months 
	private static Map<String,String> populateMapOfMonths() {
		
		Map<String, String> months = new HashMap<>();	
		
		months.put("01", "Jan");
		months.put("02", "Feb");
		months.put("03", "Mar");
		months.put("04", "Apr");
		months.put("05", "May");
		months.put("06", "Jun");
		months.put("07", "Jul");
		months.put("08", "Aug");
		months.put("09", "Sep");
		months.put("10", "Oct");
		months.put("11", "Nov");
		months.put("12", "Dec");
		
		return months;
	}

}
