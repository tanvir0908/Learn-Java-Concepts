import java.util.Scanner;

class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Element Searching\n");

//        take 2d array input from user
        int[][] numbers = ArrayUtility.input2DArray();
//        display 2d array
        ArrayUtility.display2DArray(numbers);

        System.out.print("\nEnter the value you want to search: ");
        int search = input.nextInt();
        boolean isFound = isFound(numbers, search);
        if (isFound) {
            System.out.println("✅ The value is found in the array");
        } else {
            System.out.println("⛔ The value is not found in the array");
        }
    }

    //    Find element from an array
    public static boolean isFound(int[][] numbers, int search) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == search) {
                    return true;
                }
            }

        }
        return false;
    }
}