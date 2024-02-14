package com.github.papayankey;

import java.util.function.Supplier;

public class MySupplier {
    public static void main(String[] args) {
        Supplier<String> greet = () -> "Hello";

        String res = greet.get();

        System.out.println(res);
        System.out.println(res);
        System.out.println(res);
    }
}
