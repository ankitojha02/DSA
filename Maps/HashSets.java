package Maps;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(22);
        set.add(3);
        set.add(4);
        System.out.println(set.size()); // 4
        System.out.println(set.contains(10)); // true
        System.out.println(set.contains(5)); // false

        set.remove(4); // remove 4 from the set
        System.out.println(set.size()); // 3
        System.out.println(set.contains(4)); // false
        System.out.println(set.contains(2)); // true

        set.add(2); // adding duplicate value creates set with unique values
        System.out.println(set.size()); // 3

        System.out.println(set); // [1, 2, 3] - random order, not sorted


    }
}
