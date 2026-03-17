package Methods;

public class Passbyvalue_Passbyreference {

    public static void change(int x){
        x = 10;  //This x is local for only change method
    }
    public static void main(String[] args) {
        int x = 6; //This x is only for main method
        System.out.println(x);
        change(x);
        System.out.println(x); // Output: 6/n 6
    }
}
