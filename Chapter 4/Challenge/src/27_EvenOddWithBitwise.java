import java.util.Scanner;

class EvenOddWithBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Even Odd Number Checker");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result = number & 1;
        if (result == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
