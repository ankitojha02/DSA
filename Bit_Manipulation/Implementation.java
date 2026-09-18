package Bit_Manipulation;

public class Implementation {
    public static void main(String[] arge) {
        // Bitwise AND - Bitwise OR - Bitwise XOR (Exclusive OR)
        System.out.println("Bitwise AND: " + (51 & 42));
        System.out.println("Bitwise OR: " + (51 | 42));
        System.out.println("Bitwise XOR: " + (51 ^ 42));


    }

    // LeetCode 136 - Single Number
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
