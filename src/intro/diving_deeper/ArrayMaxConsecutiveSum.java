package intro.diving_deeper;
/*
Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Example

For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
arrayMaxConsecutiveSum(inputArray, k) = 8.
All possible sums of 2 consecutive elements are:

2 + 3 = 5;
3 + 5 = 8;
5 + 1 = 6;
1 + 6 = 7.
Thus, the answer is 8.

 */
public class ArrayMaxConsecutiveSum {
    public static void main(String[] args) {
        int[] inputArray = {1, 3, 2, 4};
        int k = 3;
        System.out.println(arrayMaxConsecutiveSum(inputArray,k));
    }

   private static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int s = 0;
        int ma;
        for(int i = 0; i < k; i++) s += inputArray[i];
        ma = s;
        for(int i = k; i < inputArray.length; i++) {
            s += inputArray[i] - inputArray[i - k];
            ma = Math.max(ma, s);
        }
        return ma;

    }
}
