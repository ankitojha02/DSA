package Bubble_Selection_Insertion_Sort;

import java.util.Scanner;
import java.util.Arrays;
public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first array");
        int first_lenght = sc.nextInt();
        System.out.println("Enter the length of the second array");
        int second_length = sc.nextInt();

        int[] first_arr = new int[first_lenght];
        int[] second_arr = new int[second_length];

        System.out.println("Enter the element of first array");
        for(int i=0; i<first_lenght; i++){
            first_arr[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of second array");
         for(int i=0; i<second_length; i++){
            second_arr[i] = sc.nextInt();
        }

        common(first_arr, second_arr);
    }

    public static void common(int[] first_arr, int[] second_arr){
        int i =0, j= 0;
        Arrays.sort(first_arr);
        Arrays.sort(second_arr);

        while(i<first_arr.length && j<second_arr.length){
            if(first_arr[i]<second_arr[j]){
                i++;
            }
            else if(first_arr[i]>second_arr[j]){
                j++;
            }

            else if(first_arr[i] == second_arr[j]){
            
                System.out.print(first_arr[i]+ " ");
                i++;
                j++;
            }

        }
    }
}
