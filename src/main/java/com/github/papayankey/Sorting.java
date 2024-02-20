package com.github.papayankey;

import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 2, 1);

        // sorted
        integers.stream()
                .sorted()
                .forEach(System.out::println);

        record Person(String name, int age){}
        List<Person> people = List.of(new Person("Turntabl", 12), new Person("Java", 7));

        people.stream()
                .sorted(Comparator.comparing(person -> person.name.length()))
                .forEach(System.out::println);
    }
}
