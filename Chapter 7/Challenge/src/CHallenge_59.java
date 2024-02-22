import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Password Checker");
        String password;

        do {
            System.out.print("Please enter a password: ");
            password = input.nextLine();
        } while (!passwordChecker(password));
        System.out.println("Thank you for entering a valid password!");
    }

    public static boolean passwordChecker(String password) {
        return password.length() >= 6;
    }
}