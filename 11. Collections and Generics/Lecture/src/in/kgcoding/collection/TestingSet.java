package in.kgcoding.collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        System.out.println(names.add("Tanvir"));
        System.out.println(names.add("Hasan"));
        System.out.println(names.add("Emon"));
        
        Utility.displayCollection(names);
    }
}
