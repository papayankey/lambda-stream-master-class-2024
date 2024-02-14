package com.github.papayankey;

import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {
        record Person(String name, int age) {}

        Predicate<Person> isOlder = person -> person.age() >= 18;
        Predicate<Person> nameGreaterThan3 = person -> person.name().length() > 3;

        Predicate<Person> isolderAndNameGreaterThan3 = person -> isOlder.test(person) ||
                nameGreaterThan3.test(person);

        boolean res = isolderAndNameGreaterThan3.test(new Person("J", 20));

        System.out.println(res);

        Predicate<Person> _isOlder = person -> person.age() >= 18;
        Predicate<Person> _nameGreaterThan3 = person -> person.name().length() > 3;

        Predicate<Person> _isolderAndNameGreaterThan3 = _isOlder.or(_nameGreaterThan3);

        boolean res1 = _isolderAndNameGreaterThan3.test(new Person("J", 20));

        System.out.println(res1);
    }
}
