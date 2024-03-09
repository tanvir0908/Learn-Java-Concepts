package multithreading.synchronize;

public class Balance {
    private int balance = 0;

    public synchronized void depositBalance() {
        balance++;
    }

    public int getBalance() {
        return balance;
    }
}
