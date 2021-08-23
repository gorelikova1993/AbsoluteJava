package ch4.ex3;

public class Vehicle {
    private int tankSize; //to store the initial size of the tank
    private int fuelInTank = 0; //store the initial amount of fuel in a tank
    private int initEfficiency; //расход топлива

    public Vehicle(int tankSize) {
        this.tankSize = tankSize;
    }

    public Vehicle(int tankSize, int initEfficiency) {
        this.tankSize = tankSize;
        this.initEfficiency = initEfficiency;
    }

    public Vehicle(int tankSize, int fuelInTank, int initEfficiency) {
        this.tankSize = tankSize;
        this.fuelInTank = fuelInTank;
        this.initEfficiency = initEfficiency;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    public void setFuelInTank(int fuelInTank) {
        this.fuelInTank = fuelInTank;
    }

    public void setInitEfficiency(int initEfficiency) {
        this.initEfficiency = initEfficiency;
    }

    public int getTankSize() {
        return tankSize;
    }

    public int getFuelInTank() {
        return fuelInTank;
    }

    public int getInitEfficiency() {
        return initEfficiency;
    }
    public void addPetrol(int petrol){
        if(petrol+fuelInTank<tankSize){
            fuelInTank = fuelInTank + petrol;
        }
        else {
            System.out.println("Too much petrol!\nYou can add " + (tankSize-fuelInTank));

        }
         }
        public int driveTo(){
            return fuelInTank/initEfficiency;
        }

}
