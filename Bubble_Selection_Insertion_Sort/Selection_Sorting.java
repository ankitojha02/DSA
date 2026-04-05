package Bubble_Selection_Insertion_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sorting {
    public static void main(String[] args) {
        // int[] arr = { 8, -9, 0, 6, 3, 5, -8 };
        int[] arr = {7,3,4,7,8,1};
        System.out.println("Enter target value");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        print(arr, target);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    // Selection sort is unstable as compared to Bubble sort
    public static void print(int[] arr, int target) {
        int n = arr.length;

        // Sorting array using selection sort
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;

        }

        // Two sum with time complexity - O(n * log n)

        // Arrays.sort(arr);
        
        // int start = 0;
        // int end = n-1;

        // boolean found = false;
        // while(start<end){
        //        if(arr[start] + arr[end] > target){
        //         end--;

        //        }
        //        else if (arr[start] + arr[end] < target) {
        //         start++;
                
        //        }
        //        else if(arr[start] + arr[end] == target){
        //         System.out.println("Target achieved by :" + arr[start] + " and "+ arr[end]);
        //         found = true;
        //         break;
        //        }
           
             
        // }
        // if(!found){
        //     System.out.println("No pair found");
        // }

        // Common Elements
        // Kth smallest
    }
}
