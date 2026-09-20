package Bit_Manipulation;

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
   
}
