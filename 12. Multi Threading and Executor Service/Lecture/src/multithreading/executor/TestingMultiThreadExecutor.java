package multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultiThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        PrintTasks task1 = new PrintTasks('*');
        PrintTasks task2 = new PrintTasks('$');
        PrintTasks task3 = new PrintTasks('#');
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

//        for (int i = 0; i < 10; i++) {
//            PrintTasks task = new PrintTasks((char) i);
//            service.submit(task);
//        }

        service.shutdown();

        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            service.shutdownNow();
        }
    }
}
