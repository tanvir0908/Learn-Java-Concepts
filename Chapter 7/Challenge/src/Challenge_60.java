import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        System.out.println("Welcome to the Guessing Game");
        int number = 5;
        int guessedNumber;
        do {
            System.out.print("Please enter a number between 0 and 10: ");
            guessedNumber = input.nextInt();
            if (guessedNumber > number) {
                System.out.println("You guessed too big number");
            } else if (guessedNumber < number) {
                System.out.println("You guessed too small number");
            } else {
                break;
            }
        } while (true);
        System.out.println("Congratulation! You guessed the correct number.");
    }
}