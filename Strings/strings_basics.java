package Strings;

import java.util.Scanner;

public class strings_basics {
    public static void main(String[] args) {
        String s1 = "Satyarth is a good boy";
        System.out.println(s1);

        // String Methods - Built in functions in String class
        // System.out.println(name.length());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.startsWith("Sat"));
        // System.out.println(name.endsWith("th"));
        // System.out.println(name.charAt(0));
        // System.out.println(name.indexOf("a"));

        // for (int i = 0; i < name.length(); i++) {
        //     System.out.print(name.charAt(i) + " ");
        // }

        // System.out.println("Enter your sentence");

        // Scanner sc = new Scanner(System.in);
        // String str = sc.next(); // it will take only the first word as input, if we want to take the entire line as input then we have to use nextLine() method

        // System.out.println("Enter 2nd sentence");
        // String str2 = sc.nextLine(); // it will take the entire line as input

        // System.out.println(str);
        // System.out.println(str2);


        // Count the number of vowels in the string
        // String str = name.toLowerCase();
        // int count = 0;
        // for (int i = 0; i<str.length(); i++){
        //     if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
        //         count++;
        //     }
        // }

        // System.out.println(count);

        // Palindrome String
        // String str = "madam";
        // int i = 0;
        // int j = str.length() - 1;
        // boolean isPalindrome = true;

        // while(i < j) {
        //     if(str.charAt(i) != str.charAt(j)) {
        //         isPalindrome = false;
        //         break;
        //     }
        //     i++;
        //     j--;
        // }
        // System.out.println(isPalindrome);

        // Passing string to method : Pass by value
        // String str = "Satyarth";
        // // changeName(str);
        // System.out.println(str); // it will print "Satyarth" because strings are immutable
        
        // Concatenation of strings
        // String FirstName = "Ankit";
        // String LastName = "Ojha";
        // String FullName = FirstName + " " + LastName; // Concatenation of strings
        // System.out.println(FullName);
        // System.out.println(FirstName.concat(" ").concat(LastName)); // Concatenation of strings using concat() method
         
        // Concatenation of string and integer
        int a = 10;
        String str = "The value of a is: " + a; // Concatenation of string and integer
        System.out.println(str);
        
        System.out.println("ankit" + 10 + 20); // it will print "ankit1020" because the concatenation of string and integer is done from left to right
        System.out.println(10 + 20 + "ankit"); // it will print "30ankit" because the addition of integers is done first and then concatenation of string and integer
        System.out.println('A' + 10); // it will print 75 because the ASCII value of 'A' is 65 and 65 + 10 = 75
        
        int b = 20;
        String  w = Integer.toString(b); // it will convert the integer to string
        System.out.println(w + 10); // it will print "2010" because the concatenation of string and integer is done from left to right

        // String to charaecter array
        String name = "Satyarth";
        char[] charArray = name.toCharArray(); // it will convert the string to character array
        for (char c : charArray) {
            System.out.print(c + " ");  
        }
    }
}
