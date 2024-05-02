package object_Oriented_Package;

import java.util.Scanner;

public class BookingManager {
	public void createBooking(Passenger passenger, Flight flight) {
	        // Create a booking
	        // ...
	
	    }

	public Ticket generateTicket(Passenger passenger, Flight flight, double price) {
	        // Generate a ticket
	        // ...

		return new Ticket("T123456", passenger, flight, price);
	    	}
	
	public void displayTicketDetails(Ticket ticket) {
	        // Display ticket details
	        // ...
	    }
	
	
}


