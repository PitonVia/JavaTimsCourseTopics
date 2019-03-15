package allExercises.forLoop;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// Method returns the greatest common divisor of the 2 numbers

		// 15 -> 1-3-5-15  -> 5
		// 25 -> 1-5-25    -> 5
		
		System.out.println(getGreatestCommonDivisor(11, 17));
		System.out.println(getGreatestCommonDivisor(15, 25));
		System.out.println(getGreatestCommonDivisor(10, 30));
		System.out.println(getGreatestCommonDivisor(9, 18));
		System.out.println(getGreatestCommonDivisor(-1, 0));
		System.out.println("*****");
		
		System.out.println(getGreatestCommonDivisor1(15, 25));
		System.out.println(getGreatestCommonDivisor2(11, 17));
		
	}
	
	// David's solution using 1 for loop with common iterator 'x'
	public static int getGreatestCommonDivisor1(int first, int second){
	       
		if(first < 10 || second < 10) 
	    	   return -1;
	       
        for(int x=first; x>0; x--)
            if(first % x == 0 && second % x == 0)
                return x;
        	return -1;
	    }

	// My solution using two for loops    
	public static int getGreatestCommonDivisor(int first, int second) {
	
		if (first < 10 || second < 10)
			return -1;
			
		int min = 0;
	
		for (int i=first; i>0; i--) {
			
			for (int j=second; j>0; j--) {
			
				if (first % i == 0 && second % j == 0) {
					
					if (i == j) {

						if (i > min) {
							min = i;
						}
					}				
				}			
			}				
		}		
		return min;	
	}
	
	// Using Euclidean Algorythm with while loop to find the GCD:
	public static int getGreatestCommonDivisor2(int first, int second){
        int temp = 0;
 
        if((first < 10) || (second < 10)){
            return -1;
        }
 
        while((temp=first%second)!=0){
            first = second;
            second = temp;
        }
 
        return second;
 
    }
	
}
