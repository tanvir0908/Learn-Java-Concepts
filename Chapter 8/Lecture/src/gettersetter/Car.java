package gettersetter;

public class Car {
    private String color;
    private String model;
    private double fuelLevel;
    private long carPrice;

    public Car(String color, String model, double fuelLevel, long carPrice) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.carPrice = carPrice;
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }
}
