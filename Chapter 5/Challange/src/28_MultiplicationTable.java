import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        greetUser();
        int number = userInput();
        multiplicationTable(number);
    }

    public static void greetUser() {
        System.out.println("Welcome to Multiplication Table");
    }

    public static int userInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        return number;
    }

    public static void multiplicationTable(int number) {
        int range = 0;
        System.out.println("\nMultiplication Table of: " + number);
        while (range <= 10) {
            System.out.println(number + " * " + range + " = " + (range * number));
            range++;
        }
    }
}