import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangle perimeter calculator");

        System.out.print("Enter length: ");
        float length1 = input.nextFloat();
        System.out.print("Enter length: ");
        float length2 = input.nextFloat();
        System.out.print("Enter length: ");
        float length3 = input.nextFloat();
        System.out.print("Enter length: ");
        float length4 = input.nextFloat();

        System.out.println("\nThe perimeter of the rectangle: " + (length1 + length2 + length3 + length4));
    }
}
