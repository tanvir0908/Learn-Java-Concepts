import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greetUser();

        int num1 = userInput();
        int num2 = userInput();

        // sum function
        int sum = sum(num1, num2);
        System.out.println("The sum is: " + sum);
    }

    public static void greetUser() {
        System.out.println("Welcome to Simple Calculator");
    }

    public static int userInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return input.nextInt();
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

}
