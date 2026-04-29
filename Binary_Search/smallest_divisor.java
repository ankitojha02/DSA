package Binary_Search;

import java.util.Scanner;

public class smallest_divisor {
    public static void main(String[] args) {
        int[] num = {1, 2, 5, 9};
        int n= num.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the threshold value");
        int threshold = sc.nextInt();

        int low = 1;
        int high = 0;

        for(int l : num){
            high = Math.max(high, l);
        }

        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if(s_divisor(num, mid, threshold)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }

    public static boolean s_divisor(int[] num, int mid, int threshold){
        int sum = 0;

        for(int n : num){
            sum = (int)(sum + Math.ceil((double)n / mid));
        }
        return sum <= threshold;
    }
}
