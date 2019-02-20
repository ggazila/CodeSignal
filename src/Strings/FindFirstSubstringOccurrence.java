package Strings;

public class FindFirstSubstringOccurrence {
    public static void main(String[] args) {
      String s = "CodefightsIsAwesome";
      String x = "IA";
      findFirstSubstringOccurrence(s,x);
    }
    static int findFirstSubstringOccurrence(String s, String x) {
        int xl = x.length(), s1 = s.length(), i, j;
        int [] t = new int[xl];
        for(i = 1, j = 0; i < xl; i++)
            t[i] = j = (x.charAt(i) == x.charAt(j)) ? j + 1 : 0;
        for(i = 0, j = 0; i < s1; ) {
            if (s.charAt(i) == x.charAt(j)) {
                i++;
                j++;
            }
            if (j == xl)
                return i - j;
            else if (i < s1 && s.charAt(i) != x.charAt(j)) {
                if (j != 0)
                    j = t[j - 1];
                else
                    i++;
            }
        }
        return -1;

    }
}
