import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Grade Calculator");

        System.out.print("Enter your marks: ");
        float marks = input.nextFloat();

        if (marks >= 90) {
            System.out.println("You got A");
        } else if (marks >= 75) {
            System.out.println("You got B");
        } else if (marks >= 60) {
            System.out.println("You got C");
        } else if (marks >= 30) {
            System.out.println("You got D");
        } else {
            System.out.println("You got F");
        }
    }
}