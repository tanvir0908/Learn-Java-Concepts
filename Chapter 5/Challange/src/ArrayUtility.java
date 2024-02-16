import java.util.Scanner;

public class ArrayUtility {
    public static int[] userInputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int length = input.nextInt();

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Please enter element no " + (i + 1) + ": ");
            int number = input.nextInt();
            numbers[i] = number;
        }
        return numbers;
    }
}
