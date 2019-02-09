/*
Ticket numbers usually consist of an even number of digits.
A ticket number is considered lucky if the sum of the first half of the digits is
equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

*/

package intro.SmoothSailing;


public class StartIsLuky {
    public static void main(String[] args) {
     int num = 1230;
     System.out.println(isLuky(num));
    }

    private static boolean isLuky(int n) {
        String s = Integer.toString(n);
        int length = s.length();
        String p1 = s.substring(0, length/2);
        String p2 = s.substring(length/2, length);
        int sum1 = 0;
        int sum2 = 0;
        int onePart = Integer.valueOf(p1);
        int twoPart = Integer.valueOf(p2);

        while (onePart > 0) {
            sum1 += onePart % 10;
            onePart /=10;
        }

        while (twoPart > 0) {
            sum2 += twoPart % 10;
            twoPart /=10;
        }

        if (sum1 == sum2) {
            return true;
        }

        return false;
    }
}

