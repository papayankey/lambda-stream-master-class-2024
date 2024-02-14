package com.github.papayankey;

import java.util.function.Predicate;

public class MyPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isOlder = age -> age >= 18;

        boolean res = isOlder.test(19);

        System.out.println(res);
    }
}
