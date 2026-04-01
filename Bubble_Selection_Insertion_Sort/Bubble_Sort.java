package Bubble_Selection_Insertion_Sort;

public class Bubble_Sort {
    public static void main(String[] args) {
        // Bubble Sort : An algorithm that sorts array - Swap adjacent elements

        int[] arr= {5, -2, 6,7, 2, 0, 7 , 2};
        int n = arr.length;

        print(arr);

        for(int j = 0; j<n-1; j++){
            for(int i=0; i<n-1; i++){
                if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                }
            }
        }
        System.out.println();
        print(arr);
    }

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
