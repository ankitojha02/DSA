package Recursion;

public class Look_Say {
    public static String lookAndSay(int n) {
        if (n == 1) {
            return "1";
        }
       String s = lookAndSay(n - 1);
       String ans = "";
       int i = 0;
       int j = 0;
       while (j < s.length()) {
        if(s.charAt(i) == s.charAt(j)){
            j++;
        } else {
            int freq = j - i;
            ans = ans + freq;
            ans = ans + s.charAt(i);
            i = j;
        }

    }
    int freq = j - i;
            ans = ans + freq;
            ans = ans + s.charAt(i);

    return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        String result = lookAndSay(n);
        System.out.println(result);
    }
}
