package Bubble_Selection_Insertion_Sort;

public class Selection_Sorting {
    public static void main(String[] args) {
        int[] arr = { 8, -9, 0, 6, 3, 5, -8 };

        print(arr);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    public static void print(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;

        }
    }
}
