import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to simple interest calculator\n");

        System.out.print("Please enter your principle amount: ");
        float principle = input.nextInt();

        System.out.print("Enter your rate of interest: ");
        float rate = input.nextFloat();

        System.out.print("Enter the time period: ");
        float time = input.nextFloat();

        float interest = (principle * rate * time) / 100;
        System.out.println("\nYour simple interest is: " + interest);
    }
}
