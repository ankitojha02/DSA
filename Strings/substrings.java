package Strings;

public class substrings {
    public static void main(String[] args) {
        // String name = "Gopi";
        // // Print all the substrings of the given string
        // int i = 0;
        // int n = name.length();

        // for (i = 0; i < n; i++) {
        //     for (int j = i + 1; j <= n; j++) {
        //         System.out.print(name.substring(i, j) + " ");
        //     }
        //     System.out.println();
        // }

        // How to change some letters in the string
        // String name = "radkika";
        // String newName = name.substring(0, 3) + "h" + name.substring(4);
        // System.out.println(newName);

        // String Comparison
        String s1 = "Ankit";
        String s2 = new String("Ankit");

        System.out.println(s1.equals(s2)); // it will compare the content of the string and return true
        System.out.println(s1 == s2); // it will compare the reference of the string and return false because s1 and s2 are two different objects in the memory


    }
}
