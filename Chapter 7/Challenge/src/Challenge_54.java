import java.util.Scanner;

class TernaryEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Even Odd finder using Ternary");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        boolean isEven = findIsEven(num);
        if (isEven) {
            System.out.println("This is an Even number");
        } else {
            System.out.println("This is an Odd number");
        }
    }

    public static boolean findIsEven(int num) {
        boolean isEven = num % 2 == 0 ? true : false;
        return isEven;
    }
}