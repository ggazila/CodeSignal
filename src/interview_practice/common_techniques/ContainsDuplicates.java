package interview_practice.common_techniques;

import java.util.TreeSet;

/*
Given an array of integers, write a function that determines whether the array contains any duplicates. Your function should return true if any element appears at least twice in the array, and it should return false if every element is distinct.

Example

For a = [1, 2, 3, 1], the output should be
containsDuplicates(a) = true.

There are two 1s in the given array.

For a = [3, 1], the output should be
containsDuplicates(a) = false.

The given array contains no duplicates.
 */
public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] a = {1,2,3,1};
        ContainsDuplicates s = new ContainsDuplicates();
        System.out.println(s.result(a));
    }

    boolean result(int[] a) {
        TreeSet<Integer> arr = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            arr.add(a[i]);
        }

        if (arr.size() != a.length) {
            return true;
        }

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if (a[i] == a[j] && i != j) return true;
//            }
//        }
//        return false;
        return false;
    }
}
