import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        LinkedList<Integer> arr = new LinkedList<>();
        arrList(a);
        //linkArr(arr);
    }

    private static void arrList(ArrayList a) {
        System.out.println(a.size());
        System.out.println(a.isEmpty());

        boolean add = a.add(5);

        System.out.println("\n" + a.size());
        System.out.println(a.isEmpty());

        a.clear();

        System.out.println("\n" + a.size());
        System.out.println(a.isEmpty());

        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            b.add(i);
        }

        a.addAll(b);

        System.out.println("\n" + a.size());
        System.out.println(a.isEmpty());

        System.out.println(a.contains(4));

        System.out.println(a.get(0));

        System.out.println(a.toString());
    }

}