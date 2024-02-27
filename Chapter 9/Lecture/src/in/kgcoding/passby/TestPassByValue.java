package in.kgcoding.passby;

public class TestPassByValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = add(x, y);
        System.out.printf("Number 1: %d\nNumber 2: %d\nSum: %d", x, y, sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
