package collections.lists.seatBooking;

import java.util.*; // using * is a good way to reduce the number of import statements

public class Theatre {
	
	private final String theatreName;
	// We can use Collection or List to allow various kinds of implementation for classes
	private List<Seat> seats = new ArrayList<>();

	
	// Constructor
	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		this.theatreName = theatreName;
		
		int lastRow = 'A' + (numRows - 1);
		for (char row = 'A'; row<=lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}
	
	// Getter for theatreName
	public String getTheatreName() {
		return theatreName;
	}

	// Method for reserving seats - implementing Linear search
	public boolean reserveSeatLinear(String seatNumber) {
		
		Seat requestedSeat = null;
		
		for (Seat seat : seats) {
			// We want to see how efficient the search for element is
			System.out.print(".");
			if (seat.getSeatNumber().equals(seatNumber)) {
				requestedSeat = seat;
				break; // to save unnecessary looping
			}
		}
		
		if (requestedSeat == null) {
			System.out.println("There is no seat " + seatNumber);
			return false;
		}
		
		return requestedSeat.reserve();
	}
	
	// Method for reserving seats - Binary
	public boolean reserveSeatBinary(String seatNumber) {
		
		Seat requestedSeat = new Seat(seatNumber);
		
		// Parameters of binary search are List, key and comparator set to null
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		
		if (foundSeat >=0) {
			return seats.get(foundSeat).reserve();
		}
		
		System.out.println("There is no seat " + seatNumber);
		return false;
	}
	
	// Method for reserving seats - Binary
	public boolean reserveSeatBinaryAdapted(String seatNumber) {
		
        // This code was copied from Collections.binarySearch() source and was adapted:
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print("."); // to show how many loops before finding the seatNumber
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;		
	}
	
	
	// Method for canceling a seat reservation
	public boolean cancelSeat(String seatNumber) {
		
		Seat requestedSeat = null;
		
		for (Seat seat : seats) {
			if (seat.getSeatNumber().equals(seatNumber)) {
				requestedSeat = seat;
				break; // to save unnecessary looping
			}
		}
		
		if (requestedSeat == null) {
			System.out.println("There is no seat " + seatNumber);
			return false;
		}
		
		return requestedSeat.cancelReserved();
	}
	
	// Prints all available seats
	public void getSeats() {
		
		for (Seat seat : seats) {
			System.out.print(seat.getSeatNumber() + " ");
		}
	}
	
	// Creating inner class Seat:
	// We are implementing Comparable interface to make binary search possible
	private class Seat implements Comparable<Seat> {
		
		private final String seatNumber;
		// private boolean to indicate if a seat has been reserved - false by default
		private boolean reserved = false;
		
		// Constructor
		public Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}

		// Getter for seatNumber
		public String getSeatNumber() {
			return seatNumber;
		}
		
		// Marks a seat as reserved = true
		public boolean reserve() {
			if (!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + seatNumber + " reserved.");
				return true;
			}
			return false;
		}
		
		// Mark a reserved seat as reserved = false
		public boolean cancelReserved() {
			if (this.reserved) {
				this.reserved = false;
				System.out.println("Reservation of seat " + seatNumber + " cancelled.");
				return true;
			}
			return false;
		}

		// Overriding the only method of the Comparable interface
		// Method returns either 0, or 1 or -1 
		@Override
		public int compareTo(Seat seat) {
			// Comparing seatNumber to getSeatNumber();
			return this.seatNumber.compareToIgnoreCase(getSeatNumber());
		}	
	}
}
