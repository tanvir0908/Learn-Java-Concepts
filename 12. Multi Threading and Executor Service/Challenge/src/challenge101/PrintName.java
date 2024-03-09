package challenge101;

public class PrintName extends Thread {
    @Override
    public void run() {
        System.out.printf("Thread name: %s\n", Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
