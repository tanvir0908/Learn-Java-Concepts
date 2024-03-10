package challenge104;

import java.util.concurrent.*;

public class Executor {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            Factorial n1 = new Factorial(1);
            Factorial n2 = new Factorial(2);
            Factorial n3 = new Factorial(3);
            Factorial n4 = new Factorial(4);
            Factorial n5 = new Factorial(5);

            Future<Integer> f1 = service.submit(n1);
            Future<Integer> f2 = service.submit(n2);
            Future<Integer> f3 = service.submit(n3);
            Future<Integer> f4 = service.submit(n4);
            Future<Integer> f5 = service.submit(n5);

            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
            System.out.println(f5.get());

            service.shutdown();

            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                service.shutdownNow();
            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
