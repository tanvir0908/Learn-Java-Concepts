import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Prime Number Checker");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean result = checkPrime(number);
        if (result) {
            System.out.println("This is a Prime number");
        } else {
            System.out.println("This is not a Prime number");
        }
    }

    public static boolean checkPrime(int number) {
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}