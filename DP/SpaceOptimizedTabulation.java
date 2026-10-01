package DP;

public class SpaceOptimizedTabulation {
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Leetcode 198 - House Robber Problem
    // Time Complexity: O(n), Space Complexity: O(1)
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        
        int prev1 = nums[0];
        int prev2 = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i < n; i++) {
            int current = Math.max(prev2, nums[i] + prev1);
            prev1 = prev2;
            prev2 = current;
        }
        
        return prev2;
    }

    // LeetCode 746 - Min Cost Climbing Stairs
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        if (n == 1) return cost[0];
        
        int prev1 = cost[0];
        int prev2 = cost[1];
        
        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(prev1, prev2);
            prev1 = prev2;
            prev2 = current;
        }
        
        return Math.min(prev1, prev2);
    }

    // LeetCode 62 - Unique Paths - space optimized tabulation
    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int j = 0; j < n; j++) {
            dp[j] = 1; // Only one way to reach any cell in the first row
        }
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1]; // Update the current cell
            }
        }
        return dp[n - 1];
    }

    // Friends Pairing Problem - GFG Practice
}
