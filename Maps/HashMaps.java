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
        System.out.println(map.remove(1)); // always add key not value to remove the key-value pair from the HashMap
        System.out.println(map.size()); // Output: 2

        // Traverse through hashmap key wise
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

    }

    // Most Frequent Character - GFG Problem
    public static char getMaxOccuringChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int maxFreq = 0;
        char maxChar = ' ';
        for (char c : map.keySet()) {
            if (map.get(c) > maxFreq) {
                maxFreq = map.get(c);
                maxChar = c;
            }
        }
        return maxChar;
    }
}