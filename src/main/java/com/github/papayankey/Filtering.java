package com.github.papayankey;

import java.util.List;
import java.util.function.Predicate;

public class Filtering {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 2, 1, 3, 4);

        // filter
        Predicate<Integer> isEven = elem -> elem % 2 == 0;
        integers.stream()
                .filter(isEven)
                .forEach(System.out::println);

        // distinct
        integers.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
