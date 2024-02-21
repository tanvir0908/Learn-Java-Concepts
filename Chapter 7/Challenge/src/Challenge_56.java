import java.util.Scanner;

class CategorizeScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to number categorize system");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        categorizeScore(num);
    }

    public static void categorizeScore(int num) {
        String result = num > 80 ? "High" : (num < 50 ? "Low" : "Moderate");
        System.out.println("The number category is: " + result);
    }
}