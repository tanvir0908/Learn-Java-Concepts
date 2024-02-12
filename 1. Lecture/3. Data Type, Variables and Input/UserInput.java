import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        float age = input.nextFloat();
        System.out.print("Hello, " + name + ". You are " + age + " years old.");
    }
}
