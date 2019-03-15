package collections.lists.seatBookingComparator;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Theatre theatre = new Theatre("Olympian",8, 12);
		
		// Reserving a seat using binary search
		if (theatre.reserveSeatBinary("D12")) {
			System.out.println("Please pay"); 
		} else { 
			System.out.println("Sorry, seat is taken");
		}
		
		System.out.println();

		// Trying to reserve the same seat
		if (theatre.reserveSeatBinary("D12")) {
			System.out.println("Please pay"); 
		} else { 
			System.out.println("Sorry, seat is taken");
		}
		
		System.out.println();
		
		// Note that seat B13 does not exist!
		if (theatre.reserveSeatBinary("B13")) {
			System.out.println("Please pay"); 
		} else { 
			System.out.println("Sorry, seat is taken");
		}
		
		System.out.println();
		
		// Declaring a new ArrayList of seats
		List<Theatre.Seat> reversedSeats = new ArrayList<>(theatre.getSeats());
		// Using Collections.reverse() method to reverse order of elements inside the list
		Collections.reverse(reversedSeats);
		printList(reversedSeats);
		
		// Creating a new list of seats that will work with the Comparator
		List<Theatre.Seat> priceSortedSeats = new ArrayList<>(theatre.getSeats());
		// Adding new seats to the List - note the declaration of the Seat inner class
		priceSortedSeats.add(theatre.new Seat("B00", 13.00));
		priceSortedSeats.add(theatre.new Seat("A00", 13.00));
		// Using Collections.sort() method of the List with Comparator
		Collections.sort(priceSortedSeats, Theatre.PRICE_ORDER);
		printList(priceSortedSeats);
		
		
	}
	
	public static void printList(List<Theatre.Seat> list) {
		
		for (Theatre.Seat seat : list) {
			System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice() + ",");
		}
		System.out.println("\n");
	}
}
