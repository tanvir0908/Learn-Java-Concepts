package multithreading.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        FetchName t1 = new FetchName("Tanvir");
        FetchName t2 = new FetchName("Hasan");
        FetchName t3 = new FetchName("Emon");
        FetchName t4 = new FetchName("Hablu");
        FetchName t5 = new FetchName("Kablu");

        Future<String> name1 = service.submit(t1);
        Future<String> name2 = service.submit(t2);
        Future<String> name3 = service.submit(t3);
        Future<String> name4 = service.submit(t4);
        Future<String> name5 = service.submit(t5);

        System.out.printf("\nFull name is: " + name1.get());
        System.out.printf("\nFull name is: " + name2.get());
        System.out.printf("\nFull name is: " + name3.get());
        System.out.printf("\nFull name is: " + name4.get());
        System.out.printf("\nFull name is: " + name5.get());

        service.shutdown();
    }
}
