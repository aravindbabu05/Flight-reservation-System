import java.util.Scanner;

public class Mian {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        Contact contact=new Contact();
        System.out.println("Enter the name :");
        String name=sc.nextLine();
        contact.passengerName=name;
        System.out.println("Enter the EmailId :");
        String email=sc.nextLine();
        contact.passengerEmailId=email;
        System.out.println("Enter the phone number  :");
        long phone=sc.nextLong();
        contact.passengerPhoneNumber=phone;
        Address address=new Address();
        System.out.println("Enter the street : ");
        String street=sc.nextLine();
        address.passengerStreet=street;

        System.out.println("Enter the city : ");
        String city=sc.nextLine();
        address.passengerCity=city;

        System.out.println("Enter the State : ");
        String state=sc.nextLine();
        address.passengerState=state;
        System.out.println(address.getAddress());
        System.out.println(contact.getContact());
    }
}
