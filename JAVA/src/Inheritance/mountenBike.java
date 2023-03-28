package Inheritance;

public class mountenBike extends Bicycle {
    int seatHeight ;
    public mountenBike(int startSpeed, int startGear,int seatHeight) {
        super(startSpeed, startGear);
        this.seatHeight = seatHeight ; 
    }

    public void setHeight(int newValue){
       seatHeight = newValue ; 
    }
    
    

    public static void main(String[] args) {
        
    }
}
