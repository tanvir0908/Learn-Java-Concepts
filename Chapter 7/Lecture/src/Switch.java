import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to day finder");
        System.out.print("Enter a number from 1 to 7: ");
        int day = input.nextInt();

        newSwitch(day);
        // oldSwitch(day);
    }

    public static void newSwitch(int day) {
        String dayName = switch (day) {
            case 1 -> "This is Monday";
            case 2 -> "This is Tuesday";
            case 3 -> "This is Wednesday";
            case 4 -> "This is Thursday";
            case 5 -> "This is Friday";
            case 6, 7 -> "This is Holiday";
            default -> "Invalid input";
        };
        System.out.println(dayName);
    }

    // using old switch
    public static void oldSwitch(int day) {
        switch (day) {
            case (1):
                System.out.println("This is Monday");
                break;
            case (2):
                System.out.println("This is Tuesday");
                break;
            case (3):
                System.out.println("This is Wednesday");
                break;
            case (4):
                System.out.println("This is Thursday");
                break;
            case (5):
                System.out.println("This is Friday");
                break;
            case (6):
                System.out.println("This is Saturday");
                break;
            case (7):
                System.out.println("This is Sunday");
                break;
            default:
                System.out.println("Invalid number!");
        }
    }
}
