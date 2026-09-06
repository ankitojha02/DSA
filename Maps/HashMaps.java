package Maps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
     HashMap<Integer, String> map = new HashMap<>();
     // put() method is used to add key-value pairs to the HashMap. If the key already exists, the old value will be replaced with the new value.
        map.put(1, "One"); 
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map.get(2)); // Output: Two
        System.out.println(map.containsKey(3)); // Output: true
        System.out.println(map.containsValue("Four")); // Output: false
        System.out.println(map); // Output: {1=One, 2=Two, 3=Three}
        map.remove(1);
        System.out.println(map.size()); // Output: 2
    }
}
