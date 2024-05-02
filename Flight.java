package object_Oriented_Package;


	
public class Flight {
	private String flightNumber;
	private String departure;
	private String destination;
    private String departureTime;
    
    
	
    public Flight(String flightNumber, String departure, String destination, String departureTime) {
    	this.flightNumber = flightNumber;
    	this.departure = departure;
    	this.destination = destination;
    	this.departureTime = departureTime;
	    	}
    

  


	public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

	}


