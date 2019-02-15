package intro.SmoothSailing;

public class reverseInParentheses {
    public static void main(String[] args) {
        String s = "foo(bar)baz";
        reverseInParentheses(s);
        System.out.println(reverseInParentheses(s));
    }
    static String reverseInParentheses(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while(str.indexOf("(") != -1){
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
        }
        return str.toString();
        //

    }
}
