package Recursion;

public class count_collision_monkey {
    public static final long MOD = 1000000007;
    public static void main(String[] args) {
        int n = 5; // number of vertices
        long ways = power(2, n);

        long collisionWays = (ways - 2 + MOD) % MOD; // C(ways, 2)
        System.out.println("Number of ways for monkeys to collide: " + collisionWays);
    }

    private static long power(long base, int exp) {
        if (exp == 0) {
            return 1;
        }
        long half = power(base, exp / 2);
        long result = (half * half) % MOD;
        if (exp % 2 != 0) {
            result = (result * base) % MOD;
        }
        return result;
    }
}
