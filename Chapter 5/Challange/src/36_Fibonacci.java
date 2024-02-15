import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series");
        System.out.print("Enter a limit: ");
        int limit = input.nextInt();
        fibonacci(limit);
    }

    public static void fibonacci(int limit) {
        if (limit <= 0) {
            return;
        } else if (limit == 1) {
            System.out.println("0");
            return;
        }
        int firstNumber = 0, secondNumber = 1;
        System.out.print(firstNumber + " " + secondNumber);
        while (firstNumber + secondNumber < limit) {
            int thirdNumber = firstNumber + secondNumber;
            System.out.print(" " + thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;

        }

    }
}