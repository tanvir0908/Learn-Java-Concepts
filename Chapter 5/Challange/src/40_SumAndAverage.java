import java.util.Arrays;
import java.util.Scanner;

class SumAndAverage {
    public static void main(String[] args) {

        System.out.println("Welcome to Array Sum and Average Calculator");

        // Take array length and the array from the user from another class
        int[] numbers = ArrayUtility.userInputArray();

        // Call calculate sum function to find the total sum of the elements
        long sum = calculateSum(numbers);
        System.out.println("The sum of the elements is: " + sum);

        // Call average function to find the average of the elements
        double average = calculateAverage(numbers, sum);
        System.out.println("The average of the elements is: " + average);
    }

    public static long calculateSum(int[] numbers) {
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static double calculateAverage(int[] numbers, long sum) {
        double average = (double) sum / numbers.length;
        return average;
    }
}