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
        
        // In this approach , the max number of operations to be performed is : 5+4+3+2 = 14. We saves space but not time.


        // Second Approach

        // int[] arr = {5,1,6,6,2,3};

        // boolean[] flag = new boolean[arr.length+1];
        
        // for(int i=0; i<arr.length; i++){
        //     int ele = arr[i];
        //     if(flag[ele] == true){
        //         System.out.println("Duplicate element is : " + ele);
        //     }
        //     else{
        //         flag[ele] = true;
        //     }
        // }

        //In this approach, number of operatiions is : 6. We saves time but not space. 

        // Third Approach - The best approach

        // int[] arr = {5, 1, 3, 4, 2, 4};

        // int sumNumbers = (arr.length-1) * (arr.length)/2;
        // int sumArray = 0;
        // for(int i =0; i<arr.length; i++){
        //     sumArray = sumArray + arr[i];
        // }

        // int duplicate = sumArray - sumNumbers;
        // System.out.println("Duplicate number is : " + duplicate);

        // Total number of operations is : 6 and no need to create new flag array. So, saves time and space both


        // ------ Calculate time complexity ------

        // Question 1
        // for(int i=1; i<=n; i++){ // We can use any number n in place of 6
        //     System.out.println("Hello");
        // }

        // Total operations - n times . So time complexity = O(n)

        // Question 2
        // for(int i=1; i<=n; i+=2){
        //     System.out.println("Hello");
        // }

        // Total operations : ~ (n/2). So time complexity is O(n/2) ~ O(n) approx 
        // Note : O(k.n) = O(n)

        // Question 3
        // for(int i =1; i<n-7; i++){
        //     System.out.println("Hello");
        // }

        // Total operations : n-7
    }
}
