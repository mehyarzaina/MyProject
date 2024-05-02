package object_Oriented_Package;

	
public class InternationalFlight extends Flight {
	    private String airline;
	    private String country;

	    public InternationalFlight(String flightNumber, String departure, String destination, String departureTime, String airline, String country) {
	        super(flightNumber, departure, destination, departureTime);
	        this.airline = airline;
	        this.country = country;
	    }

	    public void displayFlightDetails() {
	    	System.out.println("International Flight Details:");
	        System.out.println("Flight Number: " + getFlightNumber());
	        System.out.println("Departure: " + getDeparture());
	        System.out.println("Destination: " + getDestination());
	        System.out.println("Departure Time: " + getDepartureTime());
	        System.out.println("Airline: " + airline);
	        System.out.println("Country: " + country);
	    }

	    
	}


