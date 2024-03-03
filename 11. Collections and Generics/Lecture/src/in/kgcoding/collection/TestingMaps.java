package in.kgcoding.collection;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tanvir", 100);
        map.put("Hasan", 80);
        map.put("Emon", 90);
        map.put("Hablu", 30);
        System.out.println(map.size());
        System.out.println(map.get("Tanvir"));
        System.out.println(map.containsKey("Geeta"));
    }
}
