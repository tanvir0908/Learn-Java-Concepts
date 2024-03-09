package multithreading.sleep;

public class TestingSleep {
    public static void main(String[] args) {
        System.out.println("Before sleep");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        System.out.println("Wake up");
    }
}
