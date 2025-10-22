import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


// Only unique elements.
// Does not suppport Index values.
// HashSet - Random elements position.

public class Sets {
    public static void main(String a[]){
        Set<Integer> set = new HashSet<>();
        set.add(149);
        set.add(24);
        set.add(34);
        set.add(31);

        System.out.println(set);

        // TreeSet - Sorted elements position.

        Set<Integer> set2 = new TreeSet<>();
        set2.add(94);
        set2.add(27);
        set2.add(37);
        set2.add(30);

        System.out.println(set2);
        
    }
    
}
