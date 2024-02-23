public class Car {
    int noOfWheels;
    int numberOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String manufacturer;

    Car(int noOfWheels, int numberOfDoors, int maxSpeed, String name, String modelNumber, String manufacturer) {
        this.noOfWheels = noOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", numberOfDoors=").append(numberOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", manufacturer='").append(manufacturer).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Car swift = new Car(4, 4, 120, "Swift", "SW809", "Maruti");

        System.out.println(swift);
    }
}
