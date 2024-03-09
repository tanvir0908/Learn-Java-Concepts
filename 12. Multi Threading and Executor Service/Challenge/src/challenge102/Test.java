package challenge102;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Signal s1 = new Signal("RED");
        Signal s2 = new Signal("YELLOW");
        Signal s3 = new Signal("GREEN");

        TrafficSignal t1 = new TrafficSignal(s1);
        TrafficSignal t2 = new TrafficSignal(s2);
        TrafficSignal t3 = new TrafficSignal(s3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}
