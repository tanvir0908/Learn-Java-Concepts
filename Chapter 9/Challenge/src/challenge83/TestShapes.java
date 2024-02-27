package challenge83;

public class TestShapes {
    public static void main(String[] args) {
//        Shape shape = new Shape(); // abstract class
        Circle circle = new Circle(5);
        Square square = new Square(10.3);

        System.out.printf("Area of Circle: %.2f\n", circle.calculateArea());
        System.out.printf("Area of Square: %.2f", square.calculateArea());
    }
}
