import java.util.List;

public class Challenge106 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        int totalMultiplication = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Total multiplication: " + totalMultiplication);
    }
}
