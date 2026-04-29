package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class aggressive_cows {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        Arrays.sort(stalls);
        int n = stalls.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cows");
        int cows = sc.nextInt();

        int low = 1;
        int high = stalls[n-1] - stalls[0];

       
        int ans = 0;

        while (low<=high) {
            int mid = low + (high - low)/2;

            if(isPossible(stalls, cows, mid)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean isPossible(int[] stalls, int cows, int mid){
        int count = 1;
        int lastPos = stalls[0];

        for(int i=1; i<stalls.length; i++){
            if(stalls[i] - lastPos >= mid){
                count++;
                lastPos = stalls[i];
            }
            if(count >= cows){
                return true;
            }
        }
        return false;
    }
}
