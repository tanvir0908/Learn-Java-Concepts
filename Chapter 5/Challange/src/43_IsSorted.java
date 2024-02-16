class IsSorted {
    public static void main(String[] args) {
        System.out.println("Welcome to sorted array checker");

        int[] numbers = ArrayUtility.userInputArray();
        boolean increaseSort = isSortedIncrease(numbers);
        boolean decreaseSort = isSortedDecrease(numbers);
        if (increaseSort || decreaseSort) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }

    public static boolean isSortedIncrease(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDecrease(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }
}