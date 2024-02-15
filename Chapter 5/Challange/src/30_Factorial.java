import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Factorial Calculator!");

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial can be calculated for Positive Numbers.");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }

    public static long calculateFactorial(int number) {
        if (number < 2) {
            return 1;
        }
        int i = 1;
        long factorial = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        return factorial;
    }
}