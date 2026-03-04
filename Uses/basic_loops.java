package Uses;

import java.util.Scanner;

public class basic_loops {
    public static void main(String[] args) {
        //Basic printing from 1 to 10
        // for(int i = 1; i<=10; i++){
        //     System.out.println(i);
        // }

        //Printing my name 'n' times in loops
        // System.out.println("Enter your name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println();
        // for(int i = 1; i<=5; i++){
        //     System.out.println(name);
        // }

        // for(int i = 1; i<=10; i++){
        //     if (i%2==0) {
        //         System.out.println(i);
        //     }
        // }

        //Printing the table of 17
        // int a = 17;
        // int result;
        // for (int i = 1; i <= 10; i++) {
        //     result = a*i;
        //     System.out.println(result);
        // }

        //Print all odd numbers divisible by 3 from 1 to 100
        // for(int i = 1; i<=100; i++){
        //     if (i%2!=0) {
        //         if (i%3==0) {
        //             System.out.println(i);
        //         }
        //     }
        // }

        //Display this AP : 2,5,8,11,.....upto i terms

        // int n=2;
       

        // for(int i = 1; i<=10; i++){
        //   System.out.println(n);
        //   n=n+3;
        // }
        
        //Print this series - 99, 95, 91, 87, ...upto all terms which are positive
        // int a = 99;
        // int d = -4;
        
        // for(int i = a; i>=0; ){
        //     System.out.println(i);
        //     i = i + d;
        // }
        // Display this GP - 1,2,4,8,....upto 'n' terms
        // int a = 1;
        // int r = 2;

        // for(int i = 1; i<=10; i++ ){
        //     System.out.print(a + " ");
        //     a = a * r;
        // }

        // System.out.println("Enter your number");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int i = 1; i<=50; i++){
        //     System.out.println(i);
        //     System.out.println(n);
        //     n = n -1;
        // }
        
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factors = 0;
        
        for(int i = 1; i<=n; i++){
            if (n%i==0) {
                factors=factors +1;
            }
        }

        if (n <= 1) {
    System.out.println("Neither prime nor composite");
}
        else if (factors==2) {
            System.out.println("Prime number");
        }
        else{
            System.out.println("Composite number");
        }


    }
}
