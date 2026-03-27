package Arrays;

import java.util.ArrayList;
public class ArrayListsBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(29);
        arr.add(10);

        System.out.println(arr.get(1)); //get() means to read values
        arr.set(1, 19);  // set(arr index, new element) means to update value
        System.out.println(arr.get(1));

        System.out.println(arr); //Print all values of array i.e., whole array
          
        int n = arr.size(); //here it stores array length
        System.out.println(n);
    }
}
