import java.util.Scanner;

class FindAbsolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to absolute number finder");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int absoluteNumber = findAbsoluteNumber(num);
        System.out.println("Absolute number is: " + absoluteNumber);
    }

    public static int findAbsoluteNumber(int num) {
        int absoluteNumber = num < 0 ? num * -1 : num;
        return absoluteNumber;
    }
}