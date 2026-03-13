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
       

        //  
        
        // Printing left perpendicular right angle triangle of stars
        // for(int i = 1; i<=rows; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        //Printing A/n AB/n ABC/n ABCD/n

        // for(int i = 1; i<=rows; i++){
        //     for(int j= 1; j<=i; j++){
        //         System.out.print((char)(j+64) + " ");
        //     }
        //     System.out.println();
        // }

        //Printing A/n BB/n CCC/n DDDD/n
        // int k = 65;
        // for(int i = 1; i<=rows; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print((char)k + " ");
        //     }
        //     System.out.println();
        //     k++;
        // }
        
        
        //Printing : 1/n AB/n 2/n ABC/n 1234
        for(int i = 1; i <= rows; i++){
           
            
            if(i%2!=0){
                 for(int j =1 ; j<= i; j++){
                    System.out.print(j + " ");
                 }
            }

            else{
                for(int j =1; j<=i ; j++){
                    System.out.print((char)(j+64) + " ");
                }
            }
           
            System.out.println();
           
        }
    }
}
