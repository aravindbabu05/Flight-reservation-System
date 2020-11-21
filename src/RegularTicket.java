public class RegularTicket {

    String isAvailedFood;
    String isAvailedWater;
    String isAvailedSnacks;
    public String getSpecialStatus(){
        return isAvailedFood+",  "+isAvailedWater+",  "+isAvailedSnacks ;
    }
}
