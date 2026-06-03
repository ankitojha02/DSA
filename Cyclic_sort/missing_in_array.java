package Cyclic_sort;

public class missing_in_array {
    public static void main(String[] args) {
        //missing in array - using cyclic sort
        int[] arr = {5, 2, 4, 8, 3, 7, 1};
        System.out.println("Missing number: " + missingNumber(arr));

    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        return arr.length;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
