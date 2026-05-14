package Recursion;

import java.util.Scanner;

public class Basics_recursion {

    // static int n;
    public static void main(String[] args) {
        // print(5);

        Scanner sc = new Scanner(System.in);
    //    int n= sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        // print(n);

        System.out.println(power(a,b));
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

    public static int power(int a, int b){
        if(b==0){
            return 1;
        }
        return a * power(a, b-1);
    }
}
