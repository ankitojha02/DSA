package Bubble_Selection_Insertion_Sort;

public class Array_Sorting_Basic {
    public static void main(String[] args) {
        // Check whether the given array is sorted or not

        int[] arr = {90, 90, 100, 100, 140, 230};

        boolean flag = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]> arr[i+1]){
                flag = false;
            }
            
        }
        System.out.println(flag ? "Array is sorted" : "Array is not sorted");

    }
}
