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
        // StringBuilder sb1 = new StringBuilder("listen");
        // StringBuilder sb2 = new StringBuilder("silent");
              
        // int s1 = sb1.length();
        // int s2 = sb2.length();

        // if (s1 != s2) {
        //     System.out.println("Not an Anagram");
        // } else {
        //     char[] c1 = sb1.toString().toCharArray();
        //     char[] c2 = sb2.toString().toCharArray();

        //     Arrays.sort(c1);
        //     Arrays.sort(c2);

        //     if (Arrays.equals(c1, c2)) {
        //         System.out.println("Anagram");
        //     } else {
        //         System.out.println("Not an Anagram");
        //     }
        // }
       

        // Most frequent character in a string: Given a string, find the most frequent character in the string. For example, in the string "hello world", the most frequent character is 'l' because it appears 3 times.
        String str = "hello world";
        // int[] freq = new int[256]; // Assuming ASCII character set

        // for (int i = 0; i < str.length(); i++) {
        //     freq[str.charAt(i)]++;
        // }

        // char mostFrequentChar = 0;
        // int maxFreq = 0;

        // for (int i = 0; i < 256; i++) {
        //     if (freq[i] > maxFreq) {
        //         maxFreq = freq[i];
        //         mostFrequentChar = (char) i;
        //     }
        // }

        // System.out.println("Most frequent character: " + mostFrequentChar);
        // System.out.println("Frequency: " + maxFreq);

        // sliding window technique
        int n = str.length();
        int maxFreq = -1;
        char ans = str.charAt(0);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int i = 0, j = 0;
        while (j < n) {
            if(arr[i] == arr[j]){
                j++;
            }
            else{
                int freq = j - i;
                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j - i;
        if(freq > maxFreq){
            maxFreq = freq;
            ans = arr[i];
        }
        System.out.println("Most frequent character: " + ans);
        System.out.println("Frequency: " + maxFreq);

    }
}
