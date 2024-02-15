import java.util.Scanner;

class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Reverse Digits");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int reverseNumber = reverse(number);
        System.out.println("Reverse number is: " + reverseNumber);
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number > 0) {
            int temp = number % 10;
            reverseNumber = (reverseNumber * 10) + temp;
            number /= 10;
        }

        return reverseNumber;
    }
}