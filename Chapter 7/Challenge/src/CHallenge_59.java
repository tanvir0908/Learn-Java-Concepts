import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Password Checker");
        String password;
        do {
            System.out.print("Please enter your password: ");
            password = input.nextLine();
        } while (password.length() < 8);
        System.out.println("Your password is: " + password);
    }
}