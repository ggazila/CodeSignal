package intro.diving_deeper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given array of integers, remove each kth element from it.

Example

    For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
 */
public class ExtractEachKth {
    public static void main(String[] args) {
        int[] inputArray = {1, 1, 1, 1, 1};
        int k = 1;
        extractEachKth(inputArray,k);
    }

   private static int[] extractEachKth(int[] inputArray, int k) {
        ArrayList<Integer> d = new ArrayList<>();

       for (int i1 : inputArray) {
           d.add(i1);
       }

        for (int i = k-1; i < d.size(); i += k-1) {
            d.remove(i);
        }

        System.out.println(d.toString());

        int[] ff = new int[d.size()];
        for (int i = 0; i < d.size(); i++) {
            ff[i] = d.get(i);
        }
        return ff;
    }
}
