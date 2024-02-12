import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 5;

        int input1 = input.nextInt();
        number += input1;
        System.out.println(number);

        int input2 = input.nextInt();
        number += input2;
        System.out.println(number);

        int input3 = input.nextInt();
        number += input3;
        System.out.println(number);

        int input4 = input.nextInt();
        number += input4;
        System.out.println(number);
    }
}
