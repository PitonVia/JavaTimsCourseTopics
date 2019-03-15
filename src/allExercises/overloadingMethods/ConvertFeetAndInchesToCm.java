package allExercises.overloadingMethods;

public class ConvertFeetAndInchesToCm {

	public static void main(String[] args) {
		// if params valid, calculate how many cm comprise feet and inches
		// passed to the method and return that value
		// 2-nd overloaded method should convert inches to feet and inches and 
		// should pass these values to the 1-st method and return cm.

		calcFeetAndInchesToCentimeters(0, 1);
		calcFeetAndInchesToCentimeters(1, 13);
		calcFeetAndInchesToCentimeters(-1, 1);
		calcFeetAndInchesToCentimeters(1, 1);
		System.out.println();
		
		calcFeetAndInchesToCentimeters(1);
		calcFeetAndInchesToCentimeters(-10);
		calcFeetAndInchesToCentimeters(13);
		calcFeetAndInchesToCentimeters(72);	
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if ((feet < 0) || (inches < 0) || (inches > 12)) {
			System.out.println("invalid number of feet or inches was specified");
			return -1;
		}
		
		double cm = (feet*12 + inches) * 2.54;
		
		System.out.println(feet + " feet and " + inches + " inches = " + cm + " centimeters");
		
		return cm;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if (inches < 0) {
			System.out.println("invalid number of inches was specified");
			return -1;
		}
		
		double feet = (int) inches / 12;
		inches = (int) inches % 12;
		
		return calcFeetAndInchesToCentimeters(feet, inches);		
	}
	
}
