package intro.rains_of_reason;

import java.util.Arrays;

/*
Given a string, replace each of its character by the next one in the English alphabet
(z would be replaced by a).

Example

For inputString = "crazy", the output should be
alphabeticShift(inputString) = "dsbaz".
 */
public class AlphabeticShift {
   static String alphabeticShift(String inputString) {
       char[] ch = inputString.toCharArray();
       for (int i = 0; i < ch.length; i++) {
           ch[i]++;
           if (ch[i] > 'z') ch[i] = 'a';
       }
       return new String(ch);
    }

    public static void main(String[] args) {
        String inputString = "crazy";
        alphabeticShift(inputString);
    }
}
