package in.kgcoding.abstraction;

public abstract class Vehicle implements Transport {
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

    public void commute() {
        System.out.println("The vehicle is commuting...");
    }

    public abstract void start();

    @Override
    public void getSetGo() {
        System.out.println("Going to haven...");
    }
}
