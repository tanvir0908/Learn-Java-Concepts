package multithreading.threadclass;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask task1 = new FirstTask();
        SecondTask task2 = new SecondTask();
        ThirdTask task3 = new ThirdTask();

        System.out.println("\nStarting first thread");
        task1.start();
        System.out.println("\nStarting second thread");
        task2.start();
        System.out.println("\nStarting third thread");
        task3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("\n%s thread execution time: %d\n", Thread.currentThread().getName(), (endTime - startTime));
    }
}