package in.kgcoding.collection;

import java.util.Collection;
import java.util.Objects;

public class Utility {
    public static void displayCollection(Collection collection) {
        System.out.print("Collection is: ");
        for (Object coll : collection) {
            System.out.printf("%s ", coll);
        }
        System.out.println();
    }
}
