package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class MapClassEx {
    public static void main(String[] args) {
        Map<Integer,String> weekday = new HashMap<>();
        weekday.put(1, "Monday");
        weekday.put(2, "Tuesday");
        weekday.put(3, "Wednesday");
        weekday.put(4, "Thursday");
        weekday.put(5, "Friday");

        for (int key: weekday.keySet()) {
            System.out.println(weekday.get(key));

        }
    }
}
