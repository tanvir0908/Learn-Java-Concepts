import java.util.Scanner;

public class ArrayUtility {
    //    input 1d array
    public static int[] userInputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int length = input.nextInt();

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Please enter element no " + (i + 1) + ": ");
            int number = input.nextInt();
            numbers[i] = number;
        }
        return numbers;
    }

    //    input 2d array
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter array row number: ");
        int row = input.nextInt();
        System.out.print("Please enter array column number: ");
        int column = input.nextInt();

        System.out.println();

        int[][] numbers = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the value of " + (i + 1) + " no row and " + (j + 1) + " no column: ");
                int value = input.nextInt();
                numbers[i][j] = value;
            }
        }
        return numbers;
    }

    //    display 1d array
    public static void printArray(int[] numbers) {
        System.out.println("\nYour array is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    //    display 2d array
    public static void display2DArray(int[][] numbers) {
        int length = numbers.length;
        System.out.println("Your array is: ");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
