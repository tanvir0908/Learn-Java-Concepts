import java.util.Scanner;

class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Greatest Number Picker");

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Greatest number is: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Greatest number is: " + secondNumber);
        } else {
            System.out.println("Greatest number is: " + thirdNumber);
        }
    }
}