package Maps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // put() method is used to add key-value pairs to the HashMap. If the key
        // already exists, the old value will be replaced with the new value.
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
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int maxFreq = 0;

        for (char c : map.keySet()) {
            int freq = map.get(c);
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        char ans = 'z'; // Initialize ans with a character that is greater than any lowercase letter
        for (char c : map.keySet()) {
            int freq = map.get(c);
            if (freq == maxFreq && c < ans) {
                ans = c;

            }
        }
        return ans;

    }

    // Time Complexity: O(n), where n is the length of the input string. We iterate
    // through the string once to build the frequency map and then iterate through
    // the map to find the maximum frequency character.

    // Array Subset - GFG Problem
    public static boolean isSubset(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }
            map.put(num, map.get(num) - 1);
        }

        return true;
    }

    // All pairs with Diff k - GFG Problem
    public static int countPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int num : arr) {
            map.put(num, map.get(num) - 1); // Decrement the count of the current number to avoid counting pairs with
                                            // itself
            if (map.containsKey(num + k)) {
                count += map.get(num + k);
            }
            if (map.containsKey(num - k)) {
                count += map.get(num - k);
            }
        }

        return count;
    }

    // Valid Anagram - LeetCode 242
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // HashMap to store character frequencies
        HashMap<Character, Integer> map = new HashMap<>();

        // Count the frequency of each character in string s
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Decrease the frequency using characters from string t
        for (int i = 0; i < t.length(); i++) {

            char c = t.charAt(i);

            // If character does not exist in the map,
            // t contains an extra character
            if (!map.containsKey(c)) {
                return false;
            }

            // Decrease the frequency of the current character
            map.put(c, map.get(c) - 1);

            // If frequency becomes negative,
            // t contains this character more times than s
            if (map.get(c) < 0) {
                return false;
            }
        }

        // All character frequencies matched
        return true;

    }
}