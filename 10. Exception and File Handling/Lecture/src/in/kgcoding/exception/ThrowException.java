package in.kgcoding.exception;

import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age");
        }
    }
}
