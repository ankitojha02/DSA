package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        // int[] x = {6, 19, 7, 69, 9, 171, 5};
        // //Indexing
        // //int x[] = {1,2,4}; old syntax
        // //Updating element
        // System.out.println(x[2]);
        // x[2] = 67;
        //  System.out.println(x[2]);

        // //To print all elements in an array
        // for(int i = 0; i<=x.length-1; i++){
        //     System.out.println(x[i]);
        // }


        //Blank array
        int[] arr = new int[4]; //array of 4 size length
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        
        for(int i = 0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}
