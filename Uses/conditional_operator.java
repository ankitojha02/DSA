package Uses;

import java.util.Scanner;

public class conditional_operator {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%2==0) {
            System.out.println("The number you entered is even number");
        }
        else{
            System.out.println("The number you entered is odd number");
        }
    }
}
