import java.util.Scanner;

class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Palindrome Checker");
        System.out.print("Enter your text: ");
        String userInput = input.nextLine();

        System.out.println("Your text is: " + (palindromeCheckerUsingRecursion(userInput) ? "Palindrome" : "Not Palindrome"));
    }

    public static boolean palindromeCheckerUsingRecursion(String userInput) {
        if (userInput.length() <= 1) {
            return true;
        }
        if (userInput.charAt(0) != userInput.charAt(userInput.length() - 1)) {
            return false;
        }
        String newUserInput = userInput.substring(1, userInput.length() - 1);
        return palindromeCheckerUsingRecursion(newUserInput);
    }
}