package challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintNumbers print = new PrintNumbers();
        service.submit(print);
        service.shutdown();
    }
}
