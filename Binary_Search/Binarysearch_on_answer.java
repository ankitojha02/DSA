package Binary_Search;

import java.util.Scanner;



public class Binarysearch_on_answer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int n = arr.length;
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int D = sc.nextInt();
        search(arr, n, D);
    }

    public static void search(int[] weights, int n, int D){
        int sum = 0, maxWeight = 0;
        int ans = 0;
        for(int i = 0; i<n; i++){
            sum = sum + weights[i];
            maxWeight = Math.max(maxWeight, weights[i]);
        }

        int low = maxWeight, high = sum;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if(isShip(weights, mid, D)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        System.out.println("The minimum capacity is : " + ans);
    }

    public static boolean isShip(int[] weights, int capacity, int D){
        int daysRequired = 1;
        int currentload = 0;

        for(int i=0; i<weights.length; i++){
            if (currentload + weights[i] > capacity) {
                daysRequired++;
                currentload = weights[i];
            }
            else{
                currentload = currentload + weights[i];
            }
        }

        return daysRequired <= D;
    }
}
