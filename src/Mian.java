import java.util.Scanner;

public class Mian {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

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

                        break;
                    }
                    case 2: {
                        System.out.println("You choosed to book Ticket in TouristTicket");
                        break;
                    }
                    default:
                        System.out.println("Please choose the correct type");
                }
                Flight DeccanAirlines=new Flight( 2048,"Deccan Airlines",30);
                System.out.println("please Check the Flight detrails : "+DeccanAirlines.getFlightDetails());
                System.out.println("Number if Availability of the seats : "+DeccanAirlines.availabilityOfSeats());


        //System.out.println(address.getAddress());
        //System.out.println(contact.getContact());
    }
}
