package challenge100;

public class Test {
    public static void main(String[] args) {
        StateThread t1 = new StateThread();
        System.out.printf("Thread created: %s\n", t1.getState());
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println("Exception occurred" + e.getMessage());
        }
        System.out.printf("\nThread finished: %s\n", t1.getState());
    }
}
