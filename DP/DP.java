package DP;
import java.util.Arrays;

public class DP {
    static int[] dp;
    static int[][] dp2D;
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
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n];
        Arrays.fill(dp, -1); // Initialize dp array with -1
        return Math.min(minCostHelper(n - 1, cost), minCostHelper(n - 2, cost));
    }
    
    // Memoization helper function for Min Cost Climbing Stairs
    private static int minCostHelper(int i, int[] cost) {
        if (i < 0) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        // Choose to climb the current step or skip it
        int climb = cost[i] + minCostHelper(i - 1, cost);
        int skip =cost[i] + minCostHelper(i - 2, cost);
        int ans = Math.min(climb, skip);
        dp[i] = ans;
        return ans;
    }

    // LeetCode 62 - Unique Paths
    public static int uniquePaths(int m, int n) {
        dp2D = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp2D[i][j] = 0;
            }
        }
        return uniquePathsHelper(m - 1, n - 1);
    }

    private static int uniquePathsHelper(int m, int n) {
        if (m == 0 || n == 0) {
            return 1;
        }
        if (dp2D[m][n] != 0) {
            return dp2D[m][n];
        }
        dp2D[m][n] = uniquePathsHelper(m - 1, n) + uniquePathsHelper(m, n - 1);
        return dp2D[m][n];
    }

    // LeetCode 64 - Minimum Path Sum
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp2D = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp2D[i][j] = -1; // Initialize dp array with -1 
            }
        }
        return minPathSumHelper(m - 1, n - 1, grid);
    }

    private static int minPathSumHelper(int m, int n, int[][] grid) {
        if (m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        }
        if (m == 0 && n == 0) {
            return grid[0][0];
        }
        if (dp2D[m][n] != -1) {
            return dp2D[m][n];
        }
        dp2D[m][n] = grid[m][n] + Math.min(minPathSumHelper(m - 1, n, grid), minPathSumHelper(m, n - 1, grid));
        return dp2D[m][n];
    }

    // Count Dearrangements - Recursion and DP
    public static int countDerangements(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1); // Initialize dp array with -1
        return countDerangementsHelper(n);
    }

    private static int countDerangementsHelper(int n) {
        if (n == 0) return 1;
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = (n - 1) * (countDerangementsHelper(n - 1) + countDerangementsHelper(n - 2));
        return dp[n];
    }

    // 0-1 Knapsack Problem - GFG Practice - Time Complexity: O(n*W), Space Complexity: O(W) - Through Recursion and DP
    


}