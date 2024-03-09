package multithreading.future;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {
    private final String name;

    FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(4000);
        return name + "Shadow";
    }
}
