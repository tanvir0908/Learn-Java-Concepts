import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Temperature converter");

        System.out.print("Enter temperature in fahrenheit: ");
        float fahrenheit = input.nextFloat();

        float celsius = (fahrenheit - 32) * ((float) 5 / 9);
        System.out.println("Temperature in celsius: " + celsius);
    }
}
