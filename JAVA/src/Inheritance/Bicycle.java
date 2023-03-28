package Inheritance;

public class Bicycle {
    protected int speed,gear ;
    
    
    public Bicycle(int startSpeed , int startGear){
        this.speed=startSpeed;
        this.gear = startGear;
    }

    public void setGear(int newValue){
        this.gear = newValue;
     }

    public void applyBreak(int decrese){
         speed -= decrese;
     }

    public void speedUp(int increament){
           speed += increament;
     }

}
