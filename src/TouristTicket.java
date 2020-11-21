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

    public void setTouristLocation1(String touristLocation1) {
        this.touristLocation1 = touristLocation1;
    }

    public void setTouristLocation2(String touristLocation2) {
        this.touristLocation2 = touristLocation2;
    }

    public void setTouristLocation3(String touristLocation3) {
        this.touristLocation3 = touristLocation3;
    }

    public void setTouristLocation4(String touristLocation4) {
        this.touristLocation4 = touristLocation4;
    }

    public void setTouristLocation5(String touristLocation5) {
        this.touristLocation5 = touristLocation5;
    }
}
