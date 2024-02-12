import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Leap Year Calculator");

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            System.out.println("Result: Leap Year");
        } else {
            System.out.println("Result: Not Leap Year");
        }
    }
}