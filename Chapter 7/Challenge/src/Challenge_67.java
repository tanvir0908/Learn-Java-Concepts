import java.util.Scanner;

class PrintEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = input.nextInt();

        for (int i = 0; i <= limit; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}