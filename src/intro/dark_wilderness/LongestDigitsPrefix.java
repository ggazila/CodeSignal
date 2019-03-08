package intro.dark_wilderness;
/*
Given a string, output its longest prefix which contains only digits.

Example

For inputString = "123aa1", the output should be
longestDigitsPrefix(inputString) = "123".
 */
public class LongestDigitsPrefix {
    public static void main(String[] args) {
        String a = "123aa1";
        System.out.println(longestDigitsPrefix(a));
    }

    private static String longestDigitsPrefix(String inputString) {
//        if (inputString.charAt(0) < 47 && inputString.charAt(0) > 58) {
//            return "";
//        }
        String myString = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) > 47 && inputString.charAt(i) < 58) {
                myString += inputString.charAt(i);
            } else {
                break;
            }
        }
        return myString;
    }
}

