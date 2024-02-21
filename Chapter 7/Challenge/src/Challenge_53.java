import java.util.Scanner;

class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to maximum number finder");
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        int minNumber = findMinNumber(num1, num2);
        System.out.println("The maximum number is: " + minNumber);
    }

    public static int findMinNumber(int num1, int num2) {
        int minNumber = num1 < num2 ? num1 : num2;
        return minNumber;
    }
}