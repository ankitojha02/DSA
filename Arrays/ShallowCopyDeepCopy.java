package Arrays;
import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        // int[] x = arr; // x is shallow copy of array i.e., x is a copy of arr

        // for(int i=0; i<x.length; i++){
        //     System.out.println(x[i]);
        // }

        int[] deep = Arrays.copyOf(arr, arr.length); //deep copy of array means it does not change in original array i.e., arr
        deep[0] = 100;
        System.out.println(arr[0]);
        System.out.println(deep[0]);

    }
}
