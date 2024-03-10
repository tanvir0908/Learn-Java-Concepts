package methodreferences;

import java.util.List;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream().filter(number -> number % 2 != 0).forEach(number -> System.out.println(number));

        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);

        int totalSum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
        System.out.println("Total sum: " + totalSum);
//        int max = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
//        System.out.println("Max number: " + max);
    }
}
