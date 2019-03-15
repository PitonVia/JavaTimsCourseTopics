package allExercises.forLoop;

public class SumOdd {

	public static void main(String[] args) {
		// Create a method to check if number is odd, else return false
		// Create 2-nd method to sum up odd numbers with start and end parameters
		
		System.out.println(sumOdd(1,100));
		System.out.println(sumOdd(-1,100));
		System.out.println(sumOdd(100,100));
		System.out.println(sumOdd(100,-100));
		System.out.println(sumOdd(100,1000));
				
	}
	
	public static boolean isOdd(int number) {
		
		return ((number > 0) && (number % 2 !=0));		
	}

	public static int sumOdd(int start, int end) {
		
		int sum = 0;
		
		if ((end >= start) && (start > 0) && (end > 0)) {
			
			for (int i=start; i<=end; i++) {
				if (isOdd(i)) {
					sum += i;
				}
			}
			
			return sum;
		}
		
		return -1;
	}
}
