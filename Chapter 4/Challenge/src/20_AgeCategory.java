import java.util.Scanner;

class AgeCategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Find Your Age Category");

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 13) {
            System.out.println("Age Category: Child");
        } else if (age < 20) {
            System.out.println("Age Category: Teen");
        } else if (age < 60) {
            System.out.println("Age Category: Adult");
        } else {
            System.out.println("Age Category: Senior");
        }
    }
}