package Uses;

public class increment_decrement {
    public static void main(String[] args) {
        int ankit = 10;
        // Post increment
       System.out.println(ankit++);
       System.out.println(ankit);
       // Pre increment
       System.out.println(++ankit);

       // Special scenario
       int x = 10;
       int y = x++;
       System.out.println(x+" "+y); // Output : 11 10
    }
}
