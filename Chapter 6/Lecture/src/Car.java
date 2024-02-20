public class Car {
    // Class properties / Instance variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    Car() {
        this("Black");
    }

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 250;
        currentFuelInLiters = 2;
        noOfSeats = 7;
    }


    // Class methods / Instance methode
    public void start() {
        if (this.currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel, please refuel to start.");
        } else if (this.currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel immediately.");
        } else {
            System.out.println("Car is started...");
        }
    }

    public void drive() {
        System.out.println("Car is driving...");
        currentFuelInLiters--;
    }

    public void addFuel(float fuel) {
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
