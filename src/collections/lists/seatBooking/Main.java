package collections.lists.seatBooking;

public class Main {

	public static void main(String[] args) {
		
		Theatre theatre = new Theatre("Olympian",8, 12);
		
		//theatre.getSeats();
		
		// Reserving a seat - note the dots in the output - it reflects how many loops were made 
		// before the required element was found. 
		if (theatre.reserveSeatLinear("H11")) {
			System.out.println("Please pay"); 
		} else { 
			System.out.println("Sorry, seat is taken");
		}
		
		System.out.println();
		// Cancel reservation of seat H11
		theatre.cancelSeat("H11");
		System.out.println();
		
		// Trying to reserve the same seat
		if (theatre.reserveSeatBinaryAdapted("H11")) {
			System.out.println("Please pay"); 
		} else { 
			System.out.println("Sorry, seat is taken");
		}	


	}

}
