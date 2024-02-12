import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age > 18 && age < 60) {
            System.out.println("😎 You are allowed");
        } else if (age >= 60) {
            System.out.println("You are not allowed. You are over aged.");
        } else {
            System.out.println("You are not allowed. You are under aged.");
        }
    }
}
