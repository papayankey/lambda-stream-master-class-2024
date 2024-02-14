package com.github.papayankey;

import java.util.function.UnaryOperator;

public class MyUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<String> greet = msg -> "Hello " + msg;
        String result = greet.apply("Java");

        System.out.println(result);
    }
}
