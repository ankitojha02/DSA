package Bubble_Selection_Insertion_Sort;

public class Bubble_Sort {
    public static void main(String[] args) {
        // Bubble Sort : An algorithm that sorts array - Swap adjacent elements

        // int[] arr = { 5, -2, 6, 7, 2, 0, 7, 2, 0, 0 };
        int[] arr = {7,3,4,7,8,1};
        int n = arr.length;

        print(arr);

        // Bubble sorting in ascending order
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isSorted = false;
                }
            }

            // If no swaps happened → already sorted
            if (isSorted)
                break;
        }


        // Bubble sorting in descending order
        // for(int i=0; i<n-1; i++){
        //     boolean isSorted = true;
        //     for(int j=0; j<n-1-i; j++){
        //         if(arr[j]<arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //             isSorted = false;
        //         }
        //     }

        //     if(isSorted == true){
        //         break;
        //     }
        // }

        // Move all zeros to end
        // for(int i=0; i<n-1; i++){
        //     boolean isSorted = true;
        //     for(int j=0; j<n-1-i; j++){
        //               if(arr[j]==0 && arr[j+1] != 0){
        //                 int temp = arr[j];
        //                 arr[j] = arr[j+1];
        //                 arr[j+1] = temp;

        //                 isSorted = false;
        //               }
        //     }
        //     if (isSorted == true) {
        //         break;
        //     }
        // }

        System.out.println();
        print(arr);
    }

    //Best case time complexity : O(n)

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
