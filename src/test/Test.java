package test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> dd =  new ArrayList<>(10);
        dd.add("0");
        dd.add(1,"6");
        dd.remove("0");
        System.out.println(dd.toString());

        List<String> cc = new LinkedList<>();
        cc.add(0,"ddd");
        cc.add("dd");
        System.out.println(cc.toString());

        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(25,"Serhii");
        hashmap.put(28,"Yuliia");
    }
}
