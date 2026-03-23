package Arrays;
import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] arr = {12, 78, 28, 93};
        print(arr);
        Arrays.sort(arr); //Built-in method to sort array in ascending order
        print(arr);
    }

    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
