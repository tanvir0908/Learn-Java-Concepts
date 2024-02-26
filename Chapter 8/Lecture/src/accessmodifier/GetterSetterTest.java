package accessmodifier;

import gettersetter.Car;

public class GetterSetterTest {
    public static void main(String[] args) {
        Car newCar = new Car("Red", "Audi", 3, 4000);
        System.out.printf("%s %s", newCar.getColor(), newCar.getModel());
    }
}
