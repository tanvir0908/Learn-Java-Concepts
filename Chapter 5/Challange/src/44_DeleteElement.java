import java.util.Scanner;

class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = ArrayUtility.userInputArray();
        ArrayUtility.printArray(numbers);

        System.out.print("\n\nEnter the number you want to delete: ");
        int deleteNumber = input.nextInt();

        int[] newNumbers = deleteElement(numbers, deleteNumber);
        ArrayUtility.printArray(newNumbers);
    }


    public static int[] deleteElement(int[] numbers, int deleteNumber) {
        int[] newNumbers = new int[numbers.length-1];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != deleteNumber) {
                newNumbers[j] = numbers[i];
                j++;
            }
        }
        return newNumbers;
    }
}