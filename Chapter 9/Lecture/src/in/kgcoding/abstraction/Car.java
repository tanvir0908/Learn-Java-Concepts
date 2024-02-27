package in.kgcoding.abstraction;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car() {
        super(4);
    }

    @Override
    public void start() {
        System.out.println("The car is started...");
    }


}
