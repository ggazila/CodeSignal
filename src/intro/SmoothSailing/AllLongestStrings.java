package intro.SmoothSailing;

import java.util.ArrayList;

public class AllLongestStrings {
        public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        result(inputArray);
    }

    static String[] result(String[] inputArray) {
        int max = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() > max) max = inputArray[i].length();
        }
        System.out.println(max);
        ArrayList<String> newArray = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i].length() == max) {
                newArray.add(inputArray[i]);
                System.out.println(inputArray[i]);
            }
        }
        return newArray.toArray(new String[0]);
    }


}
