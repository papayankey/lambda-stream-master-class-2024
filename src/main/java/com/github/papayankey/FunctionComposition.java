package com.github.papayankey;

import java.util.function.Function;

public class FunctionComposition {
    public static void main(String[] args) {
        Function<String, String> a1 = name -> "Hello " + name;
        Function<String, Integer> a2 = str -> str.length();

        Function<String, Integer> a1Anda2 = msg -> a2.apply(a1.apply(msg));

        Integer res = a1Anda2.apply("John");

        System.out.println(res);

        Function<String, Integer> _a1Anda2 = a1.andThen(a2);
        Integer res1 = _a1Anda2.apply("John");

        System.out.println(res1);

        Function<String, Integer> __a1Anda2 = a2.compose(a1);

        Integer res2 = __a1Anda2.apply("John");

        Function<String, String> fn = Function.identity();

        String res3 = fn.apply("Paul");

        System.out.println(res3);

    }
}
