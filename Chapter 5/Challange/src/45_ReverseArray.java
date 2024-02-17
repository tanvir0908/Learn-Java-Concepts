class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse array system");

        int[] numbers = ArrayUtility.userInputArray();
        ArrayUtility.printArray(numbers);

        int[] reversedNumbers = reverseArray(numbers);
        ArrayUtility.printArray(reversedNumbers);
    }

    // without using new array
    public static int[] reverseArray(int[] numbers) {
        int middlePoint = numbers.length / 2;
        int j = numbers.length - 1;
        for (int i = 0; i < middlePoint; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            j--;
        }
        return numbers;
    }


    // using new array
//    public static int[] reverseArray(int[] numbers) {
//        int[] newNumbers = new int[numbers.length];
//        int j = 0;
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            newNumbers[j] = numbers[i];
//            j++;
//        }
//        return newNumbers;
//    }
}