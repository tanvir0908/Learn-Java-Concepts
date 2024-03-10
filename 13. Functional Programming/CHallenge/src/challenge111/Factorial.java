package challenge111;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Factorial Calculator");

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        // using structural programming
        int structuralFact = 1;
        for (int i = 1; i <= number; i++) {
            structuralFact *= i;
        }
        System.out.printf("Factorial of %d is: %d", number, structuralFact);

        // using functional programming
        int functionalFact = IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
        System.out.printf("\nFactorial of %d is %d", number, functionalFact);
    }
}
