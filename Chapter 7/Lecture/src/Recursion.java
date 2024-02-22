import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Factorial Calculator using Recursion");
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println("The factorial is: " + factorial);
    }

    public static long calculateFactorial(int number) {
        System.out.println("Function called for: " + number);
        if (number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}
