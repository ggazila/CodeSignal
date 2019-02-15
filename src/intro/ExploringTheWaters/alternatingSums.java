package intro.ExploringTheWaters;

public class alternatingSums {
    public static void main(String[] args) {
        int[] a = {50, 60, 60, 45, 70};
        alternatingSum1(a);

    }
    static int[] alternatingSum1 (int[] a) {
        int[] result = new int[2];

        for (int i = 0; i < a.length;) {
            result[0] += a[i];
            i++;
            if (i == a.length) break;
            result[1] += a[i];
            i++;

        }
//        System.out.println(result[0]);
//        System.out.println(result[1]);

        return result;
    }
}
