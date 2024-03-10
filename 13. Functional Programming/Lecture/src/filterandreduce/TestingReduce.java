package filterandreduce;

import java.util.List;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);

        int totalSum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
        int max = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("Total sum: " + totalSum);
        System.out.println("Max number: " + max);
    }
}
