package multithreading.executor;

import multithreading.runnable.PrintTasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        PrintTasks task1 = new PrintTasks('*');
        PrintTasks task2 = new PrintTasks('$');
        PrintTasks task3 = new PrintTasks('#');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();
    }
}
