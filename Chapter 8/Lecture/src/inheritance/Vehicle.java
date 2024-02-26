package inheritance;

class Vehicle {
    public int numberOfTires;

    void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void commute() {
        System.out.printf("I am going from place A to place B using %d tires.\n", numberOfTires);
    }


}
