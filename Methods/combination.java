package Methods;

import java.util.Scanner;

public class combination {

    public static int combination(int n , int r){

        int factorial_n= 1;
     for(int i = 1; i<=n; i++){
       factorial_n = factorial_n * i;
     }

       int factorial_r = 1;
     for(int i = 1; i<=r; i++){
       factorial_r = factorial_r * i;
     }

     int difference = n - r;
     int factorial_diff = 1;
     for(int i = 1; i<=difference; i++){
       factorial_diff = factorial_diff * i;
     }

     int result = factorial_n/(factorial_r * factorial_diff);
     return result;
    }
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of n");
     int n = sc.nextInt();
     System.out.println("Enter the value of r");
     int r = sc.nextInt();

     System.out.println(combination(n, r));
    }
}
