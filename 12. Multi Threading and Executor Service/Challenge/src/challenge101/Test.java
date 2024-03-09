package challenge101;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        PrintName t1 = new PrintName();
        PrintName t2 = new PrintName();
        PrintName t3 = new PrintName();

        System.out.println(t1.getState());
        t1.start();
        t1.join();
        System.out.println(t1.getState());

        System.out.println(t2.getState());
        t2.start();
        t2.join();
        System.out.println(t2.getState());

        System.out.println(t3.getState());
        t3.start();
        System.out.println(t3.getState());
    }
}
