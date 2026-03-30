package TimeSpaceComplexity;

public class tandscomplexity {
    public static void main(String[] args) {
        // Given an array of size n+1 consisting of integers from 
        // 1 to n. One of the elements is duplicate in the array. 
        // Find that duplicate element.

        // First Approach

        // int[] arr = {5,1,3,4,2,3};

        // for(int i =0; i<arr.length; i++){
        //     for(int j = i+1; j<arr.length;j++){
        //         if(arr[i]==arr[j])
        //         System.out.println("Duplicate element is : " + arr[i]);
        //     }
        // }
        
        // In this approach , the max number of operations to be performed is : 5+4+3+2 = 14


        // Second Approach

        int[] arr = {5,1,6,7,6,2,3};

        boolean[] flag = new boolean[arr.length+1];
        
        for(int i=0; i<arr.length; i++){
            int ele = arr[i];
            if(flag[ele] == true){
                System.out.println("Duplicate element is : " + ele);
            }
            else{
                flag[ele] = true;
            }
        }
    }
}
