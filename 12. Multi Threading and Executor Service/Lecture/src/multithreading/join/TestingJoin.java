package multithreading.join;

import multithreading.threadclass.FirstTask;
import multithreading.threadclass.SecondTask;
import multithreading.threadclass.ThirdTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        FirstTask task1 = new FirstTask();
        SecondTask task2 = new SecondTask();
        ThirdTask task3 = new ThirdTask();

        // Setting thread priority
        task3.setPriority(Thread.MAX_PRIORITY);
        task1.setPriority(Thread.MIN_PRIORITY);

        System.out.println("\nStarting first thread");
        task1.start();
        System.out.println("\nStarting second thread");
        task2.start();
        task1.join();
        System.out.println("\nStarting third thread");
        task3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("\n%s thread execution time: %d\n", Thread.currentThread().getName(), (endTime - startTime));
    }
}