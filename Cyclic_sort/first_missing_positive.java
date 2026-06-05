package Cyclic_sort;

public class first_missing_positive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First missing positive: " + firstMissingPositive(arr));
    }
    // Time complexity: O(n)
    // Space complexity: O(1)
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // Place each number in its correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        // If all positions are filled correctly, the missing integer is n + 1
        return n + 1;
    }
}
