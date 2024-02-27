package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle newVehicle = new Vehicle();
        newVehicle.setNumberOfTires(4);
        System.out.println(newVehicle.toString());
        System.out.println(newVehicle.hashCode());
        System.out.println(newVehicle.getClass());
        newVehicle.commute();

        TwoWheeler bike = new TwoWheeler();
        bike.setNumberOfTires(2);
        bike.commute();
    }
}
