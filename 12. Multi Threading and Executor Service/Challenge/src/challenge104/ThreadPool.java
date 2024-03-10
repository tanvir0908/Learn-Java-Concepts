package challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(10)) {
            for (int i = 0; i < 10; i++) {
                Tasks task = new Tasks();
                service.submit(task);
            }

            service.shutdown();

            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Emergency shutdown");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
