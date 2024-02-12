package com.github.papayankey;

import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.assertj.core.api.Assertions.assertThat;

public class UnaryOperatorTest {
    /**
     * Create a UnaryOperator which takes an integer and returns the square.
     */
    @Test
    void UnaryOperator01() {
        // FixMe: Create UnaryOperator here

        int result = square.apply(2);

        assertThat(result).isEqualTo(4);
    }
}
