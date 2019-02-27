package interview_practice.common_techniques;

import java.util.HashMap;

/*
You have two integer arrays, a and b, and an integer target value v.
Determine whether there is a pair of numbers, where one number is taken from a and the other from b,
that can be added together to get a sum of v. Return true if such a pair exists, otherwise return false.

Example

For a = [1, 2, 3], b = [10, 20, 30, 40], and v = 42, the output should be
sumOfTwo(a, b, v) = true.


 */
public class SumOfTwo {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {10,20,30,40};
        int v = 42;
        SumOfTwo sol = new SumOfTwo();
        sol.result(a,b,v);
    }

    boolean result(int[] a, int[] b, int v) {
        int aL = a.length;
        int bL = b.length;

        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        for (int i = 0; i < b.length; i++) {
            s.put(b[i], 0);
        }

        for (int i = 0; i < a.length; i++) {
            if (s.containsKey(v - a[i])) return true;
        }
        return false;
    }
}
