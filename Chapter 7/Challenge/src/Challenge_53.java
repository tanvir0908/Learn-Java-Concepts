import java.util.Scanner;

class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to maximum number finder");
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        int maxNumber = findMaxNumber(num1, num2);
        System.out.println("The maximum number is: " + maxNumber);
    }

    public static int findMaxNumber(int num1, int num2) {
        int maxNumber = num1 > num2 ? num1 : num2;
        return maxNumber;
    }
}