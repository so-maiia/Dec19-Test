package JavaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"January");
        map1.put(2,"February");
        map1.put(3, "March");

        //System.out.println(map1.get(2));
        for (int key: map1.keySet()) {
            System.out.println(map1.get(key));

        }
        Map<Integer,Integer> map2 = new LinkedHashMap<>();

    }
}
// map is a KEY VALUE PAIR
// no duplicate key and it will only acept the latest one