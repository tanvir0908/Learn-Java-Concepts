import java.util.Scanner;

public class AllArithmaticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = input.nextInt();

        System.out.print("Enter another number: ");
        int number2 = input.nextInt();

        System.out.println("The summation of " + number1 + " and " + number2 + " is " + (number1 + number2));
        System.out.println("The subtraction of " + number1 + " and " + number2 + " is " + (number1 - number2));
        System.out.println("The multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2));
        System.out.println("The division of " + number1 + " and " + number2 + " is " + ((float) number1 / number2));
        System.out.println("The modulus of " + number1 + " and " + number2 + " is " + (number1 % number2));
    }
}
