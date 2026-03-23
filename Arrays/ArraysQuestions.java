package Arrays;

import java.util.Scanner;

public class ArraysQuestions {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
    }

    // Multiply odd indexed elements by 2 and add 10 to even indexed elements
    // public static void print(int[] arr){
    // for(int i =0; i<arr.length; i++){
    // if(i%2==0){
    // System.out.print(arr[i] + 10 + " ");
    // }
    // else{
    // System.out.print(arr[i] * 2 + " ");
    // }
    // }
    // }

    // Search whether the given number present in an array or not
    // public static void print(int[] arr) {
    //     System.out.println("Enter the number you want to search");
    //     Scanner sc = new Scanner(System.in);
    //     int number = sc.nextInt();

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == number) {
    //             System.out.print("Yes this number is present in the array" + "  " + arr[i]);
    //         }

    //     }
    // }

    //Product of Array

    public static void print(int[] arr){
        int product = 1;
        for(int i=0; i<arr.length; i++){
          product = product * arr[i];
        }
        System.out.println(product);
    }
}
