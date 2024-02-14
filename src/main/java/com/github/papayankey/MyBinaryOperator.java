package com.github.papayankey;

import java.util.function.BinaryOperator;

public class MyBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;

        Integer res = add.apply(1, 2);

        System.out.println(res);
    }
}
