import java.util.Scanner;

class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to GCD Calculator");
        System.out.print("Please enter a number: ");
        int number1 = input.nextInt();
        System.out.print("Please enter another number: ");
        int number2 = input.nextInt();

        int greatestCommonDivisor = GCD(number1, number2);
        System.out.println("The Greatest Common Divisor: " + greatestCommonDivisor);
    }

    public static int GCD(int number1, int number2) {
        int greatestCommonDivisor = 0;
        int i = 1;
        int least = leastNumber(number1, number2);
        while (i <= least) {
            if (number1 % i == 0 && number2 % i == 0) {
                greatestCommonDivisor = i;
            }
            i++;
        }
        return greatestCommonDivisor;
    }

    public static int leastNumber(int number1, int number2) {
        if (number1 == number2) {
            return number1;
        } else if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }
}