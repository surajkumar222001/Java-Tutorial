package Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        mountenBike mBike = new mountenBike(20, 10, 1);
        System.out.println("Gear is : " + mBike.gear);
        System.out.println("speed is : " + mBike.speed);
        System.out.println("Bike Seat height is : " + mBike.seatHeight);
        mBike.applyBreak(2);
        System.out.println("Bike speed after applying break : " + mBike.speed);
    }
}
