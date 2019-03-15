package allExercises.switchStatement;

public class NumberToWords {

	public static void main(String[] args) {
		// Write a method that will use reversed number to print words for the digits.
		// E.g. 100 will print: "One Zero Zero"
		// Write 2-nd method that reverses number so they are later printed in correct order. 
		// Write 3-rd method that will return the count of digits in the original number
		// If we reverse 100, we get 001. Use 3-rd method to print correct output.
		
		numberToWords(180);
		System.out.println();
		
		numberToWords(34567);
		System.out.println();
		
		numberToWords(1000);
		System.out.println();
		
		numberToWords(-1);
		System.out.println();
		
		numberToWords(123);		
				
	}

	// Method 1 - prints words for numbers, uses two other methods
	public static void numberToWords(int number) {
		
		if (number < 0) {
			System.out.println("Invalid Value");
		} else if (number == 0) {
			System.out.println("Zero");
		} else {
			
			int reversedNum = reverse(number);
			int reversed = reverse(number);
			
			int digit = 0;
			String printOutput = "";
			
			while (reversedNum > 0) {
				
				digit = reversedNum % 10;
				
				switch(digit) {
				
				case 0:
					printOutput += "Zero ";
					break;
				case 1:
					printOutput += "One ";
					break;
				case 2:
					printOutput += "Two ";
					break;
				case 3:
					printOutput += "Three ";
					break;
				case 4:
					printOutput += "Four ";
					break;
				case 5:
					printOutput += "Five ";
					break;
				case 6:
					printOutput += "Six ";
					break;
				case 7:
					printOutput += "Seven ";
					break;
				case 8:
					printOutput += "Eight ";
					break;
				case 9:
					printOutput += "Nine ";
					break;
				}	
				reversedNum /= 10;
			}
			
			// if digit count of the reversed num != digit count of the original num
			if (getDigitCount(number) != getDigitCount(reversed)) {
				
				// print additional zeros (
				for (int i=0; i<(getDigitCount(number) - getDigitCount(reversed)); i++) {
					
					printOutput += "Zero ";
				}	
			}
			
			// using .trim() to remove the leading space after the last printed word
			System.out.println(printOutput.trim());
		}
	}
	
	// 2-nd method - reverses the number
	public static int reverse(int number) {
		
		int reversedNum = 0;
			
		for (int i=number; i!=0; i=i/10) {
			
			reversedNum = reversedNum * 10 + (i % 10);
		}		
		return reversedNum;
	}	
	
	// 3-rd method to get the count of digits in number
	public static int getDigitCount(int number) {
		
		if (number < 0) return -1;
		
		if (number == 0) return 1;
		
		int digitCount = 0;
		
		while (number > 0) {
			
			digitCount++;
			
			number /= 10;
		}
		return digitCount;
	}
}
