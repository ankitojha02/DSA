package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        int[] arr = {10, -89, 46, 90, 45, 38, -81, 90};
        Arrays.sort(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int target = sc.nextInt();
        int n = arr.length;
        int low = 0, high = n-1;
        boolean isAvailable = false;

        // Time complexity is : log n
        while(low<=high){
            int mid = (low + high) / 2;

            if(arr[mid]> target){
                high = mid -1;
            }
            else if(arr[mid]<target){
                low = mid + 1;
            }
            else{
                System.out.println("Yes this number is in the array");
                isAvailable = true;
                break;
            }
        }

        if(!isAvailable){
            System.out.println("The number you entered is not in the list");
        }

        sc.close();
    }
}
