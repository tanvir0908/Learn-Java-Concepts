import java.util.Scanner;

class MaxValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter the value of " + (i + 1) + " element: ");
            int value = input.nextInt();
            numbers[i] = value;
        }

        System.out.println("Your entered array is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        int maxValue = findMaxValue(numbers);
        System.out.println("\n\nThe maximum value in the array is: " + maxValue);
    }

    public static int findMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int number : numbers) {
            if (maxValue < number) {
                maxValue = number;
            }
        }
        return maxValue;
    }
}