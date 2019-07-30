
package acmeOrderSystem.com.acme.utils;

public class MyDate {

	public int month;
	public int day;
	public int year;
	
	// initialization block
	{
	setDate(0,0,2000);
	}
	
	//	no-argument (no-args) constructor
	public MyDate() {
	}
	
	// constructor with all class parameters
	public MyDate(int month, int day, int year) {
		setDate(month, day, year);
	}
	
	public String toString() {
		return Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year) ;
	}

	public void setDate(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	
}
