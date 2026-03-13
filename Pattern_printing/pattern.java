package Pattern_printing;

import java.util.Scanner;

import Uses.chardata;

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
        
        //Printing : 1111/n 2222/n 3333/n 4444/n
        // for(int i = 1; i<=rows; i++){
        //     for(int j = 1; j<=rows;j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        //Printing : AAAA/n BBBB/n CCCC/n DDDD/n
        // int a = 65;
        // for(int i = 1; i<=rows; i++){
        //     for(int j = 1; j<=rows; j++){
        //        System.out.print((char)a + " ");
        //     }
        //     System.out.println();
        //     a = a+1;
        // }
        
        // Printing : aaaa/n BBBB/n cccc/n DDDD/n
       

         char ch = 'a';

         for(int i = 1; i<=rows; i++){
            char printChar;

            if (i % 2 ==0) {
                printChar = (char)(ch - 32);// convert to uppercase
            } else{
                printChar = ch;
            }

            for(int j = 1; j<=4; j++){
                System.out.print(printChar + " ");
            }
            System.out.println();
            ch++;
         }

    }
}
