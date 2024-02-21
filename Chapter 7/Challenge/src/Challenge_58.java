import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator");
        System.out.print("Please enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter another number: ");
        int num2 = input.nextInt();

        System.out.print("1. +\n2. -\n3. * \n4. /\nPlease enter the arithmetic operator: ");
        String operator = input.next();

        int result = simpleCalculator(num1, num2, operator);
        System.out.println("Result: " + result);
    }

    public static int simpleCalculator(int num1, int num2, String operator) {
        int result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0;
        };
        return result;
    }
}