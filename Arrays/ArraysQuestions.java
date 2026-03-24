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
    // System.out.println("Enter the number you want to search");
    // Scanner sc = new Scanner(System.in);
    // int number = sc.nextInt();

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == number) {
    // System.out.print("Yes this number is present in the array" + " " + arr[i]);
    // break;
    // }

    // }
    // }

    // Product of Array

    // public static void print(int[] arr){
    // int product = 1;
    // for(int i=0; i<arr.length; i++){
    // product = product * arr[i];
    // }
    // System.out.println(product);
    // }

    // Two sum
    // public static void print(int[] arr){
    // int target = 16;
    // boolean achieved = false;
    // for(int i = 0; i<arr.length; i++){
    // for(int j=i+1; j<arr.length; j++){
    // if(arr[i] + arr[j] == target ){
    // System.out.println("The target is achieved by two numbers: " + arr[i] + " and
    // " + arr[j] + " at index: " + i + " and " + j);
    // achieved = true;

    // }
    // if(achieved == true){
    // break;
    // }

    // }
    // }

    // if(achieved == false){
    // System.out.println("Target not achieved");
    // }
    // }

    // Print the second maximum element in the array

    // public static void print(int[] arr){
    //     int max = Integer.MIN_VALUE;
    //      int secondMax = Integer.MIN_VALUE;
    //     for(int i = 0; i<arr.length; i++){
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }
    //     }
       
    //     for(int i = 0; i<arr.length; i++){
    //         if(arr[i] != max ){
    //            if(arr[i]>secondMax){
    //             secondMax = arr[i];
    //            }
    //         }
    //     }

    //     System.out.println("The second largest element in an array is: "+ secondMax);
    // }

    //reverse of an array
    // public static void print(int[] arr){
    //     int[] arr2 = new int[arr.length];
    //     int limit = 0;
    //     for(int i = arr.length - 1; i>=0; i--){
    //         arr2[limit] = arr[i];
    //         limit++;
    //     }

    //     for(int j = 0; j<arr2.length; j++){
    //         System.out.print(arr2[j] + " ");
    //     }
    // }

    // Alternative way : Best approach , no need to create new array
    public static void print(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        //Print array
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

}
