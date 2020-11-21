public class RegularTicket {

    boolean isAvailedFood;
    boolean isAvailedWater;
    boolean isAvailedSnacks;
    public String getSpecialStatus(){
        return isAvailedFood+",  "+isAvailedWater+",  "+isAvailedSnacks ;
    }
}
