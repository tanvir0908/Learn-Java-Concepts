import java.util.Scanner;

class NumberOfOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Number of Occurrences Calculator");

        int[] numbers = ArrayUtility.userInputArray();

        System.out.print("Enter the number you want to find: ");
        int target = input.nextInt();

        int occurrences = findOccurrences(numbers, target);
        System.out.println("The number of occurrences is: " + occurrences);
    }

    public static int findOccurrences(int[] numbers, int target) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }
        return count;
    }
}