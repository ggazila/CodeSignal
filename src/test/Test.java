package test;

import java.util.*;

public class Test {
   private String name;
   private int age;

    private Test(String name, int age) {
       // this.name = name;
       // this.age = age;
    }

    public static void main(String[] args) {

        Test smudge = new Test("Smudge", 5);
        System.out.println(smudge.name);
        System.out.println(smudge.age);
    }
}