package challenge102;

public class TrafficSignal extends Thread {
    public Signal signal;

    public TrafficSignal(Signal signal) {
        this.signal = signal;
    }

    @Override
    public void run() {
        signal.printSignal();
    }
}
