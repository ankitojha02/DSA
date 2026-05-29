package Recursion;

public class Tower_of_Hanoi {
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "A", "C", "B");
    }
    public static void towerOfHanoi(int n, String source, String destination, String helper){
        if(n == 0){
            return;
        }
        towerOfHanoi(n-1, source, helper, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n-1, helper, destination, source);
    }

    // Hw : Look and Say
}
