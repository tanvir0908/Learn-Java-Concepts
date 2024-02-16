import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int[][] newArr = new int[2][2];
        int[][] newMyArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};

//        for (int i = 0; i < newMyArr.length; i++) {
//            for (int j = 0; j < newMyArr.length; j++) {
//                System.out.print("Enter a number: ");
//                int number = input.nextInt();
//                newMyArr[i][j] = number;
//            }
//        }
        System.out.println("\nYour array is: ");
        for (int i = 0; i < newMyArr.length; i++) {
            for (int j = 0; j < newMyArr[i].length; j++) {
                System.out.print(newMyArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
