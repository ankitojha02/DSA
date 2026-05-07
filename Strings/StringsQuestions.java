package Strings;

import java.util.Arrays;
public class StringsQuestions {
    public static void main(String[] args) {
        // Question 1: Change the string depending on the first letter of the string. If the first letter is  in lowercase then change entire string to lowercase and if the first letter is in uppercase then change entire string to uppercase.
        // String str = "Satyarth is a good boy";
        // if (Character.isUpperCase(str.charAt(0))) {
        //     System.out.println(str.toUpperCase());
        // } else {
        //     System.out.println(str.toLowerCase());  
        // }

        // Anagram: An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, "listen" and "silent" are anagrams of each other.
        StringBuilder sb1 = new StringBuilder("listen");
        StringBuilder sb2 = new StringBuilder("silent");
              
        int s1 = sb1.length();
        int s2 = sb2.length();

        if (s1 != s2) {
            System.out.println("Not an Anagram");
        } else {
            char[] c1 = sb1.toString().toCharArray();
            char[] c2 = sb2.toString().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if (Arrays.equals(c1, c2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        }
       
    }
}
