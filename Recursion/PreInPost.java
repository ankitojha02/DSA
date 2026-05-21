package Recursion;

public class PreInPost {
    public static void main(String[] args) {
        int n = 3;
        preInPost(n);
    }
    public static void preInPost(int n){
        if(n == 0){
            return;
        }
        System.out.println("Pre: " + n);
        preInPost(n-1);
        System.out.println("In: " + n);
        preInPost(n-1);
        System.out.println("Post: " + n);
    }
}
