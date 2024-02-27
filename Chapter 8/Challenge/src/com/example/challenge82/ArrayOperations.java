package com.example.challenge82;

public class ArrayOperations {
    private int[] numbers;

    public static class Statistics {
        double mean(int[] numbers) {
            double totalSum = 0;
            for (int number : numbers) {
                totalSum += number;
            }
            return totalSum / numbers.length;
        }

        double median() {
            return 0;
        }
    }
}
