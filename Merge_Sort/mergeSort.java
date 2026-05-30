package Merge_Sort;

public class mergeSort {
    public static void main(String[] args) {
       int[] arr = {38, 27, 43, 3, 9, 82, 10};
       mergeSort(arr);

       for(int i : arr) {
           System.out.print(i + " ");
       }
    }

    // Time Complexity: O(n log n) - due to the divide and conquer approach
    // Space Complexity: O(n) - due to the temporary arrays used for merging arrays
    public static void mergeSort(int[] arr) {
        int n = arr.length;

        // Base case: If the array has less than 2 elements, it's already sorted
        if (n < 2) {
            return;
        }
        // Step 1: Divide the array into two halves
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Step 2: Copy the elements into the two halves
        int idx = 0;
        for(int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for(int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }
        // Step 3: Recursively sort the two halves
        mergeSort(a);
        mergeSort(b);
        // Step 4: Merge the sorted halves
        merge(arr, a, b);
    }

    private static void merge(int[] arr, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }
        while (i < a.length) {
            arr[k++] = a[i++];
        }
        while (j < b.length) {
            arr[k++] = b[j++];
        }
    }
}
