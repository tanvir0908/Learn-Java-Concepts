class PositiveSum {
    public static void main(String[] args) {
        // Take input from user
        int[] numbers = ArrayUtility.inputArray();
        // Display user entered input
        ArrayUtility.displayArray(numbers);

        System.out.println("\nThe sum of all positive numbers is: " + allPositiveSum(numbers));
    }

    public static int allPositiveSum(int[] numbers) {
        int positiveSum = 0;
        for (int number : numbers) {
            if (number < 0) {
                continue;
            }
            positiveSum += number;
        }
        return positiveSum;
    }
}