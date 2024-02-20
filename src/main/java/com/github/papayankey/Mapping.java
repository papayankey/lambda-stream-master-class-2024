package com.github.papayankey;

import java.util.List;
import java.util.stream.Stream;

public class Mapping {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);

        // map
        integers.stream()
                .map(elem -> elem * elem);
//                .forEach(System.out::println);

        record Person(String name, int age) {}
        List<Person> people = List.of(new Person("A", 12), new Person("B", 89));

        people.stream()
                .map(person -> person.age());
//                .forEach(System.out::println);

        // flatMap
        integers.stream()
                .flatMap(a -> Stream.of(3, 4, 5).map(b -> a * b))
                .forEach(System.out::println);

        List<List<Integer>> lists = List.of(List.of(1, 2, 3));
        Stream<Integer> integerStream = lists.stream()
                .flatMap(list -> list.stream());

    }
}
