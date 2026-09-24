package Bit_Manipulation;
import java.util.ArrayList;
import java.util.List;

public class Implementation {
    public static void main(String[] arge) {
        // Bitwise AND - Bitwise OR - Bitwise XOR (Exclusive OR)
        System.out.println("Bitwise AND: " + (51 & 42));
        System.out.println("Bitwise OR: " + (51 | 42));
        System.out.println("Bitwise XOR: " + (51 ^ 42));

        // 1s Complement - 2s Complement

        int num = 5;
        int onesComplement = ~num; // 1s complement
        int twosComplement = ~num + 1; // 2s complement
        System.out.println("1s Complement of " + num + ": " + onesComplement);
        System.out.println("2s Complement of " + num + ": " + twosComplement);

        // byte
        byte b = 127; // Maximum value for byte
        System.out.println("Byte value: " + b);
        b += 1; // Overflow, wraps around to -128
        System.out.println("Byte value after overflow: " + b); // Output: -128
    }

    // LeetCode 136 - Single Number
    // 0 ^ x = x 
    // x ^ x = 0
    
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) { // 0 ^ x = x
            result ^= num;
        }
        return result;
    }

    // Swap two numbers without using a temporary variable
    public void swap(int a, int b) {
        a = a ^ b; // Step 1: a now becomes a XOR b
        b = a ^ b; // Step 2: b becomes original a
        a = a ^ b; // Step 3: a becomes original b
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Byte range: (-128 to 127) or (-2^7 to 2^7 - 1)
    // int range: (-2^31 to 2^31 - 1) - 4 bytes
    // long range: (-2^63 to 2^63 - 1) - 8 bytes
    // float range: (-3.4028235E38 to 3.4028235E38) - 4 bytes
    // double range: (-1.7976931348623157E308 to 1.7976931348623157E308) - 8 bytes
   
   // LeetCode 231 - Power of Two
   public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0; // A power of two has only one bit set
    }

    // 2's power - Given n - return 2's power of n
    public int powerOfTwo(int n) {
        return 1 << n; // Left shift 1 by n positions
    }

    // K-th bit is set or not - GFG
    public boolean isKthBitSet(int n, int k) {
        return ((n>>k) % 2 == 1);
    }

    // Set the k-th bit of a number - GFG
    public int setKthBit(int n, int k) {
        return (n | (1 << k));
    }

    // Turn off the k-th bit of a number - GFG
    public int turnOffKthBit(int n, int k) {
        return (n & ~(1 << k));
    }

    // Toggle the k-th bit of a number - GFG
    public int toggleKthBit(int n, int k) {
        return (n ^ (1 << k));
    }

    // Rightmost set bit of a number - GFG
    // 1010110 becomes 1010111 - Rightmost set bit
    public int rightmostSetBit(int n) {
        return (n | n + 1);
    }

    // LeetCode 191 - Number of 1 Bits
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1); // Increment count if the least significant bit is 1
            n >>>= 1; // Unsigned right shift to process the next bit
        }
        return count;
    }

    // LeetCode 2220 - Minimum Bit Flips to Convert Number
    public int minFlips(int start, int goal) {
        int xor = start ^ goal; // XOR to find differing bits
        int count = 0;
        while (xor != 0) {
            count += (xor & 1); // Increment count for each differing bit
            xor >>>= 1; // Unsigned right shift to process the next bit
        }
        return count;
    }

    // LeetCode 78 - Subsets
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < (1 << n); i++) { // (1 << n) = 2^n, total number of subsets
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // Check if the j-th bit is set
                    subset.add(nums[j]);        
                }
            }
            result.add(subset);
        }
        return result;
    }

    // LeetCode 190 - Reverse Bits
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Shift result to the left to make space for the next bit
            result |= (n & 1); // Add the least significant bit of n to result
            n >>= 1; // Shift n to the right to process the next bit
        }
        return result;
    }

    // LeetCode 342 - Power of Four
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
    }

    // LeetCode 1486 - XOR Operation in an Array
    // Time Complexity: O(n)
    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= (start + 2 * i); // XOR each element in the array
        }
        return result;
    }

    // LeetCode 861 - Score After Flipping Matrix
    public int matrixScore(int[][] grid) {
        int m = grid.length; // Number of rows
        int n = grid[0].length; // Number of columns
        // Step 1: Ensure the first column has all 1s
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] ^= 1; // Flip the entire row
                }
            }
        }
        // Step 2: For each remaining column, maximize the number of 1s
        for (int j = 1; j < n; j++) {
            int count = 0;
            for (int i = 0; i < m; i++) {
                count += grid[i][j];
            }
            if (count < m - count) {
                for (int i = 0; i < m; i++) {
                    grid[i][j] ^= 1; // Flip the column
                }
            }
        }
        // Step 3: Calculate the final score
        int score = 0;
        for (int i = 0; i < m; i++) {
            int rowScore = 0;
            for (int j = 0; j < n; j++) {
                rowScore |= (grid[i][j] << (n - 1 - j));
            }
            score += rowScore;
        }
        return score;
    }

    // LeetCode 260 - Single Number III

}