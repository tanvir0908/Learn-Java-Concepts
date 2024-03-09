package challenge102;

public class Signal {
    private final String name;

    Signal(String name) {
        this.name = name;
    }

    public synchronized void printSignal() {
        System.out.printf("%s is active\n", name);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s is inactive\n", name);
    }
}
