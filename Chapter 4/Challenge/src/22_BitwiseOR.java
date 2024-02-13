import java.util.Scanner;

class BitwiseOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        int result = num1 | num2;
        System.out.println("The result is: " + result);
    }
}
