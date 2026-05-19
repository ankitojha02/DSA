package Recursion;

import java.util.Scanner;

public class Basics_recursion {

    // static int n;
    public static void main(String[] args) {
        // print(5);

        Scanner sc = new Scanner(System.in);
    //    int n= sc.nextInt();
        int a = sc.nextInt();
        // int b = sc.nextInt();
        // print(n);

        // System.out.println(power(a,b));
        // System.out.println(reverse(a, 0));
        //   System.out.println(gcd(a, b));

        // System.out.println(fibo(a));

        // System.out.println(stairs(a));
        System.out.println(unique(a, a));
    }

//    public static void print(int n) {
//        if(n==0){
//         return;
//        }
//        System.out.println(n);

//        print(n-1);

//     }
    
// Method 1 : Printing from 1 to n using recursion
    // public static void print(int i, int n){
    //     if(i>n){
    //         return;
    //     }
    //     System.out.println(i);
    //     print(i+1, n);
    // }

// Method 2 : Printing from 1 to n using recursion
    // public static void print(int i){
    //     if(i>n){
    //         return;
    //     }
    //     System.out.println(i);
    //     print(i+1);
        
    // }

// Method 3 : Printing from 1 to n using recursion
    // public static void print(int i){
    //     if(i==0){
    //         return;
    //     }
    //      print(i-1);
    //     System.out.println(i);
       
        
    // }

    // public static int factorial(int n){
    //     if(n==0 || n==1){
    //         return 1;
    //     }
       
    //     return n * factorial(n-1);
    // }

    // 'a' raise to power 'b' using recursion

    // public static int power(int a, int b){
    //     if(b==0){
    //         return 1;
    //     }
    //     return a * power(a, b-1);
    // }

    // Optimized way to calculate 'a' raise to power 'b' using recursion
    // public static int power(int a, int b){
    //     if(b==0){
    //         return 1;
    //     }
    //     int halfPower = power(a, b/2);
    //     int fullPower = halfPower * halfPower;

    //     if(b%2!=0){
    //         fullPower *= a;
    //     }
    //     return fullPower;
    // }

    // Reverse a number using recursion
    // public static int reverse(int n, int rev){
    // if(n==0){
    // return rev; 
    // }
    // int rem = n%10;
    // rev = rev*10 + rem;
    // return reverse(n/10, rev);

    // Sum of natural numbers using recursion
    // public static int sum(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     return n + sum(n-1);
    // }

    // GCD of two numbers using recursion
    // public static int gcd(int a, int b){
    //     if(b==0){
    //         return a;
    //     }
    //     return gcd(b, a%b);
    // }
    
    //   public static int fibo(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     return fibo(n-1) + fibo(n-2);
    // }

    // Ways to climb stairs using recursion - Time complexity - O(2^n)
    // public static int stairs(int n){
    //     if(n==2|| n==1){
    //         return n;   
    //     }
    //     return stairs(n-1) + stairs(n-2);
    // }

    // Unique paths - Time complexity - O(2^n)
    // public static int unique(int m, int n) {
    //     if (m == 1 || n == 1) {
    //         return 1;
    //     }
    //     return unique(m - 1, n) + unique(m, n - 1);
    // }

    //Method 2 : Unique paths - Helper method - Time complexity -  O(2^n)
    public static int unique(int m, int n) {
        return helper(m, n, 0, 0);  
    }
    public static int helper(int m, int n, int i, int j) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (i >= m || j >= n) {
            return 0;
        }
        int right = helper(m, n, i, j + 1);
        int down = helper(m, n, i + 1, j);
        return right + down;
    }
   

}

