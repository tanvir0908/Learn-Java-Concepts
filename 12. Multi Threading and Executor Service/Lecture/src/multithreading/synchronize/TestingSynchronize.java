package multithreading.synchronize;

public class TestingSynchronize {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Balance balance = new Balance();

        UpdaterThread t1 = new UpdaterThread(balance);
        UpdaterThread t2 = new UpdaterThread(balance);

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();

        System.out.printf("Final balance: %d\nExecution time: %d", balance.getBalance(), (endTime - startTime));
    }
}
