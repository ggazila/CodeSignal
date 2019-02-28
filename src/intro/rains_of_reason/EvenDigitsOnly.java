package intro.rains_of_reason;
/*
Check if all digits of the given integer are even.

Example

For n = 248622, the output should be
evenDigitsOnly(n) = true;
For n = 642386, the output should be
evenDigitsOnly(n) = false.
 */
public class EvenDigitsOnly {
   private static boolean evenDigitsOnly(int n) {
        while (n > 0) {
          int k =  n % 10;
          if (k % 2 != 0) {
              return false;
          }
          n = n / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 248622;
        //noinspection ResultOfMethodCallIgnored
        evenDigitsOnly(n);
    }
}
