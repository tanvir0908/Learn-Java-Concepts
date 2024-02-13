import java.util.Scanner;

class BitwiseNOT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        int result = ~num1;
        System.out.println("The result is: " + result);
    }
}
