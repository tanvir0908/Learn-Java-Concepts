public class Driver {
    static String policeName = "Tanvir";
    String name;
    int age;

    public boolean isAllowedToDrive() {
        return this.age >= 18;
    }

    public static void main(String[] args) {
        Car audi = new Car("Yellow");
        Car thar = new Car();
        audi.start();
        audi.drive();
        System.out.println("Audi color: " + audi.color);
        System.out.println("Thar color: " + thar.color);
//        Driver myDriver = new Driver();
//        System.out.println(Driver.policeName);
    }
}
