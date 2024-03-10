package challenge104;

public class Tasks implements Runnable {
    @Override
    public void run() {
        System.out.printf("Started thread name: %s\n", Thread.currentThread().getName());
        int randomNumber = (int) Math.ceil(Math.random() * 5);
        try {
            Thread.sleep(1000 * randomNumber);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        System.out.printf("Ended thread name: %s\n", Thread.currentThread().getName());
    }
}
