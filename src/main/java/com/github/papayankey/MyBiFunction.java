package com.github.papayankey;

import java.util.function.BiFunction;

public class MyBiFunction {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> display = (name, age) ->
                "Your name is " + name + " and you are " + age + " years old";

        String res = display.apply("Paul", 23);

        System.out.println(res);
    }
}
