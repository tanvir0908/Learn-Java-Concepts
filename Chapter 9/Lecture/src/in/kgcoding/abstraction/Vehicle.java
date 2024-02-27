package in.kgcoding.abstraction;

public abstract class Vehicle {
    private int numberOfTires;

    public Vehicle(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void start() {
        System.out.println("The vehicle is started...");
    }
}
