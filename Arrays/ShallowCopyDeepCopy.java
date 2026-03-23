package Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] x = arr; // x is shallow copy of array

        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
    }
}
