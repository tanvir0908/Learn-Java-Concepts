package accessmodifier;

public class AccessTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.model = "Swift";
        System.out.println(car1);

        Car car2 = new Car("Black", "BMW", 5, 12000);
        System.out.println(car2);
    }
}
