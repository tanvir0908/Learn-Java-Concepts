package in.kgcoding.collection;

import java.util.Collection;
import java.util.Objects;

public class Utility {
    public static <E> void displayCollection(Collection<E> collection) {
        System.out.print("Collection is: ");
        for (E coll : collection) {
            System.out.printf("%s ", coll.toString());
        }
        System.out.println();
    }
}
