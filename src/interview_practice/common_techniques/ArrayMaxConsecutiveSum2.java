package interview_practice.common_techniques;
/*
Given an array of integers, find the maximum possible sum you can get from one of its contiguous subarrays.
The subarray from which this sum comes must contain at least 1 element.

Example

For inputArray = [-2, 2, 5, -11, 6], the output should be
arrayMaxConsecutiveSum2(inputArray) = 7.

The contiguous subarray that gives the maximum possible sum is [2, 5], with a sum of 7.
 */
public class ArrayMaxConsecutiveSum2 {
    public static void main(String[] args) {
        int[] a = {-2, -3,-2};
        ArrayMaxConsecutiveSum2 s = new ArrayMaxConsecutiveSum2();
        s.arrayMaxConsecutiveSum2(a);
    }
    int arrayMaxConsecutiveSum2(int[] inputArray) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i; j < inputArray.length; j++) {
                sum += inputArray[j];
                if (sum > max) {
                    max = sum;
                }
            }
            sum = 0;
        }
        System.out.println(max);
        return max;
    }
}
