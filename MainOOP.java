package object_Oriented_Package;

import java.util.Scanner;

public class MainOOP {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to x airline booking\n");
		System.out.println("--------------------------------");
		System.out.println("Will you have a Domestic Flight or an International Filght?  ");
		System.out.println("Please enter DF for Domestic Flight, IF for International Filght");
		String flightType = input.nextLine();
		
		switch(flightType)
		{
			case "DF":
			case "df":
				Passenger.passangerInfo();						
				break;
			case "IF":
			case "if":
				Passenger.passangerInfo();
				break;
		}
		
		
		
			
		Passenger passenger = new Passenger("John Doe", 30, "AB123456");
        DomesticFlight domesticFlight = new DomesticFlight("DL123", "New York", "Los Angeles", "08:00 AM", "Delta Airlines");
        InternationalFlight internationalFlight = new InternationalFlight("BA456", "London", "Paris", "02:00 PM", "British Airways", "France");

        BookingManager bookingManager = new BookingManager();
        bookingManager.createBooking(passenger, domesticFlight);
        bookingManager.createBooking(passenger, internationalFlight);

        double ticketPrice = 250.0;
        Ticket domesticTicket = bookingManager.generateTicket(passenger, domesticFlight, ticketPrice);
        Ticket internationalTicket = bookingManager.generateTicket(passenger, internationalFlight, ticketPrice);

        bookingManager.displayTicketDetails(domesticTicket);
        bookingManager.displayTicketDetails(internationalTicket);

        domesticFlight.displayFlightDetails();
        internationalFlight.displayFlightDetails();
    }
}
					

		

	
		        

		

		

		


		
		     


