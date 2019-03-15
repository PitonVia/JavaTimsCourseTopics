package allExercises.overloadingMethods;

public class AreaCalculator {

	public static void main(String[] args) {
		// 1-st method calculates area of a circle
		// 2-nd method calculates area of a rectangular

		System.out.println(area(5));
		System.out.println(area(-1));
		System.out.println(area(0));
		System.out.println();
		
		System.out.println(area(5,4));
		System.out.println(area(-1,4));
		System.out.println(area(0,4));
		
	}
	
	public static double area(double radius) {
		
		if (radius < 0) 
			return -1;
		
		return radius * radius * 3.14159;
	}
	
	public static double area(double x, double y) {
		
		if ((x < 0) || (y < 0 ))  
			return -1;
		
		return x * y;
	}


	
}
