import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Fibonacci Series Printer");
        System.out.print("Enter the limit of the series: ");
        int limit = input.nextInt();

        System.out.println("\nFibonacci Iterative: ");
        fibonacciIterative(limit);

        System.out.println("\n\nFibonacci Recursive: ");
        for (int i = 1; i <= limit; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }

    // Iterative method
    public static void fibonacciIterative(int limit) {
        int first = 0, second = 1;
        for (int i = 0; i < limit; i++) {
            System.out.print(first + " ");
            int sum = first + second;
            first = second;
            second = sum;
        }
    }

    // Recursion method
    public static int fibonacciRecursive(int limit) {
        if (limit == 1) {
            return 0;
        }
        if (limit == 2) {
            return 1;
        }
        return fibonacciRecursive(limit - 1) + fibonacciRecursive(limit - 2);
    }
}