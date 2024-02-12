package com.github.papayankey;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class PredicateTest {
    /**
     * Create a Predicate which takes a number and returns true if number is greater
     * than 18 otherwise returns false.
     */
    @Test
    void Predicate01() {
        int MINIMUM_AGE = 18;
        int input = 19;

        // FixMe: Create Predicate here
        Predicate<Integer> canVote = age -> age >= MINIMUM_AGE;

        boolean result = canVote.test(input);

        assertThat(result).isTrue();
    }

    /**
     * Create a Predicate which takes list of numbers and returns true if all numbers
     * are odd otherwise returns false.
     */
    @Test
    void Predicate02() {
        List<Integer> input = List.of(1, 3, 5, 2, 4);

        // FixMe: Create Predicate here

        boolean result = allEven.test(input);

        assertThat(result).isFalse();
    }
}
