package allExercises.whileLoop;

public class AllFactors {

	public static void main(String[] args) {
		// Method prints all factors of the number. A factor of a number
		// is an int which divides the number wholly, i.e. without a remainder.

		printFactors(6);
		printFactors(0);
		printFactors(10);
		System.out.println();
		printFactors2(6);
		printFactors2(0);
		printFactors2(10);
		
	}

	public static void printFactors(int number ) {
	
		if (number < 1) 
			System.out.println("Invalid Value");
		
		int i = 1;
		
		while (i <= number) {
			
			if (number % i == 0)
				System.out.println(i);
				
			i++;
		} 
	}
	
	public static void printFactors2(int number) {
	       if(number < 1) {
	           System.out.println("Invalid Value");
	       }
	       /*else*/
	       int i = number;
	       while(i >= 1) {
	           if(number %i == 0) {
	               System.out.println(number/i);
	           }
	           i--;
	       }
	   }
	
}
