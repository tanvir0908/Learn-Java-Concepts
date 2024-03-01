package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        // inserting elements
        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(-2);
        numList.add(10);

        Utility.displayCollection(numList);

        Collections.sort(numList);
        Collections.reverse(numList);
        Utility.displayCollection(numList);
    }
}
