import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Triangle area calculator");

        System.out.print("Enter triangle height: ");
        float height = input.nextFloat();
        System.out.print("Enter triangle base: ");
        float base = input.nextFloat();

        System.out.println("The area of the triangle: " + (base * height) / 2);
    }
}
