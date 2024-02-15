import java.util.Scanner;

class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to LCM Calculator");
        System.out.print("Please enter a number: ");
        int number1 = input.nextInt();
        System.out.print("Please enter another number: ");
        int number2 = input.nextInt();

        int leastCommonMultiple = LCM(number1, number2);
        System.out.println("The Least Common Multiple is: " + leastCommonMultiple);
    }

    public static int LCM(int number1, int number2) {
        int leastCommonMultiple = 0;

        int i = 1;
        while (true) {
            if ((number1 * i) % number2 == 0) {
                leastCommonMultiple = number1 * i;
                return leastCommonMultiple;
            }
            i++;
        }
    }
}