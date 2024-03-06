package challenge97;

public class TestingDays {
    public static void main(String[] args) {
        System.out.println("Printing all days: ");
        for (WeekDays day : WeekDays.values()) {
            System.out.printf("%s: %s", day, day.getType());
        }
    }
}
