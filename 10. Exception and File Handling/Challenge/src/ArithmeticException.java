import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Division Calculator");
        try {
            System.out.print("Please enter the first number: ");
            int first = input.nextInt();
            System.out.print("Please enter the second number: ");
            int second = input.nextInt();
            int division = first / second;
            System.out.println("The result is: " + division);
        } catch (Exception e) {
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("Divide by 0 occurred. Please enter a valid number.");
            } else {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }
    }
}
