import java.util.*;

public class Challenge95 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to unique character calculator");

        System.out.print("Please enter a string: ");
        String string = input.nextLine();
        int uniqueChar = countUniqueCar(string);
        System.out.println("The unique character count is: " + uniqueChar);
    }

    public static int countUniqueCar(String string) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            set.add(string.charAt(i));
        }
        return set.size();
    }
}
