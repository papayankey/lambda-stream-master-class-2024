package com.github.papayankey;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodReferenceTest {
    /**
     * Create a Method Reference which returns the length of a string.
     */
    @Test
    void MethodReference01() {
        // FixME: Create Method Reference here
        Function<String, Integer> lengthOfString = String::length;

        int result = lengthOfString.apply("Java");

        assertThat(result).isEqualTo(4);
    }
}
