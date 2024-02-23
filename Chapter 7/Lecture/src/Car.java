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
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", numberOfDoors=" + numberOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car swift = new Car(4, 4, 120, "Swift", "SW809", "Maruti");

        System.out.println(swift);
    }
}
