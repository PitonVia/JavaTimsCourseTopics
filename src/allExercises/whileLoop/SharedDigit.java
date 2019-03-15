package allExercises.whileLoop;

public class SharedDigit {

	public static void main(String[] args) {
		// Method returns true if two number have a common digit
		// E.g.:  digit 2 exists in n1 = 23 and n2 = 12

		System.out.println(hasSharedDigit(-1, 23));
		System.out.println(hasSharedDigit(10, 89));
		System.out.println(hasSharedDigit(10, 90));
		System.out.println(hasSharedDigit(58, 36));
		System.out.println();
		
		System.out.println(hasSharedDigit2(-1, 23));
		System.out.println(hasSharedDigit2(10, 89));
		System.out.println(hasSharedDigit2(10, 90));
		System.out.println(hasSharedDigit2(58, 36));
	}
	
	public static boolean hasSharedDigit(int n1, int n2) {
		
		if (n1 < 10 || n2 < 10 || n1 > 99 || n2 > 99 ) 
			return false;
		
		int d2n1= n1 % 10, d2n2= n2 % 10;
		int d1n1= (n1 / 10) % 10, d1n2= (n2 / 10) % 10;
		
		//System.out.println(d1n1 + "" + d2n1 + " " + d1n2 + "" + d2n2);
				
		return d1n1==d1n2 || d1n1==d2n2 || d2n1==d1n2 || d2n1==d2n2;
	}
	
	// Method below uses Strings with .charAt() String method
	public static boolean hasSharedDigit2(int num1, int num2) {
		 
	    boolean sharesDigit = false;
	    
	    String number1 = Integer.toString(num1);
	    String number2 = Integer.toString(num2);
	 
	    for(int i = 0; i < number1.length(); i ++)
	        for(int j = 0; j < number2.length(); j++)
	            if(number1.charAt(i) == number2.charAt(j))
	            	sharesDigit = true;
	 
	    return sharesDigit;
	}
	
}
