package challenge103;

public class PrintNumbers extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
