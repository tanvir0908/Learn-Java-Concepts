import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge91 {
    public static void main(String[] args) {
        List<Integer> newList = Arrays.asList(1, 2, 1, 3, 4, 5, 6);
        System.out.println(Collections.frequency(newList, 2));
        System.out.println(Collections.frequency(newList, 4));
        System.out.println(Collections.frequency(newList, 5));
        System.out.println(Collections.frequency(newList, 1));
    }
}
