package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        // declare arrayList (generics)
        List<String> strList = new ArrayList<>();

        // insert data
        strList.add("Tanvir");
        strList.add("Hasan");
        strList.add("Emon");

        // insert data into 1 index
        strList.add(1, "Jannat");

        // remove data from 0 index
        strList.remove(1);

        // check exists in a list
        if (strList.contains("Jannat")) {
            System.out.println("Tanvir exist");
            System.out.println(strList.indexOf("Emon"));
        }

        // list iteration using for loop
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i) + " ");
        }

        // list iteration using for each loop
        for (String name : strList) {
            System.out.println(name);
        }
    }
}
