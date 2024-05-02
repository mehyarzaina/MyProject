package object_Oriented_Package;

import java.util.Scanner;

public class DomesticFlight extends Flight {
    private String airline;

    public DomesticFlight(String flightNumber, String departure, String destination, String departureTime, String airline) {
        super(flightNumber, departure, destination, departureTime);
        this.airline = airline;
    }
    
    
    

    public void displayFlightDetails() {
        System.out.println("Domestic Flight Details:");
        System.out.println("Flight Number: " + getFlightNumber());
        System.out.println("Departure: " + getDeparture());
        System.out.println("Destination: " + getDestination());
        System.out.println("Departure Time: " + getDepartureTime());
        System.out.println("Airline: " + airline);
    }
    
    
}