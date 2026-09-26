package DP;
import java.util.Arrays;

public class DP {
    static int[] dp;
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        // Using Recusrsion and DP
       dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = 0; // Initialize dp array with 0
        }
        return fibonacciHelper(n);
    }

    // Memoization helper function - Top Down DP - Recursive DP
    private static int fibonacciHelper(int n) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fibonacciHelper(n - 1) + fibonacciHelper(n - 2);
        return dp[n];
    }

    // Leetcode 198 - House Robber Problem
    public static int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1); // Initialize dp array with -1
        return robHelper(0, nums);
    }

    // Memoization helper function for House Robber Problem
    private static int robHelper(int i, int[] nums) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        // Choose to rob the current house or skip it
        int pick= nums[i] + robHelper(i + 2, nums);
        int skip = robHelper(i + 1, nums);
        int ans = Math.max(pick, skip);
        dp[i] = ans;
        return ans;
    }

    // LeetCode 746 - Min Cost Climbing Stairs
}
