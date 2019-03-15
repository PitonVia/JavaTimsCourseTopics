package allExercises.methodsExercisesTim;

public class PlayingCat {

	public static void main(String[] args) {
		// The cat will play if the temperature is between 25 and 35 inclusive unless it is summer.
		// If it is summer, then the cat will play between 25 and 45 inclusive.
		// Return true if cat is playing.
		
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
		System.out.println(isCatPlaying(false, -1));
		System.out.println(isCatPlaying(true, 44));
		System.out.println(isCatPlaying(true, 25));	
	
	}

	public static boolean isCatPlaying(boolean summer, int temperature) {		
			
		return ((summer) && (temperature >= 25 && temperature <=45)) || (!(summer) && (temperature >= 25 && temperature <=35));
		
	}
}
