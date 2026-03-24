package Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {5,8,2,6,9};

        //Syntax
        for(int ele : arr){ //element in array 
            System.out.println(ele);
        } 
        // We can't update element in an array using for each loop as it makes the copy of that array
   
        
    }
}
