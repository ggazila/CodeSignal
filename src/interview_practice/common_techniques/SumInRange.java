//package InterviewPractice.CommonTechniques;
///*
//You have an array of integers nums and an array queries, where queries[i] is a pair of indices (0-based).
//Find the sum of the elements in nums from the indices at queries[i][0] to queries[i][1] (inclusive) for each query,
//then add all of the sums for all the queries together. Return that number modulo 109 + 7.
//
//Example
//
//For nums = [3, 0, -2, 6, -3, 2] and queries = [[0, 2], [2, 5], [0, 5]], the output should be
//sumInRange(nums, queries) = 10.
//
//The array of results for queries is [1, 3, 6], so the answer is 1 + 3 + 6 = 10.
// */
//public class SumInRange {
//    public static void main(String[] args) {
//        int[] nums = {3,0,-2,6,-3,2};
//        int[][] queries = {{0,2}, {2,5}, {0,5}};
//        SumInRange s = new SumInRange();
//        s.sumInRange(nums, queries);
//    }
//
//    int sumInRange(int[] nums, int[][] queries) {
//        int mod = (int) 1e9 + 7; //создание переменной mod;
//        int[] s = new int[nums.length + 1];                     // создание массива с длиной nums + 1;
//        for(int i = 0; i < nums.length; i++)                    // заполнение массива s элементами (0 + nums[i]
//            s[i + 1] = s[i] + nums[i];
//        long rs = 0;                                            // создание long переменной со значением 0;
//        for(int i = 0; i < queries.length; i++) {               // запуск цикла
//            rs += s[queries[i][1] + 1] - s[queries[i][0]];      // rs = новый цикл[очередь[i][1] + 1] - новый цикл[очередь[i][1]]
//            rs = (rs + mod) % mod;
//        }
//        return (int)((rs + mod) % mod);
//    }
//
//}
