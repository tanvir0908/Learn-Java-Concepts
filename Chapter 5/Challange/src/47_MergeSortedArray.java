class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to two sorted array merging system");

        int[] numbers1 = ArrayUtility.userInputArray();
        ArrayUtility.printArray(numbers1);
        System.out.println("\n");
        int[] numbers2 = ArrayUtility.userInputArray();
        ArrayUtility.printArray(numbers2);
        System.out.println("\n");

//        int[] mergedNumbers = mergingArrays(numbers1, numbers2);
//        System.out.println("Your merged array");
//        ArrayUtility.printArray(mergedNumbers);

        mergingArrays(numbers1, numbers2);
    }

    public static void mergingArrays(int[] numbers1, int[] numbers2) {
        int newLength = (numbers1.length) + (numbers2.length);
        int[] newNumbers = new int[newLength];

        int i = 0, j = 0, k = 0;
        while (i < numbers1.length || j < numbers2.length) {
            if (j == numbers2.length || (i < numbers1.length && numbers1[i] < numbers2[j])) {
                newNumbers[k] = numbers1[i];
                i++;
                k++;
            } else {
                newNumbers[k] = numbers2[j];
                j++;
                k++;
            }
        }

        ArrayUtility.printArray(newNumbers);
    }
}