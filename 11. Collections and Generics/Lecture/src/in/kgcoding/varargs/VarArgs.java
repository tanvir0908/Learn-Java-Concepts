package in.kgcoding.varargs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3, 4, 5));
    }

    public static int sum(int first, int second, int... numbers) {
        int sum = first + second;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
