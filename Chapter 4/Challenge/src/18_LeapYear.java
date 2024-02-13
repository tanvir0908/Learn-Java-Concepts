import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Leap Year Calculator");

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println("This year is a leap year");
        } else if (year % 4 != 0 || year % 100 == 0) {
            System.out.println("This year is not a leap year.");
        } else {
            System.out.println("This year is a leap year");
        }
    }
}