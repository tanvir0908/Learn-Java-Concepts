package challenge100;

public class StateThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.printf("Thread is running: %s", Thread.currentThread().getState());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
