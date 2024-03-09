package multithreading.synchronize;

public class UpdaterThread extends Thread {
    private final Balance balance;


    public UpdaterThread(Balance balance) {
        this.balance = balance;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            balance.depositBalance();
        }
    }
}
