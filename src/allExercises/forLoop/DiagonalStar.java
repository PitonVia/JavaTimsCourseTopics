package allExercises.forLoop;

public class DiagonalStar {

	public static void main(String[] args) {

		printSquareStar(5);

	}

	public static void printSquareStar(int number) {
		
		if (number < 5) 
			System.out.println("Invalid Value");
		
		else {
			for (int row=1; row<=number; row++) {
				
				for (int col=1; col<=number; col++) {
					
					
					if (row==1 || row==number || col==1 || col==number 
							|| col==row || (col==(number-row+1)) ) {
						System.out.print("*");
					}
				
					else {
						System.out.print(" ");			
					}			
				}
				System.out.print("\n");	
			}	
		}			
	}
}
