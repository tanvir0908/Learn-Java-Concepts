import java.util.Scanner;

class InfiniteInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your command: ");
            String command = input.nextLine();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("You have successfully exited the loop");
    }
}