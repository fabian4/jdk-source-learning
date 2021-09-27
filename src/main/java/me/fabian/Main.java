package me.fabian;

import java.util.HashMap;

/**
 * @author fabian
 * @date 2021-09-19 21:24
 */
public class Main {
    public static void main(String[] args) {
        String s1 = new StringBuilder("he").append("llo").toString();
        System.out.println(s1);
        System.out.println(s1.intern());
        System.out.println(s1.intern() == s1);

        System.out.println("====");

        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2);
        System.out.println(s2.intern());
        System.out.println(s2.intern() == s2);
    }
}
