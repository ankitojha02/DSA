package TimeSpaceComplexity;

public class tandscomplexity {
    public static void main(String[] args) {
        // Given an array of size n+1 consisting of integers from
        // 1 to n. One of the elements is duplicate in the array.
        // Find that duplicate element.

        // First Approach

        // int[] arr = {5,1,3,4,2,3};

        // for(int i =0; i<arr.length; i++){
        // for(int j = i+1; j<arr.length;j++){
        // if(arr[i]==arr[j])
        // System.out.println("Duplicate element is : " + arr[i]);
        // }
        // }

        // In this approach , the max number of operations to be performed is : 5+4+3+2
        // = 14. We saves space but not time.

        // Second Approach

        // int[] arr = {5,1,6,6,2,3};

        // boolean[] flag = new boolean[arr.length+1];

        // for(int i=0; i<arr.length; i++){
        // int ele = arr[i];
        // if(flag[ele] == true){
        // System.out.println("Duplicate element is : " + ele);
        // }
        // else{
        // flag[ele] = true;
        // }
        // }

        // In this approach, number of operatiions is : 6. We saves time but not space.

        // Third Approach - The best approach

        // int[] arr = {5, 1, 3, 4, 2, 4};

        // int sumNumbers = (arr.length-1) * (arr.length)/2;
        // int sumArray = 0;
        // for(int i =0; i<arr.length; i++){
        // sumArray = sumArray + arr[i];
        // }

        // int duplicate = sumArray - sumNumbers;
        // System.out.println("Duplicate number is : " + duplicate);

        // Total number of operations is : 6 and no need to create new flag array. So,
        // saves time and space both

        // ------ Calculate time complexity ------

        // Question 1
        // for(int i=1; i<=n; i++){ // We can use any number n in place of 6
        // System.out.println("Hello");
        // }

        // Total operations - n times . So time complexity = O(n)

        // Question 2
        // for(int i=1; i<=n; i+=2){
        // System.out.println("Hello");
        // }

        // Total operations : ~ (n/2). So time complexity is O(n/2) ~ O(n) approx
        // Note : O(k.n) = O(n)

        // Question 3
        // for(int i =1; i<n-7; i++){
        // System.out.println("Hello");
        // }

        // Total operations : n-7. So time complexity is O(n-7), i.e., approx. O(n)

        // Question 4
        // for(int i =1; i<=n; i++){
        // System.out.println("Hello");
        // }

        // for(int i=1; i<=n; i++){
        // System.out.println("World");
        // }

        // Total operations : n + n = 2n. So time complexity is O(2n). i.e., O(n)

        // Question 5
        // for(int i=1; i<=n; i++){
        // System.out.println("Hello");
        // }
        // for(int i=1; i<=m; i++){
        // System.out.println("World");
        // }

        // Total operations : n + m. So time complexity is O(m+n)

        // Question 6
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }

        // Total operations : 100. Time complexity : O(100) ~ O(1)

        // All above example of time complexity - O(n) is called Linear time

        // Question 7
        // for(int i =1; i<=n; i++){
        // for(int j = 1; j<=n; j++){
        // System.out.println("Hello");
        // }
        // }

        // Total operations : n * n i.e., O(n square)

        // Question 8
        // for (int i = 1; i < n; i = i * 2) {
        // System.out.println(i);
        // }

        // Total operations : log n. So time complexity : O(log n)

        // Question 9
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         System.out.println(i + " " + j);
        //     }
        // }

        // Total opeartions : n * m. So time complexity : O(n*m)
        
    }
}
