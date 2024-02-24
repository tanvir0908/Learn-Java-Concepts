import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Guessing Game");
        int randomNumber = (int) Math.round(Math.random() * 100);
        while (true) {
            System.out.print("Please enter your guessed number: ");
            int number = input.nextInt();
            if (number > randomNumber) {
                System.out.println("Your guess lower number");
            } else if (number < randomNumber) {
                System.out.println("Your guess higher number");
            } else {
                System.out.println("🎉 Congratulation! You guessed the correct number.");
                break;
            }
        }
    }
}