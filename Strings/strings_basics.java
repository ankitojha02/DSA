package Strings;

import java.util.Scanner;

public class strings_basics {
    public static void main(String[] args) {
        String name = "Satyarth is a good boy";
        System.out.println(name);

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
        String str = name.toLowerCase();
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
                count++;
            }
        }

        System.out.println(count);
    }
}
