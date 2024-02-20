package com.github.papayankey;

import java.util.function.Function;

public class MethodReference {
    public static void main(String[] args) {
        record Person(String firstName, String lastName, int age) {
        }

        // Instance method invocation
        Function<Person, Integer> nameLength = Person::age;

        Integer res = nameLength.apply(new Person("Isaac", "South", 12));

        System.out.println(res);
    }
}
