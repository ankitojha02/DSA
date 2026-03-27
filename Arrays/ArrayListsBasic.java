package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(29);
        arr.add(10);

        System.out.println(arr.get(1)); // get() means to read values
        arr.set(1, 19); // set(arr index, new element) means to update value
        System.out.println(arr.get(1));

        System.out.println(arr); // Print all values of array i.e., whole array

        int n = arr.size(); // here it stores array length
        System.out.println(n);

        arr.add(1, 100); // This add method adds element at a particular index while the above add method
                         // adds element at the end of the array
        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr); //This removes particular element using its index number
    
        Collections.reverse(arr); // This reverse the array
        System.out.println(arr);
    }
}
