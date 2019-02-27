package interview_practice.common_techniques;

import java.util.Arrays;

/*
You have an unsorted array arr of non-negative integers and a number s.
Find a longest contiguous subarray in arr that has a sum equal to s.
Return two integers that represent its inclusive bounds.
If there are several possible answers, return the one with the smallest left bound.
If there are no answers, return [-1].

Your answer should be 1-based, meaning that the first position of the array is 1 instead of 0.

Example

For s = 12 and arr = [1, 2, 3, 7, 5], the output should be
findLongestSubarrayBySum(s, arr) = [2, 4].

The sum of elements from the 2nd position to the 4th position (1-based) is equal to 12: 2 + 3 + 7.

For s = 15 and arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], the output should be
findLongestSubarrayBySum(s, arr) = [1, 5].

The sum of elements from the 1st position to the 5th position (1-based) is equal to 15: 1 + 2 + 3 + 4 + 5.

For s = 15 and arr = [1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10], the output should be
findLongestSubarrayBySum(s, arr) = [1, 8].

The sum of elements from the 1st position to the 8th position (1-based) is equal to 15: 1 + 2 + 3 + 4 + 5 + 0 + 0 + 0.
 */
public class FindLongestSubarrayBySum {
    public static void main(String[] args) {
        int[] a = {1,2,3,7,5};
        int s = 12;
   //     System.out.println(Arrays.toString(findLongestSubarrayBySum(s,a)));
        System.out.println(Arrays.toString(anotherResult(s,a)));
    }
//    static int[] findLongestSubarrayBySum(int s, int[] arr) {
//        int count = 0;
//        int sum = 0;
//        int maxLenght = 0;
//
//        int[] newArr = new int[2];
//        int[] er = {-1};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                count++;
//                if (sum == s && j - i >= maxLenght) {
//                    if (j - i > 0) maxLenght = j - i;
//                    newArr[0] = i+1;
//                    newArr[1] = j+1;
//                }
//            }
//            count = 0;
//            sum = 0;
//        }
//        if (maxLenght >= 0 && newArr[0] > 0) {
//            return newArr;
//        } else {
//            return er;
//        }
//    }

    static int[] anotherResult(int s, int[] arr) {
        int sum = 0;
        int l = 0;
        int[] a = new int[] {-1};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (l < i && sum > s) {
                sum -= arr[l++];
            }
            if (sum == s && (a.length == 1 || a[1] - a[0] < i - l)) {
                a = new int[] {l + 1, i + 1};
            }
        }
        return a;
    }
}
