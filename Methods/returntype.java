package Methods;

public class returntype {

    public static int square(int a){ //Not void
      return a * a;
    }
    public static void main(String[] args) {
        System.out.println(square(5));
    }
}
