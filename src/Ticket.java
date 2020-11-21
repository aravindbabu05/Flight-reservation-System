public class Ticket {
    private int pnr=1098;
    String destinationPlace;
    String boardingPlace ;
    String dateOfJourney ;
    public String journeyDeatails(){
        return  "Destination Place: "+ destinationPlace+" , "+" Boarding Place: "+ boardingPlace+" , "+"Date of journey : "+dateOfJourney;
    }
    public int getPnr()
    {
        pnr++;
        return pnr;
    }



}
