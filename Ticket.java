package object_Oriented_Package;

 

public class Ticket {
    private String ticketNumber;
    private Passenger passenger;
    private Flight flight;
    private double price;

    public Ticket(String ticketNumber, Passenger passenger, Flight flight, double price) {
        this.ticketNumber = ticketNumber;
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
    }

    // Getters and setters
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}


