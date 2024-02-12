import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        float number1 = input.nextFloat();

        System.out.print("Enter another number: ");
        float number2 = input.nextFloat();

        System.out.println("The product of " + number1 + " and " + number2 + " is " + (number1 * number2));
    }
}
