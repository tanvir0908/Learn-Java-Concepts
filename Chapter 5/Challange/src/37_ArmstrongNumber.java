import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("Armstrong Number Checker");

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        if (isArmstrong(number)) {
            System.out.println("This is an Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int number) {
        int armstrongNumber = 0;
        int numCopy = number;
        int digitCount = digitCounter(number);
        while (number > 0) {
            int digit = number % 10;
            armstrongNumber += (int) Math.pow(digit, digitCount);
            number /= 10;
        }


        return armstrongNumber == numCopy;
    }

    public static int digitCounter(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}