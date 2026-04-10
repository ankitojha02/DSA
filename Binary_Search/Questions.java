package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {

    // First Occurence Question
    public static void main(String[] args) {
        int[] arr = {20, 35, 35, 47, 90, 90, 90, 47, 90, 43};
        Arrays.sort(arr);
        int n = arr.length;
 
        int index = -1;
        System.out.println("Enter your target element");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int low = 0, high = n-1;

        while(low<=high){
            int mid = (high + low)/2;
            if (arr[mid] < target) {
                low = mid + 1;
                
            }
            else if(arr[mid] > target){
                high = mid -1;
            }
            else {
                index = mid; // store possible answer
                high = mid -1; // move left for first occurence
            }

        }

        if (index != -1) {
            System.out.println("First occurrence found at index: " + index);
        } else {
            System.out.println("Element not found");
        }


        // Last Occurence

        // Binary search in descending order

        
    }
}
