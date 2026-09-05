package Maps;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set.size());
        System.out.println(set.contains(1)); // true
        System.out.println(set.contains(5)); // false

        set.remove(4);
        System.out.println(set.size());
    }
}
