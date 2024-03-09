package multithreading.threadclass;

public class SecondTask extends Thread {
    @Override
    public void run() {
        // First task
        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + "($) ");
        }
        System.out.printf("\n%s: ($) task completed", Thread.currentThread().getName());
    }
}
