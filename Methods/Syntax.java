package Methods;

public class Syntax {

    // public static void ankit(){
    //    //Body
    //    System.out.println("Hello world"); //Note : You can't call main method inside any other method
    // }

    public static void sum(int a, int b){ // a and b is called parameters
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        // System.out.println("Welcome");
        // ankit(); //Method call
        // System.out.println("This is Ankit Ojha");
        // ankit();

        // for(int i = 1; i<=5; i++){
        //     ankit();
        // }

        sum(5,9); // here 5 and 9 are arguments
    }
}
