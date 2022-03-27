package java_intermediate.data_structures;

import java.util.HashMap;
import java.util.Map;

public class LearnMaps {

    /*
    Maps store data in key-value pairs
        1 - Sunday
        2 - Monday
        3 - Tuesday
        4 - Wednesday
        5 - Thursday
        6 - Friday
        7 - Saturday

        KEYS MUST BE UNIQUE. CANNOT HAVE TWO SAME KEYS
     */

    public static void main(String[] args) {
        Map<Integer, String> days = new HashMap<>();

        days.put(1, "Sunday");
        days.put(2, "Monday");
        days.put(3, "Tuesday");
        days.put(4, "Wednesday");
        days.put(5, "Thursday");
        days.put(6, "Friday");
        days.put(7, "Saturday");
        days.put(8, "Sunday");

        System.out.println(days.get(1) + "\n" + days.get(8));
        System.out.println(days.entrySet());
        System.out.println(days.keySet());
        System.out.println(days.values());

        days.containsValue("Sunday");

        System.out.println(days);
        System.out.println(days.get(1));

        int size = days.size();
        System.out.println(size);
    }
}
