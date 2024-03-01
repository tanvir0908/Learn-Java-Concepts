import java.util.Arrays;
import java.util.List;

public class Challenge92 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("Before: " + list);
        swap(list, 2, 7);
        System.out.println("After: " + list);
    }

    public static void swap(List<Integer> list, int first, int second) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}
