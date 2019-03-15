package collections.lists.seatBookingComparator;

import java.util.*; // using * is a good way to reduce the number of import statements

public class Theatre {

	private final String theatreName;
	// We can use Collection or List to allow various kinds of implementation for
	// classes
	private List<Seat> seats = new ArrayList<>();

	// Implementing anonymous inner Comparator class and overriding its compare()
	// method
	// to allow sorting seats by price
	static final Comparator<Seat> PRICE_ORDER;

	// Using static initialization block
	static {
		PRICE_ORDER = new Comparator<Seat>() {

			@Override
			public int compare(Seat seat1, Seat seat2) {

				if (seat1.getPrice() < seat2.getPrice()) {
					return -1;
				} else if (seat1.getPrice() > seat2.getPrice()) {
					return 1;
				} else {
					return 0;
				}
			}
		}; // Need semicolon here to finish the Comparator definition
	}

	// Constructor
	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		this.theatreName = theatreName;

		int lastRow = 'A' + (numRows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				double price = 12.00;
				if ((row > 'D') && (seatNum >= 4 && seatNum <= 9)) {
					price = 14;
				} else if ((row > 'F') || (seatNum < 4 || seatNum > 9)) {
					price = 7.00;
				}
				Seat seat = new Seat(row + String.format("%02d", seatNum), price);
				seats.add(seat);
			}
		}
	}

	// Getter for theatreName
	public String getTheatreName() {
		return theatreName;
	}

	// Method for reserving seats - Binary
	public boolean reserveSeatBinary(String seatNumber) {

		Seat requestedSeat = new Seat(seatNumber, 0);

		// Parameters of binary search are List, key and comparator set to null
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);

		if (foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		}
		System.out.println("There is no seat " + seatNumber);
		return false;
	}

	// Getter for the List seats
	public Collection<Seat> getSeats() {
		return seats;
	}

	// Creating inner class Seat:
	// We are implementing Comparable interface to make binary search possible
	public class Seat implements Comparable<Seat> {

		private final String seatNumber;
		private double price;
		// private boolean to indicate if a seat has been reserved - false by default
		private boolean reserved = false;

		// Constructor
		public Seat(String seatNumber, double price) {
			this.seatNumber = seatNumber;
			this.price = price;
		}

		// Getters for seatNumber & price
		public String getSeatNumber() {
			return seatNumber;
		}

		public double getPrice() {
			return price;
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
