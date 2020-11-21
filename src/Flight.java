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
    int availabilityOfSeats()
    {

        return capacity-numberOfSeatsBooked;
    }
    int getNumberOfSeatsRequested()
    {
        return numberOfSeatsRequested;
    }

}
