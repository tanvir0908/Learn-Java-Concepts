package multithreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // First task
        System.out.println("\n(*) task started");
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + "(*) ");
        }
        System.out.println("\n(*) task completed");

        // Second task
        System.out.println("\n($) task started");
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + "($) ");
        }
        System.out.println("\n($) task completed");

        // Third task
        System.out.println("\n(#) task started");
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + "(#) ");
        }
        System.out.println("\n(#) task completed");

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("\nExecution time: " + executionTime);
    }
}