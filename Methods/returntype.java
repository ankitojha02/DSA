package Methods;

public class returntype {

    public static int square(int a){ //Not void
      return a * a; //return means finish line of that method
    }
    public static void main(String[] args) {
        System.out.println(square(5));

        //Note in java if we use if condition in any other method with return value , there must be else statement which also return some values
    }
}
