package intro.diving_deeper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Given a string, find the number of different characters in it.

Example

For s = "cabca", the output should be
differentSymbolsNaive(s) = 3.

There are 3 different characters a, b and c.
 */
public class DifferentSymbolsNaive {
    public static void main(String[] args) {
        String s = "cabca";
        System.out.println(differentSymbolsNaive(s));
    }
    private static int differentSymbolsNaive(String s) {
        HashSet<String> a = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            a.add(String.valueOf(s.charAt(i)));
        }
        return a.size();
    }
}
