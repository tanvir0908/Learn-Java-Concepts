import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter the value of " + (i + 1) + " element: ");
            int value = input.nextInt();
            numbers[i] = value;
        }
        return numbers;
    }

    public static void displayArray(int[] numbers) {
        System.out.println("Your entered array is: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
