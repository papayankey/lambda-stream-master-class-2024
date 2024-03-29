package com.github.papayankey;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionTest {

    /**
     * Create a Function which takes a string and returns the length of the string.
     */
    @Test
    void Function01() {
        String input = "java";

        // FixMe: Create function here with name `function`

        int result = function.apply(input);

        assertThat(result).isEqualTo(4);
    }

    /**
     * Create a Function which takes a list of numbers and returns a list of even numbers.
     */
    @Test
    void Function02() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6);

        // FixMe: Create Function here

       List<Integer> result = evenNumbers.apply(input);

        assertThat(result).containsExactly(2, 4, 6);
    }

}