package Cyclic_sort;

public class duplicate_number {
    public static void main(String[] args) {
        //duplicate number - using cyclic sort
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number: " + findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i];
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
