package Strings;

public class StringsQuestions {
    public static void main(String[] args) {
        // Question 1: Change the string depending on the first letter of the string. If the first letter is  in lowercase then change entire string to lowercase and if the first letter is in uppercase then change entire string to uppercase.
        String str = "Satyarth is a good boy";
        if (Character.isUpperCase(str.charAt(0))) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());  
        }
    }
}
