import java.util.*;

public class Challenge93 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(list);
        reverseList(list);
        System.out.println(list);
    }

    public static void reverseList(List<Integer> list) {
        int middlePoint = list.size() / 2;
        int j = list.size() - 1;
        for (int i = 0; i <= middlePoint; i++) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            j--;
        }
    }
}
