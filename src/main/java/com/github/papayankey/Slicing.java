package com.github.papayankey;

import java.util.List;

public class Slicing {
    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 12, 1, 7, 3, 9);

        // takeWhile
        integers.stream()
                .takeWhile(elem -> elem > 7)
                .forEach(System.out::println);

        // dropWhile
        integers.stream()
                .dropWhile(elem -> elem > 7)
                .forEach(System.out::println);

        // skip
        integers.stream()
                .skip(3)
                .forEach(System.out::println);
    }
}
