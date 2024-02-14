package com.github.papayankey;

import java.util.function.Consumer;

public class MyConsumer {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        print.accept("Hello");
    }
}
