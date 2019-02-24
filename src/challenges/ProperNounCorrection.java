package challenges;
/*
Proper nouns always begin with a capital letter, followed by small letters.

Correct a given proper noun so that it fits this statement.

Example

For noun = "pARiS", the output should be
properNounCorrection(noun) = "Paris";
For noun = "John", the output should be
properNounCorrection(noun) = "John".
 */
public class ProperNounCorrection {
    public static void main(String[] args) {
        String s = "pARiS";
        System.out.println(result(s));
    }

    static String result(String str) {
        String x = str.substring(0,1).toUpperCase();
        String y = str.substring(1,str.length()).toLowerCase();
        return x+y;
    }
}
