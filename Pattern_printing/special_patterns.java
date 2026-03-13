package Pattern_printing;

import java.util.Scanner;

public class special_patterns {
    public static void main(String[] args) {
        System.out.println("Enter number of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //Hollow rectangle
        for(int i =1 ; i<=rows; i++){
            if(i == 1 || i == rows){
              for(int j = 1; j<=cols; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
            }

            else{
                for(int j = 1; j<=cols;j++){
                    if(j==1 || j == cols){
                         System.out.print("*" + " ");
                        
                    }
                    else{
                       System.out.print(" " + " ");
                    }
                }
                System.out.println();
            }
            
        }
    }
}
