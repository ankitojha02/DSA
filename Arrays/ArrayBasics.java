package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] x = {6, 19, 7, 69, 9, 171, 5};
        //Indexing
        //int x[] = {1,2,4}; old syntax
        //Updating element
        System.out.println(x[2]);
        x[2] = 67;
         System.out.println(x[2]);

        //To print all elements in an array
        for(int i = 0; i<=x.length-1; i++){
            System.out.println(x[i]);
        }
    }
}
