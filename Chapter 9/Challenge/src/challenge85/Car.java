package challenge85;

public class Car extends Vehicle {
    @Override
    public void service() {
        super.service();
        System.out.println("This is Car service");
    }
}
