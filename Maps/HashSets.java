package Maps;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSets {
    public static void main(String[] args) {

        // Time Complexity of HashSet is O(1) for add, remove, and contains operations on average, while TreeSet has O(log n) time complexity for these operations. However, TreeSet maintains sorted order of elements, while HashSet does not guarantee any order.
        // HashSet<Integer> set = new HashSet<>();
        // set.add(10);
        // set.add(22);
        // set.add(3);
        // set.add(4);
        // System.out.println(set.size()); // 4
        // System.out.println(set.contains(10)); // true
        // System.out.println(set.contains(5)); // false

        // set.remove(4); // remove 4 from the set
        // System.out.println(set.size()); // 3
        // System.out.println(set.contains(4)); // false
        // System.out.println(set.contains(2)); // true

        // set.add(2); // adding duplicate value creates set with unique values
        // System.out.println(set.size()); // 3

        // System.out.println(set); // [2, 3, 22, 10] - random order, not sorted


        // Time Complexity of TreeSet is O(log n) for add, remove, and contains operations, while HashSet has O(1) average time complexity for these operations. However, TreeSet maintains sorted order of elements, while HashSet does not guarantee any order.
        // TreeSet<Integer> treeSet = new TreeSet<>();
        // treeSet.add(10);
        // treeSet.add(22);
        // treeSet.add(3);
        // treeSet.add(4);

        // System.out.println(treeSet); // [3, 4, 10, 22] - sorted order
        // System.out.println(treeSet.size()); // 4

        
        // Find distinct elements in an array using HashSet
        // Time Complexity: O(n), where n is the number of elements in the array. This is because we iterate through the array once and perform O(1) operations (add) for each element in the HashSet.
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        Set<Integer> distinctElements = new HashSet<>();
        for (int num : arr) {
            distinctElements.add(num);
        }
        System.out.println(distinctElements); // [1, 2, 3, 4, 5] - unique elements
        System.out.println(distinctElements.size()); // [1, 2, 3, 4, 5] - unique elements

        
    }
}
