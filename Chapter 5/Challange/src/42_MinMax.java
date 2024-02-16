class MinMax {
    public static void main(String[] args) {
        System.out.println("Welcome to Min Max Calculator");

        int[] numbers = ArrayUtility.userInputArray();

    if(numbers.length != 0){
        int minNumber = findMin(numbers);
        System.out.println("The minimum number is: " + minNumber);
        int maxNumber = findMax(numbers);
        System.out.println("The maximum number is: " + maxNumber);
    }else{
        System.out.println("Calculating min max is not possible in empty array");
    }
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}