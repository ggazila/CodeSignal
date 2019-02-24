package challenges;
/*
Given a string, find the number of pairs of equal characters in neighbouring positions.

Example

For inputString = "abacaba", the output should be
countNeighbouringPairs(inputString) = 0;
For inputString = "aaa", the output should be
countNeighbouringPairs(inputString) = 2.
 */
public class CountNeighbouringPairs {
    public static void main(String[] args) {
        String s = "aabaa";
        System.out.println(result(s));
    }

    static int result (String inputString) {
        int count = 0;
        for (int i = 0; i < inputString.length()-1; i++) {
            if (inputString.charAt(i) == inputString.charAt(i+1)) {
                count++;
            }
        }
        return count;
    }
}
