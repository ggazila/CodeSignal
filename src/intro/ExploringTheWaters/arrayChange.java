package intro.ExploringTheWaters;

public class arrayChange {
    public static void main(String[] args) {
        int[] a = {2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};
        result(a);
    }

    static int result (int[] inputArray) {
        int count = 0;
        for (int i = 0; i < inputArray.length-1; i++) {
            if (inputArray[i] >= inputArray[i+1]) {
                while (inputArray[i] >= inputArray[i+1]) {
                    inputArray[i + 1] += 1;
                    count++;
                    continue;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
