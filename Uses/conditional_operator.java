package Uses;

import java.util.Scanner;

public class conditional_operator {
    public static void main(String[] args) {
        // System.out.println("Enter cost price");
        // Scanner sc = new Scanner(System.in);
        // double cp = sc.nextDouble();
        // System.out.println("Enter selling price");
        // double sp = sc.nextDouble();
        // double result;

        // if (n%2==0) {
        //     System.out.println("The number you entered is even number");
        // }
        // else{
        //     System.out.println("The number you entered is odd number");
        // }
        
        // Absolute value
        // if (n < 0) {
        //    int result = n * (-1);
        //     System.out.println("Absolute value of the number is : " + " " + result);
        // }
        // else{
        //     System.out.println("Absolute value of the number is : " + n) ;
        // }


        // Check whether the number is perfect interger or in decimal
        // if (n<0) {
        //     n = -n;
        // }
        // // Typecasting : Convert floating value into integer value
        // int x = (int)n;
        

        // if(n-x > 0){
        //    System.out.println("The number you entered is decimal");
        // }
        // else{
        //     System.out.println("The number you entered is perfect integer");
        // }

        //If cost price and selling price of an item is input 
        //through the keyboard, write a program to determine whether 
        //the seller has made profit or incurred loss or no profit
        //no loss. Also determine how much profit he made or loss
        //he incurred.

        // if (cp==sp) {
        //     System.out.println("No profit , no loss");
        // }
        // if(cp>sp){
        //     result = cp - sp;
        //     System.out.println("You made a loss of : " + result);
        // }
        // else{
        //     result = sp-cp;
        //     System.out.println("You made a profit of : " + result);
        // }

        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        System.out.println("Enter third number");
        double c = sc.nextDouble();

        if (a+b>c && a+c>b && b+c>a ) {
            System.out.println("This can be the sides of triangle");
        }
        else{
            System.out.println("These numbers not form sides of the triangle");
        }
        // if (num > 0 && num > 999 && num < 10000) {
        //     System.out.println("The number you entered is four digit number");
        // }
        // else if(num<0){
        //     System.out.println("Give only positive integer");
        // }
        // else{
        //     System.out.println("It is not the four digit number");
        // }

    }
}
