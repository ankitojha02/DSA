package Strings;

public class substrings {
    public static void main(String[] args) {
        String name = "Gopi";
        // Print all the substrings of the given string
        int i = 0;
        int n = name.length();

        for (i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(name.substring(i, j));
            }
        }
    }
}
