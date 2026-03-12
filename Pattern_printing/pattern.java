package Pattern_printing;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        // System.out.println("Enter the number of columns");
        // int cols = sc.nextInt();
        
        //Stars rectangle
        // for(int i = 1; i<=rows; i++){ // Kitni line hogi
        //     for(int j = 1; j<=cols; j++){ // Har line me kitne stars honge
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        
        /*Printing : 123
                     123
                     123

        */
        // for(int i =1 ; i<=rows ; i++){
        //     for(int j = 1; j<=rows; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        

        //Alphabets rectangle
        //  for(int i =1 ; i<=rows ; i++){
        //     int k = 65;
        //     for(int j = 1; j<=rows; j++){
                
        //         System.out.print((char)k + " ");
        //         k= k + 1;
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=rows;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }
}
