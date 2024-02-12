import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Ticket Discount Calculator");

        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.print("\nSelect gender: \n1. Male\n2. Female\nPlease select your gender: ");
        int gender = input.nextInt();

        if (age < 5) {
            System.out.println("You got 75% discount");
        } else if (gender == 2) {
            System.out.println("You got 50% discount");
        } else if (age > 60 && gender == 1) {
            System.out.println("You got 25% discount");
        } else {
            System.out.println("You got no discount");
        }
    }
}
