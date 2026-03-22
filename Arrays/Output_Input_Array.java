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
        // Scanner sc = new Scanner(System.in);

        // int[] arr = new int[5];
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] < 0){
        //         System.out.print(arr[i] + " ");
        //     }
        // }
   
        //You can also take array lenght as input from the user using Scanner class


        //Print sum of elements of the array
        // int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        System.out.println("Enter elements of an array");
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // for(int i = 0; i<arr.length; i++){
        //     sum = sum + arr[i];
        // }
        // System.out.println("Sum of the given array is: " + sum);

        //Print the maximum element of an array
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
          max= Math.max(max, arr[i]);
         
        }
        
       System.out.println(max);
    }
}
