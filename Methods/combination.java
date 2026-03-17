package Methods;

public class combination {

    public static int combination(int n , int r){

        int factorial_n= 1;
     for(int i = 1; i<=n; i++){
       factorial_n = factorial_n * i;
     }

       int factorial_r = 1;
     for(int i = 1; i<=r; i++){
       factorial_r = factorial_r * i;
     }

     int difference = n - r;
     int factorial_diff = 1;
     for(int i = 1; i<=difference; i++){
       factorial_diff = factorial_diff * i;
     }

     int result = factorial_n/(factorial_r * factorial_diff);
     return result;
    }
    public static void main(String[] args) {
        System.out.println(combination(5, 3));
        System.out.println(combination(7, 3));
    }
}
