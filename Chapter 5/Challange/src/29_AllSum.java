import java.util.Scanner;

class AllSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Odd Limit Calculator");

        System.out.print("Enter a range from 1 to: ");
        int range = input.nextInt();

        System.out.println("The sum of all odd numbers from 1 to " + range + " is: " + oddSum(range));
    }

    public static int oddSum(int range) {
        int sum = 0;
        int i = 1;
        while (i <= range) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}