package ch1;

public class VehicleAvgSpeed {
    public static final double DISTANCE = 180;

    public static void main(String[] args) {
        double time = 20.5;
        System.out.println("This program calculates vehicle average speed given a time and distance traveled.");
        double average_speed = VehicleAvgSpeed.DISTANCE/time;
        System.out.println("Car average speed is " + average_speed
                + " miles per hour.");
    }
}
