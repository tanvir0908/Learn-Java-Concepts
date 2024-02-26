package accessmodifier;

public class Car {
    public String color;
    public String model;

    private double fuelLevel;
    private long carPrice;

    public Car() {

    }

    public Car(String color, String model, double fuelLevel, long carPrice) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.carPrice = carPrice;
    }

    public String toString() {
        return "Car details: \nColor: " + this.color + "\nModel :" + this.model + "\nFuel: " + this.fuelLevel + "\nPrice:" + this.carPrice;
    }
}
