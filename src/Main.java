import java.util.Scanner;

public class Main{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        Flight DeccanAirlines=new Flight( 2048,"Deccan Airlines",30);
        Flight spiceJet=new Flight( 2049,"Spice Jet Airlines",25);
        Flight jetAirways=new Flight( 2051,"Jet Airway Airlines",25);
        Flight Emirates=new Flight( 2052,"Emirates Airlines",25);

        System.out.println("Enter the name :");
        String name=sc.nextLine();
        Contact contact=new Contact();
        contact.passengerName=name;
        System.out.println("Enter the EmailId :");
        String email=sc.nextLine();
        contact.passengerEmailId=email;
        System.out.println("Enter the phone number  :");
        long phone=sc.nextLong();
        contact.passengerPhoneNumber=phone;
        Address address=new Address();
        System.out.println("Enter the street : ");
        String street = sc.nextLine();
        address.passengerStreet=street;

        System.out.println("Enter the city : ");
        String city=sc.nextLine();
        address.passengerCity=city;

        System.out.println("Enter the State : ");
        String state=sc.nextLine();
       address.passengerState=state;
        int choice;
        System.out.println("which type of Ticket you want to book : ");
        System.out.println("1.Regular Ticket ");
        System.out.println("2.Tourist Ticket");
        choice=sc.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("You choosed to book Ticket in RegularTicket ");
                        Ticket ticket=new Ticket();
                        RegularTicket regularTicket=new RegularTicket();
                        System.out.println("Enter the Departure Place: ");
                        String departurePlace=sc.nextLine();
                        ticket.destinationPlace=departurePlace;
                        System.out.println("Enter the Boarding Place: ");
                        String sourcePlace=sc.nextLine();
                        ticket.boardingPlace=sourcePlace;
                        System.out.println("Enter the Date of Journey ");
                        String date=sc.nextLine();
                        ticket.dateOfJourney=date;
                        System.out.println("please Check the Flight details : "+DeccanAirlines.getFlightDetails());
                        System.out.println("Number if Availability of the seats : "+DeccanAirlines.availabilityOfSeats());
                        System.out.println("Do you want to book ?");
                        System.out.println("For booking press 1");
                        int booking =sc.nextInt();
                        if(booking==1) {
                            System.out.println("Select the special services  ");
                            System.out.println("NOTE: please yes or no only ");
                            System.out.println("Do you want to avail food");
                            String food = sc.nextLine();
                            regularTicket.isAvailedFood = food;
                            System.out.println("Do you want to avail snacks");
                            String snacks = sc.nextLine();
                            regularTicket.isAvailedSnacks = snacks;
                            System.out.println("Do you want to avail Water");
                            String water = sc.nextLine();
                            regularTicket.isAvailedWater = water;
                            System.out.println("Check the Details and note the pnr number for further services");
                            System.out.println(address.getAddress());
                            System.out.println(contact.getContact());
                            System.out.println("Ticket Details ");
                            System.out.println(ticket.journeyDeatails());
                            System.out.println(regularTicket.getSpecialStatus());
                            System.out.println("**********Flight Details************");
                            System.out.println(DeccanAirlines.detailsOfFlight());
                            System.out.println(ticket.getPnr());


                        }
                        else
                        {
                            System.out.println("Booking cancelled");
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("You choosed to book Ticket in TouristTicket");
                        TouristTicket touristTicket=new TouristTicket();
                        System.out.println("please Check the Flight details : "+DeccanAirlines.getFlightDetails());
                        System.out.println("Number if Availability of the seats : "+DeccanAirlines.availabilityOfSeats());
                        System.out.println("Do you want to book ?");
                        System.out.println("For booking press 1");
                        int booking =sc.nextInt();
                        if(booking==1) {
                            System.out.println("Enter the Hotel Name : ");
                            String Hotelname = sc.nextLine();
                            touristTicket.hotelName = Hotelname;
                            System.out.println("Enter the Address of the Hotel :");
                            String HotelAddress = sc.nextLine();
                            touristTicket.hotelAddress = sc.nextLine();
                            System.out.println("Enter the tourist place 1:");
                            String touristPlace1 = sc.nextLine();
                            touristTicket.touristLocation1 = touristPlace1;
                            System.out.println("Enter the tourist place 2:");
                            String touristPlace2 = sc.nextLine();
                            touristTicket.touristLocation2 = touristPlace2;
                            System.out.println("Enter the tourist place 3:");
                            String touristPlace3 = sc.nextLine();
                            touristTicket.touristLocation3 = touristPlace3;
                            System.out.println("Enter the tourist place 4:");
                            String touristPlace4 = sc.nextLine();
                            touristTicket.touristLocation4 = touristPlace4;
                            System.out.println("Enter the tourist place 5:");
                            String touristPlace5 = sc.nextLine();
                            touristTicket.touristLocation5 = touristPlace5;
                            System.out.println(touristTicket.getHotelDetails());
                            System.out.println(touristTicket.getSelectedTouristLocations());
                        }
                        else{
                            System.out.println("Booking cancelled");
                        }
                        break;
                    }
                    default:
                        System.out.println("Please choose the correct type");
                }

        System.out.println("please Check the Flight details : "+DeccanAirlines.getFlightDetails());
                System.out.println("Number if Availability of the seats : "+DeccanAirlines.availabilityOfSeats());


        //System.out.println(address.getAddress());
        //System.out.println(contact.getContact());
    }
}
