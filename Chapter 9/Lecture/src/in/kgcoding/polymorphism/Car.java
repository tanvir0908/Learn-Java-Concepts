package in.kgcoding.polymorphism;

public class Car extends Vehicle {

    Car() {
        super();
    }

    Car(int numberOfTires) {
        super(numberOfTires);
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}
