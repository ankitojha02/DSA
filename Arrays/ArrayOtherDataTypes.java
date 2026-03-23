package Arrays;

public class ArrayOtherDataTypes {
    public static void main(String[] args) {
        // String x = "Arpit is a bad boy";
       
        //String data type array
        // String[] arr = {"Abhinav", "Ayush", "Sneh", "Hero"};

        // for(int i= 0; i<arr.length; i++){
        //     System.out.print(arr[i]+ " ");
        // }

        int[] x = {10,3,29,38};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

       
    }

     public static void change(int[] x){ //For arrays, the reference(address) is passed as value
            x[2] = 99;
        }



}
