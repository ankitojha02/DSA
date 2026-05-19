package Recursion;

public class Recursion_on_Array {
    public static void main(String[] args) {
        int[] arr = {5,3,7,12,76,9,34,5};
        int n = arr.length - 1;
        print(arr, n);
    }
    public static void print(int[] arr, int n){
        // Base Case
          if(n==0){
            System.out.println(arr[n]);
            return;
          }

          print(arr, n-1);
          System.out.println(arr[n]);
    }
}
