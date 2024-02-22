import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to Prime number calculator: ");
        int number = input.nextInt();

        System.out.println("Your number is " + (primeNumberChecker(number) ? "Prime" : "Not Prime"));
    }

    public static boolean primeNumberChecker(int number) {
        for (int i = 2; i < (number / 2) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}