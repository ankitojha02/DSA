package Recursion;
import java.util.Arrays;
public class Recursion_on_Array {
    public static void main(String[] args) {
        // int[] arr = {5,3,7,12,76,9,34,5};
        // int n = arr.length - 1;
        // print(arr, n);

        // Search element in an array 
        int[] arr = {5,3,7,12,76,9,34,5};

        // int ele = 76;
        // int idx = 0;
        // System.out.println(exists(arr, ele ,idx));

        int n = arr.length;
        helper(arr, 0, n-1);
         System.out.println(Arrays.toString(arr));
    }
    // public static void print(int[] arr, int n){
    //     // Base Case
    //       if(n==0){
    //         System.out.println(arr[n]);
    //         return;
    //       }

    //       print(arr, n-1);
    //       System.out.println(arr[n]);
    // }

    // public static boolean exists(int[] arr, int ele, int idx){
    //    if(idx == arr.length) return false;
    //    if(arr[idx] == ele) return true;
    //    return exists(arr, ele, idx+1);
    // }

    // Binary Search - Recursion - Leetcode 704
    // Binary Search - First Occurence
    // Reverse an Array

     public static void helper(int[] arr, int i , int j){
        if(i>=j) return;

        int temp = arr[i];
         arr[i] = arr[j];
        arr[j] = temp;

         helper(arr, i+1, j-1);
     }
}
