package dateAndCalendarDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws Exception {

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

	 
	    String sDate1 = "31/12/1998";  
	    SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date1 = formatter1.parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);  
	    
	    String sDate2 = "31-Dec-1998"; 
	    // The two lines of code below can be shorted into 1 line:
	/*        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yyyy"); 
	        Date date2=formatter2.parse(sDate2);    */
	    Date date2 = new SimpleDateFormat("dd-MMM-yyyy").parse(sDate2);
	    System.out.println(sDate2+"\t"+date2);  
	    
	    String sDate3 = "12 31, 1998";  
	    SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");  
	    Date date3=formatter3.parse(sDate3);  
	    System.out.println(sDate3+"\t"+date3);  
	    
	    String sDate5 = "Thu, Dec 31 1998 23:37:50"; 
	    Date date5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss").parse(sDate5); 
	    System.out.println(sDate5+"\t"+date5);   
	}
}
