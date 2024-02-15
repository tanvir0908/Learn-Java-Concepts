import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Multiplication Table");

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        multiplicationTable(number);
    }

    public static void multiplicationTable(int number) {
        int range = 1;
        System.out.println("\nMultiplication Table of: " + number);
        while (range <= 10) {
            System.out.println(number + " x " + range + " = " + (range * number));
            range++;
        }
    }
}