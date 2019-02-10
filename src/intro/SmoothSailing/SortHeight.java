package intro.SmoothSailing;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortHeight {
    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        sortByHeight(a);
        System.out.println(a[2]);
    }

    public static int[] sortByHeight(int[] a) {
        int bufer = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j] && a[i] != -1 && a[j] != -1) {
                    bufer = a[i];
                    a[i] = a[j];
                    a[j] = bufer;
                }
            }
        }
        return a;
    }
}
