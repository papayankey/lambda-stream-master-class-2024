package com.github.papayankey;

import java.util.function.Function;

public class MyFunction {
    public static void main(String[] args) {
        Function<String, Integer> lengthOfString = String::length;

        Integer result = lengthOfString.apply("Java");

        System.out.println(result);
    }
}
