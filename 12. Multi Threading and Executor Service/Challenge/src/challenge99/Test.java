package challenge99;

public class Test {
    public static void main(String[] args) {
        Print p1 = new Print(1);
        Print p2 = new Print(2);

        HelloThread t1 = new HelloThread(p1);
        HelloThread t2 = new HelloThread(p2);

        t1.start();
        t2.start();
    }
}
