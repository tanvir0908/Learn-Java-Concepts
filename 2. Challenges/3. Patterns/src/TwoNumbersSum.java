import java.util.Scanner;

public class TwoNumbersSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to basic calculator");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
