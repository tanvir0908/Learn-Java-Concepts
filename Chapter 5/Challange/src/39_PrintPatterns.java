import java.util.Scanner;

class PrintPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Pattern Printer");
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.println("\nRight Half Pyramid: ");
        rightHalfPyramid(rows);
        System.out.println("\nReverse Right Half Pyramid: ");
        reverseRightHalfPyramid(rows);
        System.out.println("\nLeft Half Pyramid: ");
        leftHalfPyramid(rows);

    }

    public static void rightHalfPyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseRightHalfPyramid(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftHalfPyramid(int rows) {
        int temp = 1;
        for (int i = rows; i > 0; i--) {
            // this row prints spaces
            for (int j = i; j > 1; j--) {
                System.out.print("  ");
            }
            // this loop prints stars
            for (int k = 0; k < temp; k++) {
                System.out.print("* ");
            }
            temp++;
            System.out.println();
        }
    }
}