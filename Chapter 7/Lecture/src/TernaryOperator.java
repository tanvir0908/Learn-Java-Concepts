import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to greater number checker.");

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();


        // using ternary operator


        // using if statement
//        int greaterNumber = 0;
//        if (num1 > num2) {
//            greaterNumber = num1;
//        } else {
//            greaterNumber = num2;
//        }

        int greaterNumber = (num1 > num2) ? num1 : num2;

        System.out.println("Greater number is: " + greaterNumber);
    }
}
