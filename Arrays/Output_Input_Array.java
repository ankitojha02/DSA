package Arrays;

import java.util.Scanner;

public class Output_Input_Array {
    public static void main(String[] args) {
        // int[] arr = {10, 40, 70, 90, 100};
        // //Output
        // for(int i = 0; i<=arr.length-1; i++){
        //     System.out.println(arr[i]);
        // }

        //Input array from user
        // int[] arr = new int[7]; //default value of empty array is 0

        // Scanner sc = new Scanner(System.in);

        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        // // System.out.println(arr[4]);

        // for(int i = 0; i<arr.length; i++){
        //     // System.out.print(arr[i]+ " ");
        //     // System.out.println();
        //     System.out.print(arr[i] * 2); // For doubling the value of elements in an array
        // }


        // Question : Take array as input from the user and print negative numbers only
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }


    }
}
