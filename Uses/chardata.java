package Uses;

public class chardata {
    public static void main(String[] args) {
        //String data type : Use double quotes ""
        String a = "Ankit";
        System.out.println(a);

        //char data type : Use only single quote ''
        char b = 'b';
        System.out.println(b);

        //type casting - implicit
        int x = b;
        System.out.println(x);

        //type casting - explicit
        int y = (int)b;
        System.out.println(y);

        //char + int/double = int/double
        System.out.println(b+0);

       //Integer to character
       int g = 97;
       char res = (char)g;
       System.out.println(res);
    }
}
