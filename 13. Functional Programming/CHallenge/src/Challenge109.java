import java.util.ArrayList;
import java.util.List;

public class Challenge109 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }
        numbers.stream().filter(number -> number % 2 != 0).forEach(number -> System.out.print(number + " "));
    }
}
