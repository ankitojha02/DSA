package Pattern_printing;

import java.util.Scanner;

public class special_patterns {
    public static void main(String[] args) {
        System.out.println("Enter number of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        //int cols = sc.nextInt();

        // Hollow rectangle
        // for(int i =1 ; i<=rows; i++){
        // if(i == 1 || i == rows){
        // for(int j = 1; j<=cols; j++){
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // else{
        // for(int j = 1; j<=cols;j++){
        // if(j==1 || j == cols){
        // System.out.print("*" + " ");

        // }
        // else{
        // System.out.print(" " + " ");
        // }
        // }
        // System.out.println();
        // }

        // }

        // Alternative method
        // for(int i = 1; i<=rows; i++){
        // for(int j = 1; j<=cols; j++){
        // if(i == 1 || i == rows || j == 1 || j == cols){
        // System.out.print("* ");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Printing plus with stars

        // for (int i = 1; i <= rows; i++) {
        //   for(int j = 1; j<=rows; j++){
        //     if( i == (rows/2 + 1) || j == (rows/2 +1)){
        //         System.out.print("* ");
        //     }
        //     else{
        //         System.out.print("  ");
        //     }
        //   }
        //   System.out.println();
        // }

        // Printing stars cross

        // for(int i = 1; i<=rows; i++){
        //     for(int j = 1; j<=rows; j++){
        //         if( i==j || i+j==rows+1){
        //             System.out.print("* ");
        //         }
        //        else{
        //         System.out.print("  ");
        //        }
        //     }
            
        //     System.out.println();
        // }

        //Printing Floyd's triangle pattern : 1/n 23/n 456/n 78910/n
        // int k = 1;
        // for(int i = 1; i<=rows ; i++){
        //     for(int j =1 ; j<=i; j++){
        //         System.out.print(k + " ");
        //         k++;
        //     }
        //     System.out.println();
        // }

        //Printing Binary Triangle : 1/n 01/n 101/n 0101/n
        // for(int i=1; i<=rows; i++){
           
        //     for(int j = 1; j<=i; j++){
        //         if(i % 2==0 && j%2!=0 || j%2==0 && i%2!=0){ // Print 0 if i + j == odd
        //         System.out.print("0 ");
        //     }
        //     else{
        //         System.out.print("1 ");
        //     }
        //     }
        //     System.out.println();
        // }

        //Printing Odd number triangle : 1/n 13/n 135/n 1357/n
        
        // for(int i = 1; i<=rows; i++){
        //     int k = 1;
        //     for(int j = 1; j<=i ; j++){
        //        System.out.print(k + " ");
        //         k = k+2;
        //     }
           
        //     System.out.println();
        // }

        //Printing star triangle vertically flipped

        // for(int i = 1; i<=rows; i++){
        //     for(int j = 1; j<=i; j++){
        //         if((i + j)>rows){
        //     System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        

        // for(int i = 1; i<=rows; i++){
        //     for(int j = 1; j<=rows; j++){
        //          if((i + j)>rows){
        //     System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Alternative method : Best method or template
        // for(int i = 1; i<=rows ; i++){
        //     for(int j= 1; j<=rows-i; j++ ){
        //         System.out.print("  ");
        //     }
        //     for(int j= 1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Printing vertically flipped 1/n 12/n 123/n 1234/n
         for(int i =1; i<=rows; i++){
            for(int j = 1; j<=rows-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
         }
    }
}
