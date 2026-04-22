package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {

    // First Occurence Question
    public static void main(String[] args) {
        // int[] arr = {20, 35, 35, 47, 90, 90, 90, 47, 90, 43};
        // Arrays.sort(arr);
        // int n = arr.length;
 
        // int index = -1;
        // System.out.println("Enter your target element");
        // Scanner sc = new Scanner(System.in);
        // int target = sc.nextInt();
        // int low = 0, high = n-1;

        // while(low<=high){
        //     int mid = (high + low)/2;
        //     if (arr[mid] < target) {
        //         low = mid + 1;
                
        //     }
        //     else if(arr[mid] > target){
        //         high = mid -1;
        //     }
        //     else {
        //         index = mid; // store possible answer
        //         high = mid -1; // move left for first occurence
        //     }

        // }

        // if (index != -1) {
        //     System.out.println("First occurrence found at index: " + index);
        // } else {
        //     System.out.println("Element not found");
        // }


        // Last Occurence

        // Binary search in descending order

        // Sorted array search , find if k is present in an array or not
    
        // Last Occurence
        // int arr[] = {23, 17, 29, 90, 46, 74, 29, 67, 29, 80, 90};

        // Mountain array
        // int arr[] = {-1, 0, 1, 2, 5, 7, 8, 6, 3, 2};
        int arr[] = {3, 7, 11, 15, 20, 25, 27, 31, 33, 38};
        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element");
        int target = sc.nextInt();

        binary(arr, n, target);

    }

    public static void binary(int[] arr, int n, int target){
        // Arrays.sort(arr);
        // int low = 0, high = n-1;
        // int index = -1;
        // while(low <= high){
        //     int mid = (high + low) / 2;

        //     if(arr[mid] < target){
        //         low = mid + 1;
        //     }
        //     else if(arr[mid] > target){
        //         high = mid - 1;
        //     }
        //     else{
        //         index = mid;
        //         low = mid + 1;
        //     }
        // }

        // if(index == -1){
        //     System.out.println("The number is not present in the array");
        // }
        // else{
        //     System.out.println("The number is present at index : " + index);
        // }

        // Search in mountain array - Finding peak 
    //    int low = 1, high = n-2;

    //    while(low<=high){
    //     int mid = (high+low)/2;

    //     if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
    //         System.out.println("Peak element is : "+ arr[mid] + " at index: "+ mid);
    //         break;
    //     }
    //     else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
    //         low = mid + 1;
    //     }
    //     else{
    //         high = mid -1;
    //     }
    //    }

    // Floor in sorted array question
        int low = 0, high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = (high+low)/2;

            if(arr[mid]>target){
                high = mid -1;
            }
            else{
                ans = arr[mid];
                low = mid + 1;
            } 
        }

        System.out.println("The floor of the targeted element is : " + ans);
    } 
}
