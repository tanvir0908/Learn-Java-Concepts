import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Sum of Digits Calculator");

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int digitsSum = sumOfDigits(number);
        System.out.println("The Sum of Digits of " + number + " is: " + digitsSum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}