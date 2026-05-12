package Recursion;

import java.util.Scanner;

public class Basics_recursion {
    public static void main(String[] args) {
        // print(5);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        print(1, n);
    }

//    public static void print(int n) {
//        if(n==0){
//         return;
//        }
//        System.out.println(n);

//        print(n-1);

//     }
    
    public static void print(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print(i+1, n);
    }
}
