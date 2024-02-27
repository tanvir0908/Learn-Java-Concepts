package com.example.challenge82;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations myArray = new ArrayOperations();
        ArrayOperations.Statistics statistics = new ArrayOperations.Statistics();

        int[] numbers = {10, 20, 30};
        double mean = statistics.mean(numbers);
        System.out.println("Mean: " + mean);
    }
}
