package Cyclic_sort;

public class first_missing_positive {
    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        System.out.println("First missing positive: " + firstMissingPositive(arr));
    }

    // Time complexity: O(n)
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // Place each number in its correct position
        int i = 0;
        while (i < n) {
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
        // Find the first missing positive integer
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        // If all positions are filled correctly, the missing integer is n + 1
        return n + 1;
    }

    // Helper method to swap two elements in the array
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
