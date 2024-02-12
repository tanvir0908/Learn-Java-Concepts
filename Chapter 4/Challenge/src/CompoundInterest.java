import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nCompound interest calculator\n");

        System.out.print("Enter your principle amount: ");
        float amount = input.nextFloat();
        System.out.print("Enter your interest rate: ");
        float rate = input.nextFloat();
        System.out.print("Enter time period: ");
        float time = input.nextFloat();

        double compoundInterest = amount * Math.pow((1 + rate / 100), time);
        System.out.println("Your compound interest is: " + compoundInterest);
    }
}
