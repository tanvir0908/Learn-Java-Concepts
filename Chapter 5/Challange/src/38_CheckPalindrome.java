import java.util.Scanner;

class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to The Palindrome Checker");

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        if (palindrome(number)) {
            System.out.println("👍🏻 This is a Palindrome number");
        } else {
            System.out.println("👎🏻 This number is not a Palindrome number");
        }
    }

    public static boolean palindrome(int number) {
        int numberCopy = number;
        int palindromeNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            palindromeNumber = palindromeNumber * 10;
            palindromeNumber = palindromeNumber + digit;
            number = number / 10;
        }
        return numberCopy == palindromeNumber;
    }
}