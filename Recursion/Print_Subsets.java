package Recursion;

public class Print_Subsets {
    public static void main(String[] args) {
        String s = "abc";
        subsets(s, 0, "");
    }
    public static void subsets(String s, int idx, String curr){
        if(idx == s.length()){
            System.out.println(curr);
            return;
        }

        // Include the current character
        subsets(s, idx+1, curr + s.charAt(idx));

        // Exclude the current character
        subsets(s, idx+1, curr);
    }
}
