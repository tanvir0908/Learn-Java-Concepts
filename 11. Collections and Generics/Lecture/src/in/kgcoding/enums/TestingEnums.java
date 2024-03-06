package in.kgcoding.enums;

public class TestingEnums {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light);
        }
    }
}
