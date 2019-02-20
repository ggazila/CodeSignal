package intro.IslandOfKnowledge;
/*
Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
 */
public class ArrayMaximalAdjacentDifference {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 0};
        int fi = result(arr);
        System.out.println(fi);
    }

    static int result(int[] inputArray) {
        int tmp = 0;
        int max = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] < inputArray[i + 1]) {
                tmp = inputArray[i + 1] - inputArray[i];
            } else {
                tmp = inputArray[i] - inputArray[i + 1];
            }
            if (tmp > max) max = tmp;
        }
        return max;
    }

}
