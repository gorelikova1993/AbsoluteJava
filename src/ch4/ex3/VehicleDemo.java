package ch4.ex3;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(100, 9);

        car.addPetrol(10);
        System.out.println(car.getFuelInTank());
        car.addPetrol(30);
        System.out.println(car.driveTo());
    }
}
