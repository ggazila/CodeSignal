package intro.SmoothSailing;

public class reverseInParentheses {
    public static void main(String[] args) {
        String s = "foo(bar)baz";
        reverseInParentheses(s);
       // System.out.println(s);
    }
    static String reverseInParentheses(String inputString) {
        String newInput = inputString.replace("(", "").replace(")","");
        String result = new StringBuffer(newInput).reverse().toString();
        System.out.println(result);
        return result;
    }
}
