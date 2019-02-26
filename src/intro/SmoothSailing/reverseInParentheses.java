package intro.SmoothSailing;
/*
Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

For inputString = "(bar)", the output should be
reverseInParentheses(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
reverseInParentheses(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
reverseInParentheses(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
reverseInParentheses(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
 */

public class reverseInParentheses {
    public static void main(String[] args) {
        String s = "foo(bar)baz";
        System.out.println(reverseInParentheses(s));
    }
    public static String reverseInParentheses(String inputString) {
        String x = inputString.replace("(","-").replace(")","-");
        String[] arr = x.split("-");
        for (int i = 0; i < arr.length; i++) {
            reverse(arr[i]);
        }
        return "fff";
    }

    static String reverse (String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0 ;i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }
}
