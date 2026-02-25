package Uses;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // System.out.println("Enter radius");
        // Scanner sc = new Scanner(System.in);
        // double r = sc.nextDouble();
        // double a = 3.14 * r * r;
        // System.out.println(a);

        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sqaure = number * number;
        System.out.println("Sqaure of number " + number + " is: " + sqaure);
    }
}
