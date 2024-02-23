import java.util.Scanner;

class FindOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take array from user
        int[] numbers = ArrayUtility.inputArray();
        // Display user entered array
        ArrayUtility.displayArray(numbers);

        System.out.print("\n\nEnter the number you want to find occurrences: ");
        int findNumber = input.nextInt();

        int count = 0;
        for (int number : numbers) {
            if (number == findNumber) {
                count++;
            }
        }
        System.out.println("The occurrence number is: " + count);
    }
}