public class Flight {
    int flightNumber;
    String airlineOfFlight;
    final static int capacity =50;
    int numberOfSeatsBooked;
    int numberOfSeatsRequested;
    int availabilityOfSeats;

    public Flight(int flightNumber, String airlineOfFlight, int numberOfSeatsBooked) {
        this.flightNumber = flightNumber;
        this.airlineOfFlight = airlineOfFlight;
        this.numberOfSeatsBooked = numberOfSeatsBooked;
    }
    public String getFlightDetails(){
        return "Flight Number: "+flightNumber +"Airline : "+airlineOfFlight+"Capacity: "+capacity+"Number Of Seats Booked"+numberOfSeatsBooked ;
    }
    public String detailsOfFlight()
    {
        return "Flight Number: "+flightNumber +"Airline : "+airlineOfFlight;
    }
    public int availabilityOfSeats()
    {

        return capacity-numberOfSeatsBooked;
    }
    public int getNumberOfSeatsRequested()
    {
        return numberOfSeatsRequested;
    }

}
