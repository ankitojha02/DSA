package DP;

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

    // Leetcode 198 -  House Robber Problem
    
}
