package Pattern_printing;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();

        for(int i = 1; i<=rows; i++){ // Kitni line hogi
            for(int j = 1; j<=cols; j++){ // Har line me kitne stars honge
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
