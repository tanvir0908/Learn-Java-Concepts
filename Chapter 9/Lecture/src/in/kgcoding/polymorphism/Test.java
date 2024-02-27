package in.kgcoding.polymorphism;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        Plain plain1 = new Plain();

        castTest(car1);
        castTest(plain1);
    }

    private static void castTest(Vehicle vehicle) {
        vehicle.start();
    }
}
