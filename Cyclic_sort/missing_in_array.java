package Cyclic_sort;

public class missing_in_array {
    public static void main(String[] args) {
        //missing in array - using cyclic sort
        int[] arr = {5, 2, 4, 8, 3, 7, 1};
        System.out.println("Missing number: " + missingNumber(arr));

    }

   // Cyclic sort is an efficient algorithm for sorting an array of n elements where the elements are in the range from 1 to n. The idea is to place each element at its correct index (i.e., element 1 at index 0, element 2 at index 1, and so on). This way, we can easily identify the missing number by checking which index does not have the correct element.
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Calculate the correct index for the current element
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex); // Swap the current element with the element at its correct index
            } else {
                i++; // Move to the next index if the current element is in the correct position or out of range
            }
        }
        // After the cyclic sort, the missing number will be the index + 1 where the element is not in the correct position
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1; // Return the missing number
            }
        }
        return arr.length + 1; // If all numbers from 1 to n are present, then the missing number is n + 1
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
