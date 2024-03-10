import java.util.List;

public class Challenge106 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 7, 8);

        int multiplication = 1;
        for (int number : list) {
            multiplication *= number;
        }
        System.out.println("Total multiplication: " + multiplication);

        int totalMultiplication = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Total multiplication: " + totalMultiplication);
    }
}
