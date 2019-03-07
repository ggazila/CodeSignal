package intro.diving_deeper;
/*
Find the leftmost digit that occurs in a given string.

Example

For inputString = "var_1__Int", the output should be
firstDigit(inputString) = '1';
For inputString = "q2q-q", the output should be
firstDigit(inputString) = '2';
For inputString = "0ss", the output should be
firstDigit(inputString) = '0'.
 */
public class FirstDigit {
    public static void main(String[] args) {
        String inputString = "var_1__Int";
        System.out.println(firstDigit(inputString));
    }

   private static char firstDigit(String inputString) {
        char[] a = inputString.toCharArray();
       for (char c : a) {
           if (c > 47 && c < 58) return c;
       }
        return '0';
    }
}
