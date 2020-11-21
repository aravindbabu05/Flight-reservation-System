public class TouristTicket {

String hotelName;
String hotelAddress;

String touristLocation1;
    String touristLocation2;
    String touristLocation3;
    String touristLocation4;
    String touristLocation5;

String getHotelDetails(){
    return "Name of the Hotel: "+hotelName+"  Address of the Hotel :"+hotelAddress;
}
String getSelectedTouristLocations(){
    System.out.println("Below are the selected places to visit by the tourist");
    return touristLocation1+" , "+touristLocation2+" , "+touristLocation3+" ,"+touristLocation4+" , "+touristLocation5;
}




}
