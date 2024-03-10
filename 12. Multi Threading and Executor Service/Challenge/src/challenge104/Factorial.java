package challenge104;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {

    private final int number;

    Factorial(int number) {
        this.number = number;
    }

    private int calculateFactorial() {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return calculateFactorial();
    }
}
