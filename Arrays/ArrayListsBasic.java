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

        System.out.println(arr.get(2));
        arr.set(2, 19);
        System.out.println(arr.get(2));
    }
}
