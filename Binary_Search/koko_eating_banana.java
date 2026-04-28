package Binary_Search;

import java.util.Scanner;

public class koko_eating_banana {

   public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the available hours");
        int h = sc.nextInt();

        int n = piles.length;

        int result = perHourEat(piles, h, n);
        System.out.println(result);
   }

   public static int perHourEat(int[] piles, int h, int n){
        int low = 1;
        int maxPile = 0;

        for(int ele : piles){
            maxPile = Math.max(maxPile, ele);
        }

        int high = maxPile;
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low)/2;

            int requiredHours = calculatehours(piles, mid);

            if (requiredHours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
   }

   public static int calculatehours(int[] piles, int speed){
        int totalHours = 0;

        for(int bananas : piles){
            totalHours += (int)Math.ceil((double) bananas / speed);
        }

        return totalHours;
   }
}