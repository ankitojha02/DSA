package Strings;

public class stringbuilders {
    public static void main(String[] args) {
        // StringBuilder is a mutable class in Java, which means that we can change the content of the string without creating a new string in the memory. It is more efficient than String class when we have to perform multiple operations on the string.

        StringBuilder sb = new StringBuilder("Ankit");
        System.out.println(sb);

        sb.append(" Kumar"); // it will add the string at the end of the existing string
        System.out.println(sb);

        sb.insert(6, "Kumar"); // it will insert the string at the specified index
        System.out.println(sb);

        sb.delete(6, 12); // it will delete the string from the specified index to the specified index
        System.out.println(sb);

        sb.reverse(); // it will reverse the string
        System.out.println(sb);

        sb.setCharAt(0, 'o');
        System.out.println(sb);

        sb.replace(0, 3, "ojha"); // it will replace the string from the specified index to the specified index with the new string
        System.out.println(sb);

        
    }
}
