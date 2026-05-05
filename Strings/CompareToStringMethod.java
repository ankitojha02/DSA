package Strings;

public class CompareToStringMethod {
    public static void main(String[] args) {
        String s1 = "Satyarth";
        String s2 = "Satyarth";
        String s3 = new String("Satyarth");
        String s4 = "Ankit";

        // CompareTo() method - It is used to compare two strings lexicographically. It returns a positive integer if the first string is greater than the second string, a negative integer if the first string is less than the second string, and 0 if both strings are equal.

        System.out.println(s1.compareTo(s2)); // 0
        System.out.println(s1.compareTo(s3)); // 0
        System.out.println(s1.compareTo(s4)); // positive integer
        System.out.println(s4.compareTo(s1)); // negative integer
        
    }
}
