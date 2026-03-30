package Arrays;

import java.util.ArrayList;
import java.util.Collections;

import Methods.returntype;

public class ArrayListsBasic {
    public static void main(String[] args) {

        // You can also use Vector in place of Array list
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(25);
        // arr.add(21);
        // arr.add(18);
        // arr.add(29);
        // arr.add(10);

        // System.out.println(arr.get(1)); // get() means to read values
        // arr.set(1, 19); // set(arr index, new element) means to update value
        // System.out.println(arr.get(1));

        // System.out.println(arr); // Print all values of array i.e., whole array

        // int n = arr.size(); // here it stores array length
        // System.out.println(n);

        // arr.add(1, 100); // This add method adds element at a particular index while the above add method
        //                  // adds element at the end of the array
        // System.out.println(arr);

        // arr.remove(1);
        // System.out.println(arr); //This removes particular element using its index number
    
        // Collections.reverse(arr); // This reverse the array
        // System.out.println(arr);

        // ArrayList<Character> arr2 = new ArrayList<>(); // Creates array that contains character element
         

        // Adding one in an Arraylist

        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(9);

        ArrayList<Integer> result = plusOne(list);

        System.out.println(result);

    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> list){
        int n = list.size();

        //Traverse from last digit

        for(int i = n-1; i>=0; i--){
            if(list.get(i) < 9){
                list.set(i, list.get(i) + 1);
                return list;
            }

            // if digits is 9, make it 0
            list.set(i, 0);
        }

        // if all digits were 9
        list.add(0,1);

        return list;
    }
}
