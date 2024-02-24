import java.util.Scanner;

class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Area and Circumference Calculator of a Circle");

        System.out.print("Please enter the radius: ");
        double r = input.nextDouble();
        double area = (double) Math.PI * Math.pow(r, 2);
        System.out.println("Area: " + area);
        double circumference = 2 * Math.PI * r;
        System.out.println("Circumference: " + circumference);
    }
}