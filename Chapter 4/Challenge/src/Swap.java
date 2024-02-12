import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station!\n");
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        // Swapping steps
        int tempNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = tempNumber;

        System.out.println("\nNumber swapped completed.");
        System.out.println("First number: " + firstNumber + "\nSecond number: " + secondNumber);
    }
}
