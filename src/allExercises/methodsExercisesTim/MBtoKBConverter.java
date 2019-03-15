package allExercises.methodsExercisesTim;

public class MBtoKBConverter {

	public static void main(String[] args) {

		printMegaBytesAndKiloBytes(3000);
		printMegaBytesAndKiloBytes(1024);
		printMegaBytesAndKiloBytes(-1);
		printMegaBytesAndKiloBytes(0);

	}
	
	// method needs to convert KB into MB with remaining KB from KB parameter
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			int megaBytes = kiloBytes / 1024;
			int remainingKB = kiloBytes % 1024;
			
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");
		}		
	}

}
