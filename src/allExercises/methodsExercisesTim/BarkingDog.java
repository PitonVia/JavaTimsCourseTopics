package allExercises.methodsExercisesTim;

public class BarkingDog {

	public static void main(String[] args) {
		
		// hourOfDay has a valid range between 0-23
		// we have to wake up (return true) if dog is barking before 8 and after 22
		// in all other cases return false
		
		System.out.println(bark(true,1));
		System.out.println(bark(false,2));
		System.out.println(bark(true,8));
		System.out.println(bark(true,-1));
		
	}

	public static boolean bark(boolean barking, int hourOfDay) {
		
		boolean wakeUp;
		
		if ((hourOfDay < 0) || (hourOfDay > 23)) {
			wakeUp = false;
		} else if ((barking && (hourOfDay < 8)) || (barking && (hourOfDay > 22))) {
			wakeUp = true;
		} else {
			wakeUp = false;
		}
		
		return wakeUp;
	}
	
}
