package Maps;

import java.util.HashMap;
import java.util.HashSet;

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

    // Time Complexity: O(n), where n is the length of the strings. We iterate
    // through both strings once to build and check the frequency map.

    // Count equal pair in string - GFG Problem
    public static int equalPairs(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count the frequency of each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        long count = 0;
        // Count ordered pairs including i == j
        for (int freq : map.values()) {
            count += (long) freq * freq;
        }
        return (int) count;
    }

    // LeetCode 3 - Longest Substring Without Repeating Characters
    // Very Very Important Problem - Sliding Window Technique
    // Time Complexity: O(n), where n is the length of the string. We iterate
    // through the string once.

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char currentChar = s.charAt(right);

            // Jab tak duplicate hai, left se characters remove karo
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Current character add karo
            set.add(currentChar);

            // Maximum length update karo
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // LeetCode 987 - Vertical Order Traversal of a Binary Tree
    // Time Complexity: O(n log n), where n is the number of nodes in the
    // binary tree. We traverse all nodes and then sort the results based on the
    // required order.

    // LeetCode 1497 - Check If Array Pairs Are Divisible by k
    // Time Complexity: O(n), where n is the length of the input array. We
    
    public static boolean canArrange(int[] arr, int k) {
        // HashMap to store the frequency of remainders - Format - HashMap<remainder, frequency>
        HashMap<Integer, Integer> remainderCount = new HashMap<>();

        // Count the frequency of remainders when divided by k
        for (int num : arr) {
            int remainder = ((num % k) + k) % k; // Handle negative numbers
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        // Check if pairs can be formed
        for (int remainder : remainderCount.keySet()) {
            if (remainder == 0) {
                // For remainder 0, count must be even
                if (remainderCount.get(remainder) % 2 != 0) {
                    return false;
                }
            } else {
                int complement = k - remainder;
                if (remainderCount.get(remainder) != remainderCount.getOrDefault(complement, 0)) {
                    return false;
                }
            }
        }

        return true;
    }

    // LeetCode 2183 - Count Array Pairs Divisible by k
    // Time Complexity: O(n), where n is the length of the input array. We
    // iterate through the array once to count the frequency of remainders and
    // then iterate through the unique remainders to count valid pairs.
    
}