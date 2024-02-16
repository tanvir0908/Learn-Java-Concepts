import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Searching");
        int[] arr = {18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        System.out.print("Enter a num: ");
        int num = input.nextInt();

        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Element Found!");
        } else {
            System.out.println("🍁 Element Not Found.");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
