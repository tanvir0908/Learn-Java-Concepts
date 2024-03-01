package in.kgcoding.collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        // create an object of a set class
        Set<String> names = new HashSet<>();

        // insert element
        names.add("Tanvir"); // returns true
        names.add("Tanvir"); // returns false
        names.add("Hasan"); // returns true
        names.add("Emon"); // returns true


        Utility.displayCollection(names);

        // check item exist or not
        System.out.println(names.contains("Tanvir"));

        // remove item
        names.remove("Hasan");

        Utility.displayCollection(names);
    }
}
