class SumAndAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average Calculator of and 2D Array");

        // take 2d array from user
        int[][] numbers = ArrayUtility.input2DArray();
        // display that array
        ArrayUtility.display2DArray(numbers);

        long sum = calculateSum(numbers);
        System.out.println("\nTotal sum is: " + sum);
        double average = calculateAverage(numbers, sum);
        System.out.println("The average is: " + average);
    }

    public static long calculateSum(int[][] numbers) {
        long totalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                totalSum += numbers[i][j];
            }
        }
        return totalSum;
    }

    public static double calculateAverage(int[][] numbers, long sum) {
        int totalElement = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                totalElement++;
            }
        }
        double average = (double) sum / totalElement;
        return average;
    }
}