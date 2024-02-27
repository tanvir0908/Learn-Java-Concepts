package in.kgcoding.polymorphism;

public abstract class Vehicle {
    private int numberOfTires;

    public Vehicle() {
        this.numberOfTires = 0;
    }

    public Vehicle(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfTires() {
        return this.numberOfTires;
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}
