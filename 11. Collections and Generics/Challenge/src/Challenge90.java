import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge90 {
    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
        List<String> stringList = Arrays.asList("Bear", "Tiger", "Ant");
        System.out.println("Original Order: " + stringList);
        sortInDescending(stringList);
        System.out.println("Reverse Order: " + stringList);

    }

    public static void sortInDescending(List<String> stringList) {
        Collections.sort(stringList);
        Collections.reverse(stringList);
    }
}