import java.util.Scanner;

class MaxValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take array as user input
        int[] numbers = ArrayUtility.inputArray();
        // Display user entered array
        ArrayUtility.displayArray(numbers);

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