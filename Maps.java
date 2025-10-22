import java.util.Map;
import java.util.HashMap;

// Unique Keys

// HashMap - better for normal case.
// Hashtable - better for multithreading cases (for synchronized). 

public class Maps {
    public static void main(String a[]){
        Map<String, Integer> map = new HashMap<>();

        map.put("employee", 1);
        map.put("employee2", 2);
        map.put("employee3", 3);
        map.put("employee4", 4);

        System.out.println(map);
        System.out.println(map.get("employee3")); // Get specific value from key
        System.out.println(map.keySet()); // Get the keys

    }
}
