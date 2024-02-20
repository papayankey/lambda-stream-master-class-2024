package com.github.papayankey;

import java.util.function.Consumer;

public class MyConsumer {
    public static void main(String[] args) {
        Consumer<String> print = msg -> System.out.println(msg);

        print.accept("Hello");
    }
}
