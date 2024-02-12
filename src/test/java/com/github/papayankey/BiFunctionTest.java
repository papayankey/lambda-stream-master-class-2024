package com.github.papayankey;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import static org.assertj.core.api.Assertions.assertThat;

public class BiFunctionTest {
    /**
     * Create a BiFunction which takes a name and an age and returns a Person.
     */
    @Test
    void BiFunctionTest01() {
        record Person(String name, int age) {
        }

        // FixME: Create BiFunction here
        BiFunction<String, Integer, Person> createPerson = (name, age) -> new Person(name, age);

        Person result = createPerson.apply("Matilda South", 23);

        assertThat(result).isInstanceOf(Person.class);
    }

    /**
     * Create a BiFunction which takes a list of character string and a list of numbers
     * and returns a combination of the two.
     */
    @Test
    void BiFunctionTest02() {
        List<String> characters = List.of("a", "b", "c");
        List<Integer> numbers = List.of(1, 2, 3);

        // FixME: Create BiFunction here
        BiFunction<List<String>, List<Integer>, List<String>> zip = (c, n) -> {
            List<String> output = new ArrayList<>();
            for (int i = 0; i < c.size(); i++) {
                output.add(c.get(i) + n.get(i));
            }
            return output;
        };

        List<String> result = zip.apply(characters, numbers);

        assertThat(result).containsExactly("a1", "b2", "c3");
    }
}
