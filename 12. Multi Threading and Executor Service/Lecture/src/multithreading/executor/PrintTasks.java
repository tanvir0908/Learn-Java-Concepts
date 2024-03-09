package multithreading.executor;

public class PrintTasks implements Runnable {
    private final char targetChar;

    public PrintTasks(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run() {
        // Print task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d:(%c) ", i, targetChar);
        }
        System.out.printf("\n%s: (%c) task completed", Thread.currentThread().getName(), targetChar);
    }
}
