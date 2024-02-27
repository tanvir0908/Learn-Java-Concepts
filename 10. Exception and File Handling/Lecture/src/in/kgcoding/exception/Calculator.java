package in.kgcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Division Calculator");
        System.out.print("Please enter a number: ");
        int firstNumber = input.nextInt();
        System.out.print("Please enter another number: ");
        int secondNumber = input.nextInt();

        try {
            int result = firstNumber / secondNumber;
            System.out.printf("Result: %d", result);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            throw exception;
        }


    }
}
